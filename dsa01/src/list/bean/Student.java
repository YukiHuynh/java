package list.bean;

public class Student {
	private String name;
	private String classNumber;
	private String phone;
	private double avgGrade;
	
	public Student() {
	}

	public Student(String name, String classNumber, String phone, double avgGrade) {
		this.name = name;
		this.classNumber = classNumber;
		this.phone = phone;
		this.avgGrade = avgGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}
	
	public String getRank() {
		if(avgGrade >= 8.5) {
			return "Xuất sắc";
		}
		if (avgGrade >= 7.0) {
			return "Giỏi";
		}
        if (avgGrade >= 5.0) {
        	return "Trung bình";
        }
        return "Yếu";
	}

	@Override
	public String toString() {
		return "Tên: " + name + ", Lớp: " + classNumber + ", SĐT: " + phone + ", Điểm TB: " + avgGrade + ", Xếp loại: " + getRank();
	}
	
}
