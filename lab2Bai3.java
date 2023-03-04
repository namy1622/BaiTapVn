package ass1;
	import java.util.Scanner;
public class lab2Bai3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Tên: ");
		String name = in.nextLine();
		
		System.out.println("Tuổi: ");
		int age = in.nextInt();
		
		if(age<16) System.out.println("Bạn "+name+ " ở độ tuổi vị thành niên");
		else if( age >=16 && age <18) System.out.println("Bạn "+name+ " ở độ tuổi trưởng thành");
		else System.out.println("Bạn "+ name+" đã già");
	}
}
