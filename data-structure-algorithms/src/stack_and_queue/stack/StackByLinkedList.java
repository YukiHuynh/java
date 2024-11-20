package stack_and_queue.stack;

public class StackByLinkedList {

	private Node top;
	
	public StackByLinkedList() {
		this.top = null; // Initialize stack as empty
	}
	
	public Node getTop() {
		return top;
	}
	
	// Push a value onto the stack
	public void push(int value) {
		Node newNode = new Node(value, top);	// Create a new node pointing to the current top
		this.top = newNode;	// Update top
	}
	
	// Pop a value from the stack
	public int pop() {
		if(top == null) { // Check if stack is empty
			System.out.println("Stack is empty.");
			return -1; // Default return value for empty stack
		}
		int value = top.getValue(); // Retrieve the value of the top node
		top = top.getLink();	// Update top to the next node
		return value;	// Return the popped value
	}
	
	// Display all elements in the stack
	public void display() {
		if(top == null) {
			System.out.println("Stack is empty.");
			return;
		}
		System.out.print("Stack elements: ");
		Node current = top;
		while(current != null) {
			System.out.print(current.getValue() + " ");
			current = current.getLink();
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Stack: ");
		Node current = top;
		while(current != null) {
			sb.append(current.getValue()).append(" -> ");
			current = current.getLink();
		}
		sb.append("null");
		return sb.toString();
	}
	
}
