package Bai3;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
	int hoursPerWeek;
	Scanner nhap = new Scanner(System.in);
	public PartTimeEmployee() {
		super();
		System.out.print("\n- Số giờ làm trên tuần (30 --> 48 giờ): ");
		 	this.hoursPerWeek = nhap.nextInt();
	}
	
	public int gethoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public String toString() {
		return super.toString() + "\n- Số giờ làm trong tuần: "+ hoursPerWeek;
	}
}
