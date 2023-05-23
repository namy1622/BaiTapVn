package Bai1;
	import java.util.List;
	import java.util.Scanner;
	import java.util.LinkedList;
		
public class Bai1 {
	public static  boolean ThuanNghich(int n) {
		List<Integer> list1 = new LinkedList<Integer>();
			
		do {
			list1.add(n%10);
			n = n/10;
		}while(n>0);
		int size = list1.size();
		for(int i= 0; i<(size/2); i++) {
			if(list1.get(i) != list1.get(size -1 -i)) {
				return false;
			}	
		}
		return true;
	}
		
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		int n;
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("\n Nhập n:");
			n= nhap.nextInt();
		list.add(n);
		if(list.size() != 0) {
				System.out.println("\n Them "+n+ " vào list thành công" );
			}
		else {
			System.out.println("\n Thêm "+ n + " vào list thất bại");
			return ;
		}
		
			if(ThuanNghich(n) == true) {
				System.out.println("\n -->"+n+ " là số thuận nghịch");
			}
			else System.out.println("\n--> "+ n+ " không là số thuận nghịch");
		
	}
}	

