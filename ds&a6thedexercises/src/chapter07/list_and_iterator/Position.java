package chapter07.list_and_iterator;

public interface Position<E> {
	E getElement() throws IllegalStateException;
}
