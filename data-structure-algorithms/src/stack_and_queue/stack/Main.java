package stack_and_queue.stack;

public class Main {

	public static void main(String[] args) {
		
		StackByArray stack = new StackByArray();
		
		// Test pushing values onto the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		
		// Test popping values from the stack
		System.out.println("Popped: " + stack.pop());
		stack.display();
		
		System.out.println("Popped: " + stack.pop());
		stack.display();
		
		System.out.println("Popped: " + stack.pop());
		stack.display();
		
		// Test popping from an empty stack
		System.out.println("Popped: " + stack.pop());
		
		System.out.println("\n=============LinkedList=============\n");
		
		StackByLinkedList byLinkedList = new StackByLinkedList();
		byLinkedList.push(40);
		byLinkedList.push(50);
		byLinkedList.push(60);
		byLinkedList.display();
		
		System.out.println("Popped: " + byLinkedList.pop());
		byLinkedList.display();
		System.out.println(byLinkedList);
		
		System.out.println("Popped: " + byLinkedList.pop());
		byLinkedList.display();
		System.out.println(byLinkedList);
		
		System.out.println("Popped: " + byLinkedList.pop());
		byLinkedList.display();
		System.out.println(byLinkedList);
		
		// Test popping from an empty stack
        System.out.println("Popped: " + byLinkedList.pop());
		
	}
	
}
