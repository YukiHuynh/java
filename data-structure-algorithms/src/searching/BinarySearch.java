package searching;

public class BinarySearch {

	/**
     * Tìm kiếm nhị phân trong mảng đã được sắp xếp.
     * 
     * @param keys Mảng các số đã được sắp xếp.
     * @param x Giá trị cần tìm.
     * @return Vị trí của giá trị, 0 nếu không tìm thấy.
     */
	
	public static int binarySearch(int[] keys, int x) {
		int inf = 0;
		int sup = keys.length -1;
		int mid;
		
		while(inf <= sup) {
			mid = (inf + sup) / 2;
			
			if(keys[mid] == x) {
				return mid;
			}
			if(keys[mid] < x) {
				inf = mid + 1;
			}else {
				sup = mid - 1;
			}
		}
		return 0;
	}
	
}
