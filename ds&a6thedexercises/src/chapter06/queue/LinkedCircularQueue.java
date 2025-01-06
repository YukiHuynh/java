package chapter06.queue;

import chapter03.linked_list.CircularlyLinkedList;
import chapter07.list_and_iterator.Position;

public class LinkedCircularQueue<E> implements CircularQueue<E> {
	
	private CircularlyLinkedList<E> list = new CircularlyLinkedList<>();
	
	public LinkedCircularQueue() {
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enqueue(E element) {
		list.addLast(element);
	}

	@Override
	public E first() {
		return list.first();
	}

	@Override
	public E dequeue() {
		return list.removeFirst();
	}

	@Override
	public void rotate() {
		list.rotate();
	}

	@Override
	public void enqueue() {
	}

	@Override
	public void enqueue(Position<E> position) {
		// TODO Auto-generated method stub
		
	}
	
	

}
