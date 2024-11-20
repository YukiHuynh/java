package tree.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneralTreeArray {

	private String[] info;	// Mảng Info chứa giá trị của các nút
	private int[] children;	// Mảng Children chứa chỉ số các nút con
	private int[] head;		// Mảng Head chứa vị trí cắt đoạn trong mảng Children
	private int rootIndex;		// Chỉ số nút gốc
	
	public GeneralTreeArray(int nodeCount, int rootIndex) {
		info = new String[nodeCount + 1];
		children = new int[nodeCount];	// Tối đa n-1 phần tử (ngoại trừ nút gốc)
		head = new int[nodeCount + 2];	// Head có kích thước n+1
		this.rootIndex = rootIndex;
	}
	
	// Setter cho giá trị của nút
	public void setNodeValue(int index, String value) {
		info[index] = value;
	}
	
	// Thêm danh sách con vào mảng Children và cập nhật Head
	public void setChildren(int parentIndex, List<Integer> childIndeces) {
		int start = head[parentIndex];
		int end = start + childIndeces.size();
		for(int i = 0; i < childIndeces.size(); i++) {
			children[start + i] = childIndeces.get(i);
		}
		head[parentIndex + 1] = end;	// Cập nhật head của nút tiếp theo
	}
	
	// Getter
	public String getNodeValue(int index) {
		return info[index];
	}
	
	public List<Integer> getChildren(int parentIndex) {
		int start = head[parentIndex];
		int end = head[parentIndex + 1];
		List<Integer> result = new ArrayList<>();
		for(int i = start; i < end; i++) {
			result.add(children[i]);
		}
		return result;
	}
	
	public int getRootIndex() {
		return rootIndex;
	}
	
	@Override
	public String toString() {
		return "GeneralTreeArray{" +
                "info=" + Arrays.toString(info) +
                ", children=" + Arrays.toString(children) +
                ", head=" + Arrays.toString(head) +
                ", rootIndex=" + rootIndex +
                '}';
	}
	
}
