package bean;

public class CircularSinglyLinkedList {
	
	private Node last;
	
	public CircularSinglyLinkedList() {
	}

	public CircularSinglyLinkedList(Node last) {
		this.last = last;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
	
	// Add to end of list
	public void addToEnd(int data) {
		Node newNode = new Node(data);
		if(last == null) { // List is empty
			last = newNode;
			last.setNext(last);
		} else {
			newNode.setNext(last.getNext());
			last.setNext(newNode);
			last = newNode;
		}
	}
	
	// Add to start of list
	public void addToStart(int data) {
		Node newNode = new Node(data);
		if(last == null) { // List is empty
			last = newNode;
			last.setNext(last);
		} else {
			newNode.setNext(last.getNext());
			last.setNext(newNode);
		}
	}
	
	// Remove from start of list
	public void removeFromStart() {
		if(last == null) {
			System.out.println("The list is empty, cannot remove.");
			return;
		}
		if(last.getNext() == last) { // Only one node
			last = null;
		} else {
			last.setNext(last.getNext().getNext());
		}
	}
	
	// Traverse the list
	public void traverse() {
		if(last == null) {
			System.out.println("The list is empty.");
            return;
		}
		
		Node current = last.getNext();
		do {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		} while (current != last.getNext());
		System.out.println();
	}
	
	@Override
	public String toString() {
		if(last == null) {
			return "CircularSinglyLinkedList is empty.";
		}
		
		StringBuilder sb = new StringBuilder();
		Node current = last.getNext();
		do {
			sb.append(current.getData()).append(" -> ");
			current = current.getNext();
		} while(current != last.getNext());
		sb.append("(back to start)");
		return sb.toString();
	}
	
}
