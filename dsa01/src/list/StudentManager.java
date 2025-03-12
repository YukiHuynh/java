package list;

import java.io.IOException;
import java.util.Scanner;

import list.bean.Student;
import list.utils.StudentManagementUtils;

public class StudentManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentManagementUtils studentList = new StudentManagementUtils();

		studentList.addLast(new Student("Nguyen Van A", "10A1", "0123456789", 8.5));
		studentList.addLast(new Student("Tran Van B", "10A2", "0987654321", 6.8));
		studentList.addLast(new Student("Le Thi C", "10A1", "0911111111", 9.0));
		studentList.addLast(new Student("Hoang Van D", "10A2", "0922222222", 7.5));
		studentList.addLast(new Student("Tran Thi E", "10A3", "0933333333", 6.0));
		studentList.addLast(new Student("Nguyen Van F", "10A4", "0944444444", 8.7));
		studentList.addLast(new Student("Pham Thi G", "10A5", "0955555555", 5.8));
		studentList.addLast(new Student("Dang Van H", "10A1", "0966666666", 8.0));
		studentList.addLast(new Student("Bui Thi I", "10A2", "0977777777", 6.9));
		studentList.addLast(new Student("Vu Van J", "10A3", "0988888888", 7.2));
		studentList.addLast(new Student("Tran Van K", "10A4", "0999999999", 9.5));
		studentList.addLast(new Student("Le Thi L", "10A5", "0900000000", 5.2));
		studentList.addLast(new Student("Hoang Thi M", "10A1", "0912121212", 8.4));
		studentList.addLast(new Student("Nguyen Van N", "10A3", "0923131313", 6.5));

		int choice;
		do {
			System.out.println("\n--- Quản lý danh sách học sinh ---");
			System.out.println("1. Nhập danh sách học sinh");
			System.out.println("2. In danh sách (Tên và xếp loại)");
			System.out.println("3. In danh sách (Đầy đủ thông tin)");
			System.out.println("4. Tìm học sinh theo tên và lớp");
			System.out.println("5. Thêm học sinh mới");
			System.out.println("6. Xóa học sinh theo lớp");
			System.out.println("7. Sắp xếp danh sách theo điểm giảm dần");
			System.out.println("8. Chèn học sinh vào danh sách đã sắp xếp");
			System.out.println("9. Lưu danh sách vào file");
			System.out.println("0. Thoát");
			System.out.print("Chọn: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				// Nhập từ bàn phím
				System.out.print("Nhập số học sinh: ");
				int n = scanner.nextInt();
				scanner.nextLine();
				for (int i = 0; i < n; i++) {
					System.out.print("Tên: ");
					String name = scanner.nextLine();
					System.out.print("Lớp: ");
					String classroom = scanner.nextLine();
					System.out.print("SĐT: ");
					String phone = scanner.nextLine();
					System.out.print("Điểm TB: ");
					double avgScore = scanner.nextDouble();
					scanner.nextLine();
					studentList.addLast(new Student(name, classroom, phone, avgScore));
				}
				break;

			case 2:
				studentList.displayNameAndRanks();
				break;

			case 3:
				studentList.displayFullList();
				break;

			case 4:
				System.out.print("Nhập tên: ");
				String searchName = scanner.nextLine();
				System.out.print("Nhập lớp: ");
				String searchClass = scanner.nextLine();
				studentList.findStudent(searchName, searchClass);
				break;

			case 5:
				System.out.print("Tên: ");
				String name = scanner.nextLine();
				System.out.print("Lớp: ");
				String classroom = scanner.nextLine();
				System.out.print("SĐT: ");
				String phone = scanner.nextLine();
				System.out.print("Điểm TB: ");
				double avgScore = scanner.nextDouble();
				scanner.nextLine();
				studentList.addLast(new Student(name, classroom, phone, avgScore));
				break;

			case 6:
				System.out.print("Nhập tên lớp cần xóa: ");
				String classToDelete = scanner.nextLine();
				studentList.removeByClass(classToDelete);
				break;

			case 7:
				studentList.sortDescending();
				break;

			case 8:
				System.out.print("Tên: ");
				String newName = scanner.nextLine();
				System.out.print("Lớp: ");
				String newClassroom = scanner.nextLine();
				System.out.print("SĐT: ");
				String newPhone = scanner.nextLine();
				System.out.print("Điểm TB: ");
				double newAvgScore = scanner.nextDouble();
				scanner.nextLine();
				studentList.insertSorted(new Student(newName, newClassroom, newPhone, newAvgScore));
				break;

			case 9:
				System.out.print("Nhập tên file để lưu danh sách: ");
				String filename = scanner.nextLine();
				try {
					studentList.saveToFile(filename);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("Danh sách đã được lưu vào file: " + filename);
				break;

			case 0:
				System.out.println("Thoát chương trình. Tạm biệt!");
				break;

			default:
				System.out.println("Lựa chọn không hợp lệ. Hãy thử lại.");
			}
		} while (choice != 0);

		scanner.close();
	}
}
