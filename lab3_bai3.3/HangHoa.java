package Bai3_3;

	import java.util.Scanner;
public class HangHoa {
	public String maHang, tenHang, nhaSanXuat;
	public int gia;
	public HangHoa() {}
	
	public HangHoa(String maHang,String tenHang,String nhaSanXuat,int gia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSanXuat = nhaSanXuat;
		this.gia = gia;
	}
	
	Scanner nhap = new Scanner(System.in);
	public void nhap() {
		System.out.print("\t+ Mã hàng: ");
			maHang = nhap.nextLine();
		System.out.print("\t+ Tên hàng: ");
			tenHang = nhap.nextLine();
		System.out.print("\t+ Nhà sản xuất: ");
			nhaSanXuat = nhap.nextLine();
		System.out.print("\t+ Giá: ");
			gia = nhap.nextInt();
	}
	public String toString() {
		return "- Tên hàng: "+tenHang +"\n- Mã hàng: "+maHang+ "\n- Giá: "+gia+ "\n- Nhà sản xuất"+ nhaSanXuat ;
	}
}
