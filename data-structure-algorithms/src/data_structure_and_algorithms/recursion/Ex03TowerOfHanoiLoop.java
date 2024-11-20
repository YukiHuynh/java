package data_structure_and_algorithms.recursion;

public class Ex03TowerOfHanoiLoop {

	public static void main(String[] args) {
		
		int n = 3;
		solveTowerOfHanoi(n);
		
	}
	
	private static void solveTowerOfHanoi(int n) {
		
		// Tổng số bước di chuyển cần thực hiện 2^n - 1
		int totalMoves = (int) Math.pow(2, n) - 1;
		
		int[] towers = {1, 2, 3}; // Cọc nguồn, cọc trung gian, cọc đích
		int[][] poles = new int[3][n];
		int[] heights = {n, 0, 0}; // Số lượng đĩa hiện tại ở mỗi cọc
		
		// Khởi tạo cọc nguồn với các đĩa
		for(int i = 0; i < n; i++) {
			poles[0][i] = n - i; // Đĩa nhỏ nhất ở trên cùng
		}
		
		 // Hiển thị trạng thái ban đầu
        System.out.println("Trạng thái ban đầu:");
        printPoles(poles, heights);
        
        for(int move = 1; move <= totalMoves; move++) {
        	int from = (move  & move -1) % 3; // Cọc nguồn
        	int to = ((move | move - 1) + 1) % 3; // Cọc đích
        	
        	// Lấy đĩa từ cọc nguồn
        	int disk = poles[from][heights[from] - 1];
        	heights[from]--;
        	
        	// Đặt đĩa vào cọc đích
        	poles[to][heights[to]] = disk;
        	heights[to]++;
        	
        	// In trạng thái
            System.out.println("Bước " + move + ": Chuyển đĩa " + disk + " từ cọc " + towers[from] + " sang cọc " + towers[to]);
            printPoles(poles, heights);
        	
        }
		
	}
	
	private static void printPoles(int[][] poles, int[] heights) {
		for(int i = 0; i < 3; i++) {
			System.out.println("Cọc " + (i + 1) + ": ");
			for(int j = 0; j < heights[i]; j++) {
				System.out.print(poles[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
	}
	
}
