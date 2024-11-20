package calculate_expression.rpn;

import java.util.Objects;
import java.util.Stack;

public class RPNCalculator {

	private static final String OPERATORS = "+-*/";
	
	public double calculateRPN(String rpn) {
		Stack<Double> stack = new Stack<>();
		String refinedRPN = refine(rpn);
		
		for(String token : refinedRPN.split(" ")) {
			processToken(token, stack);
		}
		return stack.pop();
	}
	
	private void processToken(String token, Stack<Double> stack) {
		if(!OPERATORS.contains(token)) {	// Nếu token là toán hạng
			stack.push(Double.parseDouble(token));
		} else {
			double y = stack.pop();
			double x = stack.pop();
			double result;
			
			switch(token) {
			case "+" -> result = x + y;
			case "-" -> result = x - y;
            case "*" -> result = x * y;
            case "/" -> result = x / y;
            default -> throw new IllegalArgumentException("Invalid operator: " + token);
			}
			
			stack.push(result);	// Đẩy kết quả trở lại Stack
		}
	}
	
	private String refine(String rpn) {
		return rpn.trim().replaceAll("\\s+", " ");
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(OPERATORS);
    }
    
    @Override
    public String toString() {
        return "RPNCalculator{}";
    }
	
}
