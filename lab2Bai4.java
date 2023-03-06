package ass1;
import java.util.Scanner;
public class lab2Bai4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	System.out.println("Nhap so:");
	int n;
	do {
		 n = in.nextInt();
		 if(n<1 || n>12) System.out.println("Nhap lai:");
	}while(n<1 || n>12);
	
	switch (n){
		case 1:
			System.out.println("Thang 1");
			break;
		case 2:
			System.out.println("Thang 2");
			break;
		case 3:
			System.out.println("Thang 3");
			break;
		case 4:
			System.out.println("Thang 4");
			break;
		case 5:
			System.out.println("Thang 5");
			break;
		case 6:
			System.out.println("Thang 6");
			break;
		case 7:
			System.out.println("Thang 7");
			break;
		case 8:
			System.out.println("Thang 8");
			break;
		case 9:
			System.out.println("Thang 9");
			break;
		case 10:
			System.out.println("Thang 10");
			break;
		case 11:
			System.out.println("Thang 11");
			break;
		case 12:
			System.out.println("Thang 12");
			break;
	  }
  }
	
}

