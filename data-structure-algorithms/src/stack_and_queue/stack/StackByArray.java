package stack_and_queue.stack;

public class StackByArray {

	private static final int MAX = 10000; // Maximum size of the stack
	private int[] stack;				  // Array to hold stack elements
	private int top;					  // Keeps track of the top of the stack
	
	// Constructor to initialize the stack
	public StackByArray() {
		stack = new int[MAX];	
		top = -1; 				// Empty stack
	}
		
	// Method to push a value onto the stack
	public void push(int value) {	
		if(top == MAX) {	// Check if stack is full
			System.out.println("Stack is full");
		} else {
			stack[++top] = value; // Increment top and insert the value
		}
	}
	
	// Method to pop a value from the stack
	public int pop() {
		if(top == -1) {	// Check if stack is empty
			System.out.println("Stack is empty");
            return -1; // Return a default value
		} else {
			return stack[top--];	// Return the top value and decrement top
		}
	}
	
	// Method to display all elements in the stack
	public void display() {
		if(top == -1) {
			System.out.println("Stack is empty");
		} else {
			System.out.print("Stack elements: ");
			for(int i = 0; i <= top; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}
	
}
