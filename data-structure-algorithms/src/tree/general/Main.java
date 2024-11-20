package tree.general;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Số lượng nút
		int nodeCount = 12;
		int rootIndex = 1;
		
		// Khởi tạo cây
		GeneralTreeArray generalTreeArray = new GeneralTreeArray(nodeCount, rootIndex);
		
		// Thiết lập giá trị các nút
		generalTreeArray.setNodeValue(1, "B");
		generalTreeArray.setNodeValue(2, "F");
		generalTreeArray.setNodeValue(3, "C");
		generalTreeArray.setNodeValue(4, "I");
		generalTreeArray.setNodeValue(5, "D");
		generalTreeArray.setNodeValue(6, "E");
		generalTreeArray.setNodeValue(7, "G");
		generalTreeArray.setNodeValue(8, "H");
		generalTreeArray.setNodeValue(9, "A");
		generalTreeArray.setNodeValue(10, "J");
		generalTreeArray.setNodeValue(11, "K");
		generalTreeArray.setNodeValue(12, "L");
		
		// Thiết lập danh sách con
		generalTreeArray.setChildren(1, Arrays.asList(3, 5, 6));
		generalTreeArray.setChildren(2, Arrays.asList(7, 8));
		generalTreeArray.setChildren(4, Arrays.asList(10, 11, 12));
		generalTreeArray.setChildren(9, Arrays.asList(1, 2, 4));
		
		// In cấu trúc cây
		System.out.println("Cây Tổng Quát:");
		for(int i = 1; i <= nodeCount; i++) {
			System.out.println("Node: " + i + " (" + generalTreeArray.getNodeValue(i) + ") -> " + 
								generalTreeArray.getChildren(i));
		}
		
		GeneralTreeLinkedList tree = new GeneralTreeLinkedList("A");

        // Lấy nút gốc
        TreeNode root = tree.getRoot();

        // Thêm các nút con
        tree.addChild(root, "B"); // A -> B
        tree.addChild(root, "C"); // A -> C
        tree.addChild(root, "D"); // A -> D

        // Thêm các nút con của B
        TreeNode nodeB = root.getFirstChild();
        tree.addChild(nodeB, "E"); // B -> E
        tree.addChild(nodeB, "F"); // B -> F

        // Thêm các nút con của D
        TreeNode nodeD = nodeB.getSibling().getSibling();
        tree.addChild(nodeD, "G"); // D -> G

        // Duyệt cây theo thứ tự tiền tố
        System.out.println("Pre-order traversal:");
        tree.traversePreOrder(root);
		
	}
	
}
