package chapter5.recursive;

public class BinarySearch {

	public static void main(String[] args) {
		int[] data = {2, 3, 5, 7, 9, 12, 14, 17, 19, 22, 25, 27, 28, 33, 37};
		System.out.println(binarySearch(data, 22, data[0], data[data.length - 1]));
	}
	
	public static boolean binarySearch(int[] data, int target, int low, int high) {
		if(low > high) {
			return false;
		} else {
			int mid = (low + high) / 2;
			if(target == mid) {
				return true;
			} else if(target < mid) {
				return binarySearch(data, target, low, mid -1);
			} else {
				return binarySearch(data, target, mid + 1, high);
			}
		}
	}
	
}
