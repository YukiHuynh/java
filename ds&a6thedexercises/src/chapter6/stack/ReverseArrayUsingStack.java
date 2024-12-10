package chapter6.stack;

import java.util.Arrays;

public class ReverseArrayUsingStack {

	public static void main(String[] args) {
		Integer[] a = {4, 8, 15, 16, 23, 42};
		String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
		
		System.out.println("a= " + Arrays.toString(a));
		System.out.println("s= " + Arrays.toString(s));
		System.out.println("Reversing...");
		reverse(a);
		reverse(s);
		
		System.out.println("a= " + Arrays.toString(a));
		System.out.println("s= " + Arrays.toString(s));
		
	}
	
	public static <E> void reverse(E[] array) {
		Stack<E> buffer = new ArrayStack<>(array.length);
		for(int i = 0; i < array.length; i++) {
			buffer.push(array[i]);
		}
		for(int i = 0; i < array.length; i++) {
			array[i] = buffer.pop();
		}
	}
	
}
