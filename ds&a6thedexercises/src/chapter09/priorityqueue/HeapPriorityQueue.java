package chapter09.priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;

import chapter07.list_and_iterator.PositionalList;

/** An implementation of a priority queue using an array-based heap. */
public class HeapPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {
	/** primary collection of priority queue entries */
	protected ArrayList<Entry<K, V>> heap = new ArrayList<>();
	/** Creates an empty priority queue based on the natural ordering of its keys. */
	public HeapPriorityQueue() {
		super();
	}
	/** Creates an empty priority queue using the given comparator to order keys. */
	public HeapPriorityQueue(Comparator<K> comp) {
		super(comp);
	}
	
	/** Creates a priority queue initialized with the given key-value pairs. */
	public HeapPriorityQueue(K[] keys, V[] values) {
		size();
		for(int i = 0; i < Math.min(keys.length, values.length); i++) {
			heap.add(new PQEntry<>(keys[i], values[i]));
		}
		heapify();
	}
	
	/** Performs a bottom-up construction of the heap in linear time. */
	protected void heapify() {
		int startIndex = parent(size()-1);			// start at PARENT of last entry
		for(int i = startIndex; i >= 0; i--) {		// loop until processing the root
			downheap(i);
		}
	}
	
	// protected utilities
	protected int parent(int j) {
		return (j-1)/2;
	}
	protected int left(int j) {
		return 2*j+1;
	}
	protected int right(int j) {
		return 2*j+2;
	}
	protected boolean hasLeft(int j) {
		return left(j) < heap.size();
	}
	protected boolean hasRight(int j) {
		return right(j) < heap.size();
	}
	/** Exchanges the entries at indices i and j of the array list. */
	protected void swap(int i, int j) {
		Entry<K, V> temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	/** Moves the entry at index j higher, if necessary, to restore the heap property. */
	protected void upheap(int j) {
		while(j > 0) {		// continue until reaching root (or break statement)
			int p = parent(j);
			if(compare(heap.get(j), heap.get(p)) >= 0) break;	// heap property verified
			swap(j, p);				// continue from the parent's location
			j = p;
		}
	}
	
	/** Moves the entry at index j lower, if necessary, to restore the heap property. */
	protected void downheap(int j) {
		while(hasLeft(j)) {						// continue to bottom (or break statement)
			int leftIndex = left(j);
			int smallChildIndex = leftIndex;	// although right may be smaller
			if(hasRight(j)) {
				int rightIndex = right(j);
				if(compare(heap.get(leftIndex), heap.get(rightIndex)) > 0) {
					smallChildIndex = rightIndex;	// right child is smaller
				}
			}
			if(compare(heap.get(smallChildIndex), heap.get(j)) >= 0) {
				break;						// heap property has been restored
			}
			swap(j, smallChildIndex);
			j = smallChildIndex;			// continue at position of the child
		}
	}
	
	// public methods
	/** Returns the number of items in the priority queue. */
	public int size() {
		return heap.size();
	}
	/** Returns (but does not remove) an entry with minimal key (if any). */
	public Entry<K, V> min() {
		if(heap.isEmpty()) return null;
		return heap.get(0);
	}
	/** Inserts a key-value pair and returns the entry created. */
	public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
		checkKey(key);				// auxiliary key-checking method (could throw exception)
		Entry<K, V> newest = new PQEntry<>(key, value);
		heap.add(newest);			// add to the end of the list
		upheap(heap.size() - 1);	// upheap newly added entry
		return newest;
	}
	/** Removes and returns an entry with minimal key (if any). */
	public Entry<K, V> removeMin() {
		if(heap.isEmpty()) return null;
		Entry<K, V> answer = heap.get(0);
		swap(0, heap.size()-1);			// put minimum item at the end
		heap.remove(heap.size()-1);		// and remove it from the list;
		downheap(0);					// then fix new root
		return answer;
	}
	
	/** Sorts sequence S, using initially empty priority queue P to produce the order. */
	public static <E> void pqSort(PositionalList<E> S, PriorityQueue<E, ?> P) {
		int n = S.size();
		for(int i = 0; i < n; i++) {
			E element = S.remove(S.first());
			P.insert(element, null);	// element is key; null value
		}
		for(int i = 0; i < n; i++) {
			E element = P.removeMin().getKey();
			S.addLast(element);			// the smallest key in P is next placed in S
		}
	}
}
