package calculate_expression.rpn;

import java.util.Objects;

public class RPNElementProcessor {

	private String element;
	
	public RPNElementProcessor() {
	}

	public RPNElementProcessor(String element) {
		this.element = element;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(element);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RPNElementProcessor that = (RPNElementProcessor) o;
		return Objects.equals(element, that.element);
	}

	public void processElement() {
		System.out.println("Processing element: " + element);
		processRPN(element);
	}
	
	private void processRPN(String rpn) {
		StringBuilder t = new StringBuilder();	// Chuỗi tạm để lưu phần tử đang đọc
		
		for(int p = 0; p < rpn.length(); p++) {	// Duyệt qua các ký tự trong biểu thức RPN
			char currentChar = rpn.charAt(p);
			
			if(currentChar != ' ') {			// Nếu không phải dấu cách, nối ký tự vào t
				t.append(currentChar);
			} else {							// Nếu gặp dấu cách, xử lý phần tử t
				if(t.length() > 0) {			// Chỉ xử lý khi t không rỗng
					new RPNElementProcessor(t.toString()).processElement();
					t.setLength(0);				// Xóa t để chuẩn bị đọc phần tử mới
				}
			}
		}
		
		// Xử lý phần tử cuối cùng (nếu không kết thúc bằng dấu cách)
		if(t.length() > 0) {
			new RPNElementProcessor(t.toString()).processElement();
		}
	}
	
	@Override
	public String toString() {
		return "RPNElementProcessor{" +
        "element='" + element + '\'' +
        '}';
	}
}
