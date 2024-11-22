package searching;

public class SequentialSearch {

	/**
     * Tìm kiếm tuần tự một giá trị trong mảng.
     * 
     * @param keys Mảng các số
     * @param n    Kích thước của mảng
     * @param x    Giá trị cần tìm
     * @return Vị trí (1-based index) nếu tìm thấy, ngược lại trả về 0.
     */
	
	public static int sequentialSearch(int[] keys, int n, int x) {
		int i = 0;	// Chỉ số bắt đầu từ 0 trong mảng Java
		while(i < n && keys[i] != x) {
			i++;
		}
		
		// Nếu không tìm thấy trả về 0, nếu tìm thấy trả về vị trí (1-based index)
		return (i == n) ? 0 : (i + 1);
	}
	
}
