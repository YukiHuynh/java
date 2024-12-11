package chapter6.queue;

public interface CircularQueue<E> extends Queue<E>{
	void rotate();

	void enqueue(E e);
}
