package ass1;
import java.util.Scanner;
public class lab2Bai6 {
	static int GiaiThua(int m) {
		if(m==0 || m==1) return 1;
		else  return m * GiaiThua(m-1);
	}
	
	public static void main(String[] args) {
	   	Scanner in = new Scanner(System.in);
	   	System.out.print("Nhap n= ");
	   	int n = in.nextInt();
	   	
	   	System.out.print("Giai thua cua n = "+ GiaiThua(n));
	}
}
