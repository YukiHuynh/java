package recursion;

public class TowerOfHaNoi {

	public static void main(String[] args) {
		int n = 10; // Số đĩa (có thể thay đổi)
        
        System.out.println("Giải thuật Tháp Hà Nội cho " + n + " đĩa:");
        move(n, 1, 2);
	}
	
	private static void move(int n, int x, int y) {
		if(n == 1) {
			System.out.println("Chuyển 1 đĩa từ " + x + " sang " + y);
		} else {
			move(n-1, x, 6 - x -y);
			move(1, x, y);
			move(n - 1, 6 - x -y, y);
		}
	}
	
}
