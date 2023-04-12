package lap3_1;

	import java.util.Scanner;
public class SACH {
	public String ma,ten, tg, nxb;
	public int trang, tap, gia;
	public String loai;
	
	Scanner in = new Scanner(System.in);
	public void NHAPSACH(){
		System.out.println("\t- Mã Sách: ");
			ma = in.nextLine();
		System.out.println("\t-Tên sách: ");
			ten = in.nextLine();
		System.out.println("\t-Tác giả: ");
			tg = in.nextLine();
		System.out.println("\t-Số trang: ");
			trang = in.nextInt();
		System.out.println("\t-Tập: ");
			tap = in.nextInt(); 	
		System.out.println("\t-Giá: ");  
			gia = in.nextInt();
		System.out.println("\t-Loại sách: ");
			loai = in.nextLine();
// ????????			
		System.out.println("\t-Nhà xuất bản: ");
			nxb = in.nextLine();
	}
	
	public void INSACH() {
		System.out.println("\n-- Mã Sách: "+ma + "--Tên Sách: "+ten + "--Tác Giả: "+tg );
		System.out.println("\n--Số trang: "+trang + "--Tập: "+tap + "--Giá: "+ gia+" -- Loại sách: "+loai + "--NXB: "+nxb );
		
	}
	
public static void main(String[] args) 
	{
		/*SACH sach = new SACH();
		
		System.out.println("+++ Nhập thông tin sách +++");
			sach.NHAPSACH();
		System.out.println("\n+++ Thông tin sách +++\n");
			sach.INSACH();
		*/
		
	Scanner nhap = new Scanner(System.in);
	int n;
	System.out.println("\n- Nhập số đầu sách:");
		n = nhap.nextInt();
	SACH arrSach[] = new SACH[n];
	  
	for(int i= 0; i<n; i++) 
	  {
		 System.out.println("\n + Đầu sách "+ (i+1) +" : ");
		 
		 arrSach[i] = new SACH();
		 	arrSach[i].NHAPSACH();
		 	arrSach[i].INSACH();
	  }
	}
}