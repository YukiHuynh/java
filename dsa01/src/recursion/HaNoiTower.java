package recursion;

import java.util.Scanner;

// non recursion
public class HaNoiTower {

	static final int MAX = 30;
	static final int[][] stack = new int[4][MAX + 1];
	static int[] nd = new int[4];
	static int[][] rotatedList = new int[3][3];
	static int n;
	
	private static void init() {
		for(int i = 0; i <= 3; i++) {
			stack[i][0] = n + 1;
		}
		for(int i = 1; i <= n; i++) {
			stack[1][i] = n + 1 - i;
		}
		nd[1] = n;
		nd[2] = 0;
		nd[3] = 0;
		
		if(n % 2 != 0) {
			rotatedList[0][1] = 1; rotatedList[0][2] = 2;
			rotatedList[1][1] = 1;	rotatedList[1][2] = 3;
			rotatedList[2][1] = 2;	rotatedList[2][2] = 3;
		} else {
			rotatedList[0][1] = 1; rotatedList[0][2] = 3;
			rotatedList[1][1] = 1; rotatedList[1][2] = 2;
			rotatedList[2][1] = 2; rotatedList[2][2] = 3;
		}
	}
	
	private static void displayStatus() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("Peg " + i + ": " + nd[i] + " disks");
		}
	}
	
	private static void moveDisk(int x, int y) {
		if(stack[x][nd[x]] < stack[y][nd[y]]) {
			System.out.println("Move one disk from " + x + " to " + y);
			stack[y][nd[y] + 1] = stack[x][nd[x]];
			nd[y]++;
			nd[x]--;
		} else {
			System.out.println("Move one disk from " + y + " to " + x);
			stack[x][nd[x] + 1] = stack[y][nd[y]];
            nd[x]++;
            nd[y]--;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt(); // Nhập số đĩa

        // Khởi tạo và thực thi giải thuật
        init();
        displayStatus();
        for (int i = 1; i <= (1 << n) - 1; i++) { // 1 shl n - 1 là (2^n - 1)
            moveDisk(rotatedList[(i - 1) % 3][1], rotatedList[(i - 1) % 3][2]);
        }
        displayStatus();

        scanner.close();
	}
	
	
	
}
