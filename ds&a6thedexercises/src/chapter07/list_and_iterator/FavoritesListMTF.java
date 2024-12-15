package chapter07.list_and_iterator;

public class FavoritesListMTF<E> extends FavoritesList<E> {

	/** Moves accessed item at Position p to the front of the list. */
	@Override
	protected void moveUp(Position<Item<E>> p) {
		if(p != list.first()) {
			list.addFirst(list.remove(p));
		}
	}
	
	/** Returns an iterable collection of the k most frequently accessed elements. */
	@SuppressWarnings("unchecked")
	@Override
	public Iterable<E> getFavorite(int k) throws IllegalArgumentException {
		if(k < 0 || k > size()) {
			throw new IllegalArgumentException("Invalid k");
		}
		
		// begin by making a copy of the original list
		PositionalList<Item<E>> temp = new LinkedPositionalList<>();
		for(Item<E> item : list) {
			temp.addLast(item);
		}
		
		// repeated find, report, and remove element with largest count
		PositionalList<E> result = new LinkedPositionalList<>();
		for(int j = 0; j < k; j++) {
			PositionalList<Item<E>> highPos = (PositionalList<Item<E>>) temp.first();
			PositionalList<Item<E>> walk = (PositionalList<Item<E>>) temp.after((Position<Item<E>>) highPos);
			while(walk != null) {
				if(count((Position<Item<E>>) walk) > count((Position<Item<E>>) highPos)) {
					highPos = walk;
				}
				walk = (PositionalList<Item<E>>) temp.after((Position<Item<E>>) walk);
			}
			// we have now found element with highest count
			result.addLast(value((Position<Item<E>>) highPos));
			temp.remove((Position<Item<E>>) highPos);
		}
		return result;
	}
	
}
