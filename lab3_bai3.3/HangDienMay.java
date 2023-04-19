package Bai3_3;
	import java.util.Scanner;

public class HangDienMay extends HangHoa {
	public  String thoiGianBaoHanh;
	public  int dienAp;
	public  int congSuat;
	
	HangDienMay(String thoiGianBaoHanh,int dienAp, int congSuat){
		this.thoiGianBaoHanh= thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat =congSuat;
	}
	
	public HangDienMay() {
		super.nhap();
		
		Scanner in = new Scanner(System.in);
		System.out.print("\t+ Nhập thời gian bảo hành (bao nhiêu tháng hoặc năm): ");
			this.thoiGianBaoHanh = in.nextLine();
		System.out.print("\t+ Nhập điện áp (Vôn V): ");
			this.dienAp = in.nextInt();
		System.out.print("\t+ Nhập công suất(W): ");
			this.congSuat = in.nextInt();
	}
	public String toString() {
		return super.toString()+"\n- Thời gian bảo hành: "+ thoiGianBaoHanh+"\n- Điện áp: "+dienAp+"\n- Công suất: "+ congSuat;
	}
}
