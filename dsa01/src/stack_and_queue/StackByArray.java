package stack_and_queue;

import java.util.Scanner;

public class StackByArray {

	static final int MAX = 10000;
	static int[] stack = new int[MAX];
	static int top;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        StackInit();

        // Thử nghiệm các thao tác với Stack
        System.out.println("Thêm các phần tử vào Stack:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Push: " + i);
            push(i); // Thêm các số 1, 2, 3, 4, 5 vào Stack
        }

        System.out.println("\nLấy các phần tử ra khỏi Stack:");
        for (int i = 1; i <= 5; i++) {
            int poppedValue = pop(); // Lấy phần tử từ Stack
            if (poppedValue != -1) {
                System.out.println("Pop: " + poppedValue);
            }
        }

        // Thử lấy phần tử từ Stack rỗng
        System.out.println("\nThử lấy giá trị từ Stack rỗng:");
        pop(); // Gọi Pop khi Stack rỗng

        scanner.close();
	}
	
	public static void StackInit() {
		top = -1;
	}
	
	public static void push(int v) {
		if(top == MAX - 1) {
			System.out.println("Stack is full");
		} else {
			top++;
			stack[top] = v;
		}
	}
	
	public static int pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
            return -1;
		} else {
			int value = stack[top];
			top--;
			return value;
		}
	}
	
}
