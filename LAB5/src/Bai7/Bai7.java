package Bai7;

	import java.util.ArrayList;
	import java.util.Scanner;

public class Bai7 {
	
	public static void main(String[] args) {
		ArrayList<Object> arrList = new ArrayList<>();
		
		Scanner nhap = new Scanner(System.in);
		System.out.println("\n- Thêm vào arrayList ");
		System.out.print("\n+ Số nguyên: ");
			arrList.add(nhap.nextInt())  ;
		System.out.print("\n+ Số thực: ");
			arrList.add(nhap.nextFloat()); 
	    System.out.print("\n+ Boolean: ");
	    	arrList.add(nhap.nextBoolean());
	    	nhap.nextLine();
	    System.out.print("\n+ Chuỗi: ");
	    	arrList.add(nhap.nextLine());
	    
	  System.out.println("\n==> In mảng: "+arrList);
	}
	
}
