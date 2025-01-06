package inheritance_2nd_example;

import chapter09.priorityqueue.Entry;
import chapter10.maps.SortedMap;
import chapter10.maps.SortedTableMap;

/** Maintains a database of maximal (cost,performance) pairs. */
public class CostPerformanceDatabase {

	SortedMap<Integer, Integer> map = new SortedTableMap<>();
	/** Constructs an initially empty database. */
	public CostPerformanceDatabase() {};
	/** Returns the (cost,performance) entry with largest cost not exceeding c.
	 * (or null if no entry exist with cost c or less).
	 */
	@SuppressWarnings("unchecked")
	public Entry<Integer, Integer> best(int cost) {
		return (Entry<Integer, Integer>) map.floorEntry(cost);
	}
	/** Add a new entry with given cost c and performance p. */
	@SuppressWarnings("unchecked")
	public void add(int c, int p) {
		Entry<Integer, Integer> other = (Entry<Integer, Integer>) map.floorEntry(c);	// other is at least as cheap
		if(other != null && other.getValue() >= p) {									// if its performance is as good,
			return;																		// (c,p) is dominated, so ignore
		}
		map.put(c, p);																	// else, add (c,p) to database
		// and now remove any entries that are dominated by the new one
		other = (Entry<Integer, Integer>) map.higherEntry(c);							// other is more expensive than c
		while(other != null && other.getValue() <= p) {									// if not better performance
			map.remove(other.getKey());													// remove the other entry
			other = (Entry<Integer, Integer>) map.higherEntry(c);
		}
	}
	
}
