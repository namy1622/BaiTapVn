package Bai4;

	import java.util.Scanner;

public abstract class HocVien {
	String hoTen, diaChi,loaiCT;
	protected int hocphi;
	public HocVien() {
		super();
	}
	public HocVien(String hoTen, String diaChi, String loaiCT) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCT = loaiCT;
	}
	Scanner nhap = new Scanner(System.in);
	
	public void nhapTongTin() {
		System.out.print("\n- Họ và Tên: ");
			hoTen = nhap.nextLine();
		System.out.print("\n- Địa chỉ: ");
			diaChi = nhap.nextLine();
		System.out.print("\n- Loại chương trình: ");
			loaiCT = nhap.nextLine();
	}
	
	public abstract void hocPhi() ;
	
	public String toString() {
		return "\n+ Họ và tên học viên: " +hoTen + "\n+ Địa chỉ: "+ diaChi+
				"\n+ Loai chương trình: "+ loaiCT;
	}
}
