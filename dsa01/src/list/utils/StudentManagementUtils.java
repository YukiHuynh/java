package list.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import list.bean.Student;

public class StudentManagementUtils {

	static class Node {
		Student data;
		Node prev;
		Node next;
		
		Node(Student data) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node tail;
	
	public void addLast(Student student) {
		Node newNode = new Node(student);
		if(head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public void displayFullList() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void displayNameAndRanks() {
		Node current = head;
		while(current != null) {
			System.out.println("Tên: " + current.data.getName() + ", Xếp loại: " + current.data.getRank());
            current = current.next;
		}
	}
	
	public void findStudent(String name, String classNumber) {
		Node current = head;
		while(current != null) {
			if(current.data.getName().equals(name) && current.data.getClassNumber().equalsIgnoreCase(classNumber)) {
				System.out.println("SĐT: " + current.data.getPhone());
				return;
			}
			current = current.next;
		}
		System.out.println("Không tìm thấy học sinh.");
	}
	
	public void removeByClass(String classNumber) {
		Node current = head;
		while(current != null) {
			if(current.data.getClassNumber().equalsIgnoreCase(classNumber)) {
				if(current.prev != null) {
					current.prev.next = current.next;
				}
				if(current.next != null) {
					current.next.prev = current.prev;
				}
				if(current == head) {
					head = current.next;
				}
				if(current == tail) {
					tail = current.prev;
				}
			}
			current = current.next;
		}
	}
	
	public void sortDescending() {
		if(head == null) {
			return;
		}
		for(Node i = head; i.next != null; i = i.next) {
			for(Node j = i.next; j != null; j = j.next) {
				if(i.data.getAvgGrade() < j.data.getAvgGrade()) {
					Student temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
		}
	}
	
	public void insertSorted(Student student) {
		Node newNode = new Node(student);
		if(head == null || head.data.getAvgGrade() < student.getAvgGrade()) {
			newNode.next = head;
			if(head != null) {
				head.prev = newNode;
			}
			if(tail == null) {
				tail = newNode;
			}
			return;
		}
		
		Node current = head;
		while(current.next != null && current.next.data.getAvgGrade() >= student.getAvgGrade()) {
			current = current.next;
		}
		newNode.next = current.next;
		if(current.next != null) {
			current.next.prev = newNode;
		}
		current.next = newNode;
		newNode.prev = current;
		if(newNode.next == null) {
			tail = newNode;
		}
	}
	
	public void saveToFile(String fileName) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		Node current = head;
		while(current != null) {
			writer.write(current.data.toString());
			writer.newLine();
			current = current.next;
		}
		writer.close();
	}
	
}
