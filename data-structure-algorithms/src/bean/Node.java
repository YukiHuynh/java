package bean;

import java.util.Objects;

public class Node {
	
	private int data;
	private Node next;
	
	public Node() {
	}
	
	public Node(int data) {
        this.data = data;
    }

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data;
	}

	@Override
	public String toString() {
		return "Node{" + "data=" + data + '}';
	}
	
	// Implement Comparable
	public int compareTo(Node other) {
		return Integer.compare(this.data, other.data);
	}
	
}
