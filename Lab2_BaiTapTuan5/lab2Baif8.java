package ass1;
	import java.util.Scanner;
public class lab2Baif8 {
	public static void main(String[] args) { 
	Scanner in = new Scanner(System.in);
	System.out.print("Nhap do dai day so: "); 
	int n = in.nextInt();
	 int arr[] = new int[n];
	 int sum=0;
	 for(int i= 0; i< n; i++) {
		 System.out.print("arr["+(i+1)+"] =");
		 arr[i] = in.nextInt();
		 sum +=arr[i];
	 }
	  System.out.print("TBC cua day so = "+ (float)sum/(float)n);
	}
}
