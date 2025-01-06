package chapter07.list_and_iterator;

import java.util.Iterator;

import chapter07.list_and_iterator.LinkedPositionalList.PositionIterable;

public interface PositionalList<E> extends Iterable<E>{

	int size();
	boolean isEmpty();
	Position<E> first();
	Position<E> last();
	Position<E> before(Position<E> p) throws IllegalArgumentException;
	Position<E> after(Position<E> p) throws IllegalArgumentException;
	Position<E> addFirst(E e);
	Position<E> addLast(E e);
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
	Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
	E set(Position<E> p, E e) throws IllegalArgumentException;
	E remove(Position<E> p) throws IllegalArgumentException;
	public default Iterable<Position<E>> positions() {
		return new Iterable<Position<E>>() {

			@Override
			public Iterator<Position<E>> iterator() {
				return null;
			}
		};
	}
}