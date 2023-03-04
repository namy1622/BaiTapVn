package ass1;
import java.util.Scanner;

public class lab2Bai1 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
	
	int a,b;
	System.out.println("Nhap a= ");
	a= nhap.nextInt();
	
	System.out.println("Nhap b= ");
	b = nhap.nextInt();
	
System.out.println("-----a-----");
	
	System.out.println("Tong = "+ (a+b));
	System.out.println("Hieu = "+ (a-b));
	System.out.println("Tich = "+ (a*b));
	System.out.println("Thuong = "+ (double)a/(double)b);
	System.out.println("Du = "+ (a%b));
	
System.out.println("-----b-----");
	if(a>b) System.out.println(a +" lon hon "+ b);
	else if(a<b) System.out.println(a+" nho hon "+b);
	else System.out.println(" a = b");
	
	}

}
