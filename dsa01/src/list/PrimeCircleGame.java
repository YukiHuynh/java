package list;

import java.util.LinkedList;
import java.util.Scanner;

public class PrimeCircleGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập số người chơi và vị trí bắt đầu
        System.out.print("Nhập số người chơi (n): ");
        int n = scanner.nextInt();
        System.out.print("Nhập vị trí bắt đầu đếm (S): ");
        int s = scanner.nextInt();

        // Xử lý yêu cầu 1: Người cuối cùng còn lại
        int lastRemaining = findLastRemaining(n, s);
        System.out.println("Người cuối cùng còn lại là: " + lastRemaining);

        // Xử lý yêu cầu 2: Người đếm 1 nếu biết người cuối cùng
        System.out.print("Nhập người cuối cùng (k): ");
        int k = scanner.nextInt();
        int startingPerson = findStartingPerson(n, k);
        System.out.println("Người đếm 1 là: " + startingPerson);

        scanner.close();
	}
	
	private static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static int findLastRemaining(int n, int s) {
		LinkedList<Integer> circle = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			circle.add(i);
		}
		
		int currentIndex = s - 1;
		boolean clockWise = true;
		int count = 0;
		
		while(circle.size() > 1) {
			count++;
			if(isPrime(count)) {
				circle.remove(currentIndex);
				clockWise = !clockWise;
				if(clockWise) {
					currentIndex = currentIndex % circle.size();
				} else {
					currentIndex = (currentIndex - 1 + circle.size()) % circle.size();
				}
			} else {
				if(clockWise) {
					currentIndex = (currentIndex + 1) % circle.size();
				} else {
					currentIndex = (currentIndex - 1 + circle.size()) % circle.size();
				}
			}
		}
		return circle.get(0);
	}
	
	private static int findStartingPerson(int n, int lastRemaning) {
		for(int s = 1; s <= n; s++) {
			if(findLastRemaining(n, s) == lastRemaning) {
				return s;
			}
		}
		return -1;
	}
	
}
