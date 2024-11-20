package data_structure_and_algorithms.list;

import bean.CircularSinglyLinkedList;

public class MainCircularSinglyLinkedList {

	public static void main(String[] args) {
		
		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
		
		// Add elements to the end
		list.addToEnd(10);
		list.addToEnd(20);
		list.addToEnd(30);
		
		// Print the list
		System.out.println("List after adding elements:");
		list.traverse();
		System.out.println(list);
		
		// Add element to the start
		list.addToStart(5);
		System.out.println("List after adding 5 to the start:");
		list.traverse();
		System.out.println(list);
		
		// Remove the first element
		list.removeFromStart();
		System.out.println("List after removing the first element:");
		list.traverse();
		System.out.println(list);
		
	}
	
}
