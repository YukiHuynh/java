package chapter10.maps;

import java.util.ArrayList;
import java.util.Comparator;

import chapter09.priorityqueue.Entry;


public class SortedTableMap<K, V> extends AbstractSortedMap<K, V> {
	private ArrayList<MapEntry<K, V>> table = new ArrayList<>();
	public SortedTableMap() { super(); }
	SortedTableMap(Comparator<K> comp) { super(comp); }
	
	/** Returns the smallest index for range table[low..high] inclusive storing an entry
	 * 6 with a key greater than or equal to k (or else index high+1, by convention). 
	 * */
	private int findIndex(K key, int low, int high) {
		if(high < low) return high + 1;				// no entry qualifies
		int mid = (low + high) / 2;
		int comp = compare(key, table.get(mid));
		if(comp == 0) {
			return mid;								// found exact match
		} else if(comp < 0) {
			return findIndex(key, low, mid - 1);	// answer is left of mid (or possibly mid)
		} else {
			return findIndex(key, mid + 1, high);	// answer is right of mid
		}
	}
	/** Version of findIndex that searches the entire table */
	private int findIndex(K key) {
		return findIndex(key, 0, table.size() - 1);
	}
	/** Returns the number of entries in the map. */
	public int size() { return table.size(); }
	/** Returns the value associated with the specified key (or else null). */
	public V get(K key) {
		int j = findIndex(key);
		if(j == size() || compare(key, table.get(j)) != 0) return null;		// no match
		return table.get(j).getValue();
	}
	/** Associates the given value with the given key, returning any overridden value. */
	public V put(K key, V value) {
		int j = findIndex(key);
		if(j < size() && compare(key, table.get(j)) == 0) {					// match exists
			return table.get(j).setValue(value);
		}
		table.add(j, new MapEntry<K, V>(key, value));						// otherwise new
		return null;
	}
	/** Removes the entry having key k (if any) and returns its associated value. */
	public V remove(K key) {
		int j = findIndex(key);
		if(j == size() || compare(key, table.get(j)) != 0) return null;		// no match
		return table.remove(j).getValue();
	}
	/** Utility returns the entry at index j, or else null if j is out of bounds. */
	@SuppressWarnings("unchecked")
	private Entry<K, V> safeEntry(int j) {
		if(j < 0 || j >= table.size()) {
			return null;
		}
		return (Entry<K, V>) table.get(j);
	}
	/** Returns the entry having the least key (or null if map is empty). */
	@SuppressWarnings("unchecked")
	public java.util.Map.Entry<K, V> firstEntry() { 
		return (java.util.Map.Entry<K, V>) safeEntry(0);
	}
	/** Returns the entry having the greatest key (or null if map is empty). */
	@SuppressWarnings("unchecked")
	public java.util.Map.Entry<K, V> lastEntry() {
		return (java.util.Map.Entry<K, V>) safeEntry(table.size() - 1);
	}
	/** Returns the entry with least key greater than or equal to given key (if any). */
	@SuppressWarnings("unchecked")
	public java.util.Map.Entry<K, V> ceilingEntry(K key) {
		return (java.util.Map.Entry<K, V>) safeEntry(findIndex(key));
	}
	/** Returns the entry with greatest key less than or equal to given key (if any). */
	@SuppressWarnings("unchecked")
	public java.util.Map.Entry<K, V> floorEntry(K key) {
		int j = findIndex(key);
		if(j == size() || !key.equals(table.get(j).getKey())) {
			j--;		// look one earlier (unless we had found a perfect match)
		}
		return (java.util.Map.Entry<K, V>) safeEntry(j);
	}
	/** Returns the entry with greatest key strictly less than given key (if any). */
	@SuppressWarnings("unchecked")
	public java.util.Map.Entry<K, V> lowerEntry(K key) {
		return (java.util.Map.Entry<K, V>) safeEntry(findIndex(key)-1);		// go strictly before the ceiling entry
	}
	/** Returns the entry with least key strictly greater than given key (if any). */
	@SuppressWarnings("unchecked")
	public java.util.Map.Entry<K, V> higherEntry(K key) {
		int j = findIndex(key);
		if(j < size() && key.equals(table.get(j).getKey())) {
			j++;								// go past exact match
		}
		return (java.util.Map.Entry<K, V>) safeEntry(j);
	}
	
	// support for snapshot iterators for entrySet() and subMap() follow
	@SuppressWarnings("unchecked")
	private Iterable<Entry<K, V>> snapshot(int startIndex, K stop) {
		ArrayList<Entry<K, V>> buffer = new ArrayList<>();
		int j = startIndex;
		while(j < table.size() && (stop == null || compare(stop, table.get(j)) > 0)) {
			buffer.add((Entry<K, V>) table.get(j++));
		}
		return buffer;
	}
	public Iterable<chapter09.priorityqueue.Entry<K, V>> entrySet() {
		return snapshot(0, null);
	}
	public Iterable<java.util.Map.Entry<K, V>> subMap(K fromKey, K toKey) {
		return snapshot(findIndex(fromKey), toKey);
	}
	@Override
	public Iterable<K> setKey() {
		return null;
	}
}
