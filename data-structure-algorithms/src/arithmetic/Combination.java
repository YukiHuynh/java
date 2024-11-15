package arithmetic;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n (total number of elements):");
		int n = ip.nextInt();
		System.out.println("Enter k (number of element in subset):");
		int k = ip.nextInt();
		ip.close();
		
		int[] x = new int[k];
		
		generateCombination(x, n, k);
		
	}
	
	private static void generateCombination(int[] x, int n, int k) {
	    // Khởi tạo mảng x với giá trị ban đầu là {1, 2, 3, ..., k}
	    for (int i = 0; i < k; i++) {
	        x[i] = i + 1;
	    }

	    // Sinh tất cả các tổ hợp
	    do {
	        // In ra tập con hiện tại
	        System.out.print("{");
	        for (int i = 0; i < k - 1; i++) {
	            System.out.print(x[i] + ", ");
	        }
	        System.out.println(x[k - 1] + "}");

	        // Tìm phần tử cuối cùng có thể tăng
	        int i = k - 1;
	        while (i >= 0 && x[i] == n - k + i + 1) {
	            i--;
	        }

	        // Nếu còn phần tử có thể tăng, cập nhật phần tử đó và các phần tử tiếp theo
	        if (i >= 0) {
	            x[i]++;
	            for (int j = i + 1; j < k; j++) {
	                x[j] = x[j - 1] + 1;
	            }
	        } else {
	            break;  // Khi không còn phần tử nào có thể tăng, kết thúc vòng lặp
	        }
	    } while (true);  // Vòng lặp tiếp tục cho đến khi không thể tạo thêm tổ hợp
	}
	
}
