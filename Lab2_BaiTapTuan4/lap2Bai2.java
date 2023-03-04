package ass1;
import java.util.Scanner;

public class lap2Bai2 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
	System.out.println(" Nhap so nguyen n =");
		int n = nhap.nextInt();
	
	if(n%2==0) System.out.println(n+ " la so chan...");
	else System.out.println(n + " la so le...");

	}
}
