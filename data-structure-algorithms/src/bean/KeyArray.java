package bean;

public class KeyArray {

	// Số lượng khóa trong dãy
	private int n;
	
	// Mảng chứa các khóa
	private TKey[] keys;
	
	public KeyArray() {
	}

	// Constructor để khởi tạo với số lượng khóa n
	public KeyArray(int n) {
		this.n = n;
		this.keys = new TKey[n];
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
		this.keys = new TKey[n];	// Cập nhật mảng khi số lượng thay đổi
	}

	public TKey getKeys(int index) {
		if(index < 0 || index >= n) {
			throw new IndexOutOfBoundsException("Index out of bound");
		}
		return keys[index];
	}
	
	public void setKeys(int index, TKey key) {
		if(index < 0 || index >= n) {
			throw new IndexOutOfBoundsException("Index out of bound");
		}
		keys[index] = key;
	}
	
	// Hàm hiển thị các khóa
	public void displayKeys() {
		for(int i = 0; i <= n; i++) {
			System.out.println("Key " + (i + 1) + ": " + keys[i]);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("KeyArray: ");
		for(TKey key : keys) {
			sb.append(key).append(" ");
		}
		return sb.toString();
	}
	
}
