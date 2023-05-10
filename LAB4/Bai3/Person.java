package Bai3;
	
	import java.util.Scanner;
public class Person {

	String name ;
	int age;
	char gender;
	Scanner nhap = new Scanner(System.in);
	public Person() {
	  System.out.print("\n- Nhập tên nhân viên: ");
	 	this.name = nhap.nextLine();
	  System.out.print("\n- Nhập tuổi: ");
	 	this.age = nhap.nextInt();
	  System.out.print("\n- Nhập giới tính (x: nam||y: nữ):");
	 	this.gender = nhap.next().charAt(0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "\n- Tên :"+ name+ "\n- Tuổi: "+ age + "\n- Giới tính: "+ gender;
	}
}
