package Bai3_3;
	import java.util.Scanner;
public class HangThucPham extends HangHoa{
	public String ngaySX,ngayHH;
	HangThucPham(String ngaySX, String ngayHH){
		this.ngaySX= ngaySX;
		this.ngayHH = ngayHH;
	}
	Scanner nhap = new Scanner(System.in);
	public HangThucPham() {
		super.nhap();
		
		System.out.print("\t+ Ngày sản xuất:");
			this.ngaySX = nhap.nextLine();
		System.out.print("\t+ Ngày hết hạn");
			this.ngayHH = nhap.nextLine();
	}
	public String toString() {
		return super.toString()+ "\n- Ngày sản xuất: "+ ngaySX +"\n- Ngày hết hạn: "+ ngayHH;
	}
}
