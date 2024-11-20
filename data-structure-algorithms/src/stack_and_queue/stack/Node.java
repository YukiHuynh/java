package stack_and_queue.stack;

import java.util.Objects;

public class Node {

	// Node class representing a single node in the linked list
	private int value;
	private Node link;
	
	public Node() {
	}

	public Node(int value, Node link) {
		this.value = value;
		this.link = link;
	}
	
	public Node(int value) {
		this.value = value;
		this.link = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	@Override
	public int hashCode() {
		return Objects.hash(link, value);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Node node = (Node) o;
		return value == node.value && Objects.equals(link, node.link);
	}
	
	@Override
	public String toString() {
		return "Node{" +
                "value=" + value +
                ", link=" + (link != null ? "exists" : "null") +
                '}';
	}
	
}
