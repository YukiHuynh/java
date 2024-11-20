package calculate_expression.rpn;

import java.util.Stack;

import calculate_expression.TreeNode;

public class InfixToRPNTree {

	public static void main(String[] args) {
		
		String rpn = "3 4 + 2 * 7 /";	// Biểu thức RPN ví dụ
		
		TreeNode root = buildTreeFromRPN(rpn); // Xây dựng cây nhị phân từ RPN
		
		// Tính toán kết quả từ cây
		double result = evaluate(root);
		System.out.println("Result: " + result);	// In ra kết quả tính toán
		
	}
	
	// Phương thức tính toán trên cây nhị phân (hậu tố)
	public static double evaluate(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		// Nếu nút là toán hạng (số)
		if(root.getLeft() == null && root.getRight() == null) {
			return Double.parseDouble(root.getValue());
		}
		
		// Tính toán trên cây con
		double leftVal = evaluate(root.getLeft());
		double rightVal = evaluate(root.getRight());
		
		switch(root.getValue()) {
		case "+":
			return leftVal + rightVal;
		 case "-":
             return leftVal - rightVal;
         case "*":
             return leftVal * rightVal;
         case "/":
             return leftVal / rightVal;
         default:
             throw new UnsupportedOperationException("Unknown operator " + root.getValue());
		}
	}
	
	// Phương thức xây dựng cây nhị phân từ biểu thức RPN
	public static TreeNode buildTreeFromRPN(String rpn) {
		Stack<TreeNode> stack = new Stack<>();
		
		// Tách các phần tử của biểu thức RPN
		String[] tokens = rpn.split(" ");
		
		for(String token : tokens) {
			TreeNode node = new TreeNode(token);
			
			// Nếu token là một toán hạng (số), đẩy vào Stack
			if(!isOperator(token)) {
				stack.push(node);
			} else {
				// Nếu là toán tử, lấy hai nút từ Stack và tạo ra nút toán tử
				TreeNode rightNode = stack.pop();
				TreeNode leftNode = stack.pop();
				
				 // Liên kết cây con
				node.setLeft(leftNode);
				node.setRight(rightNode);
				
				// Đẩy lại nút vào Stack
				stack.push(node);
			}
		}
		// Sau khi xử lý xong tất cả các phần tử, Stack còn lại 1 phần tử duy nhất - gốc của cây
		return stack.pop();
	}
	
	private static boolean isOperator(String token) {
		return token.equals("+") || 
			   token.equals("-") || 
			   token.equals("*") || 
			   token.equals("/");
	}
	
}
