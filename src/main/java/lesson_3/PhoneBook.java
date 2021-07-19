package lesson_3;

import java.util.*;

public class PhoneBook<K, V> {

    private final List<K> keys = new ArrayList<>();
    private final List<V> values = new ArrayList<>();

    public void add(K key, V value) {
        keys.add(key);
        values.add(value);
    }

    public List<V> get(K key) {
        List<V> values = new ArrayList<>();
        int count = 0;
        if (!keys.contains(key)) {
            return values;
        }
        for (K keyName : keys) {
            if (keyName.hashCode() == key.hashCode()) {
                if (keyName.equals(key)) {
                    values.add(this.values.get(count));
                }
            }
            count++;
        }
        return values;
    }

    @Override
    public String toString() {
        return "PhoneBook {" +
                " names = " + keys +
                ", phoneNumber = " + values +
                '}';
    }

}
