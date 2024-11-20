package calculate_expression;

import java.util.*;

public class InfixToRPN {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter an infix expression: ");
		String infix = ip.nextLine();
		
		String rpn = convertToRPN(infix);
		System.out.println("RPN Expression: " + rpn);
		
		ip.close();
		
	}
	
	// Hàm kiểm tra độ ưu tiên của toán tử
	private static int getPrecedence(char operator) {
		return switch(operator) {
			case '+', '-' -> 1;
			case '*', '/' -> 2;
			default -> -1;
		};
	}
	
	// Hàm chuyển đổi biểu thức trung tố sang hậu tố
	public static String convertToRPN(String infix) {
		
		// Ngăn xếp (stack) để lưu các toán tử và dấu ngoặc
		Stack<Character> stack = new Stack<>();
		// Danh sách (output) để lưu kết quả RPN
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			
			// Bỏ qua khoảng trắng
			if(Character.isWhitespace(ch)) {
				continue;
			}
			
			// Nếu là toán hạng, thêm vào output
			if(Character.isLetterOrDigit(ch)) {
				output.append(ch).append(' ');
			}
			// Nếu là dấu ngoặc mở, đưa vào stack
			else if(ch == '(') {
				stack.push(ch);
			}
			// Nếu là dấu ngoặc đóng, xử lý cho đến dấu ngoặc mở
			else if(ch == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					output.append(stack.pop()).append(' ');
				}
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop(); // Loại bỏ dấu ngoặc mở
				}
			}
			// Nếu là toán tử
			else {
				while(!stack.isEmpty() && 
						getPrecedence(stack.peek()) >= getPrecedence(ch)) {
							output.append(stack.pop()).append(' ');
						}
				stack.push(ch);	// Đưa toán tử hiện tại vào stack
			}
		}
		
		// Đưa các toán tử còn lại từ stack vào output
		while(!stack.isEmpty()) {
			output.append(stack.pop()).append(' ');
		}
		
		return output.toString().trim();
		
	}
	
}
