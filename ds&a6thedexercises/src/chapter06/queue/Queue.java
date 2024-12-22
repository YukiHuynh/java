package chapter06.queue;

import chapter07.list_and_iterator.Position;

public interface Queue<E> {

	int size();
	boolean isEmpty();
	void enqueue();
	E first();
	E dequeue();
	void enqueue(Position<E> position);
	
}
