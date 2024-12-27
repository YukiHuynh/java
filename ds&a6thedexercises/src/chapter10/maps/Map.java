package chapter10.maps;

import chapter09.priorityqueue.Entry;

public interface Map<K, V> {
	int size();
	boolean isEmpty();
	V get(K key);
	V put(K key, V value);
	V remove(K key);
	Iterable<K> setKey();
	Iterable<V> values();
	Iterable<Entry<K, V>> entrySet();
}
