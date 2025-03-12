package recursion;

public class Combination {

	public static void main(String[] args) {
		int n = 5; // Bạn có thể thay đổi giá trị n
        int k = 2; // Bạn có thể thay đổi giá trị k

        if (n >= 0 && k >= 0 && k <= n) {
            System.out.println("C(" + n + ", " + k + ") = " + combination(n, k));
        } else {
            System.out.println("Không hợp lệ: k phải nằm trong khoảng [0, n].");
        }
	}
	
	private static int combination(int n, int k) {
		if(k == 0 || k == n) {
			return 1;
		}
		return combination(n-1, k-1) + combination(n-1, k);
	}
	
}
