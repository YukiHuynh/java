package twentybasicexercises;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n: ");
		while (true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if(n > 0) {
					break;
				} else {
					System.out.println("n must be positive");
				}
			} else {
				System.out.println("Invalid input");
				ip.nextLine();
			}
		}
		ip.close();
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Tổng tất cả số chẵn trong khoảng từ 0 - n: " + sum);
	}

}
