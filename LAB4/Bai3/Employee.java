package Bai3;

	import java.util.Scanner;
public class Employee extends Person{
	String employerName;
	String dateHire;
	
	Scanner nhap = new Scanner(System.in);
	public Employee() {
		super();
	  System.out.print("\n- Nhập tên nhà tuyển dụng: ");
	 	this.employerName = nhap.nextLine();
	  System.out.print("\n- Thời hạn hợp đồng: ");
	 	this.dateHire = nhap.nextLine();
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getDateHire() {
		return dateHire;
	}
	public void setDateHire(String dateHire) {
		this.dateHire = dateHire;
	}
	public String toString() {
		return super.toString()+ "\n- Công việc:"+ employerName + "\n- Số ngày làm: "+ dateHire;
	}
}
