package arithmetic;

import java.util.Scanner;

public class BinarySequencesGenerate {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int n = -1;
		while(true) {
			System.out.println("Enter a number: ");
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if(n > 0) {
					break;
				} else {
					System.out.println("Input number have to be possitive!");
				}
			} else {
				System.out.println("invalid input!");
				ip.next();
			}
			
		}
		
		int[] x = new int[n]; // mảng để lưu dãy nhị phân.
		
		ip.close();
		
		generateBinarySequences(x, n);
		
	}
	
	private static void generateBinarySequences(int[] x, int n) {
		boolean finished = false;
		
		while(!finished) {
			for(int bit : x) {
				System.out.print(bit);
			}
			System.out.println();
			
			int i = n - 1;
			while( i >=0 && x[i] == 1) {
				i--;
			}
			
			if(i >= 0) {
				x[i] = 1;
				for(int j = i + 1; j < n; j++) {
					x[j] = 0;
				}
			} else {
				finished = true;
			}
		}
	}
	
}
