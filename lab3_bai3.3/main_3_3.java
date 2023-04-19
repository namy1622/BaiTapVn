package Bai3_3;
	import java.util.Scanner;
	import java.util.ArrayList;
public class main_3_3 {
	

	public static void main(String[] args) {
		ArrayList<HangHoa> dsHH = new ArrayList<HangHoa>();
		
		int chonHang;
		Scanner nhap = new Scanner(System.in);
		System.out.println("\t-- LOẠI HÀNG --");
		System.out.println("\t1- Hàng điện máy");
		System.out.println("\t2- Hàng sành sứ");
		System.out.println("\t3- Hàng thực phẩm");
		
	  int tt;
	do {	
		System.out.println("\t==> Chọn 1, 2, 3 tương ứng....");
			chonHang = nhap.nextInt();
		
		switch(chonHang) {
		case 1:
			HangDienMay hdm = new HangDienMay();
			dsHH.add(hdm);
			System.out.println(dsHH);
			break;
		
		case 2:
			HangSanhSu hss = new HangSanhSu();
			dsHH.add(hss);
			System.out.println(dsHH);
			break;
		
		case 3:
			HangThucPham htp = new HangThucPham();
			dsHH.add(htp);
			System.out.println(dsHH);
			break;
			
		default:
			System.out.println("!!! Nhập sai phạm vi loại hàng quy định !!!");
			break;
	    }
		Scanner in = new Scanner(System.in);
		System.out.println("\n--> Bạn muốn chọn tiếp... \n 1 = Yes \n 2 = No");
		tt = in.nextInt();
		
	  }while(tt == 1);
	}
}
