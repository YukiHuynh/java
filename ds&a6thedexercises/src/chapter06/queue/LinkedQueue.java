package chapter06.queue;

import chapter03.linked_list.SinglyLinkedList;
import chapter07.list_and_iterator.Position;

public class LinkedQueue<E> implements Queue<E> {
	
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	
	public LinkedQueue() {
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enqueue(E element) {
		list.addLast(element);
	}
	
	public E first() {
		return list.first();
	}
	
	public E dequeue() {
		return list.removeFirst();
	}

	@Override
	public void enqueue() {
	}

	@Override
	public void enqueue(Position<E> position) {
		// TODO Auto-generated method stub
		
	}
	
}
