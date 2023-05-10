package Bai4;

import java.util.Scanner;

public class HocVienLT extends HocVien{
	 int loaiUT, sobuoihoc;
	int giaDH = 300000;
	Scanner nhap = new Scanner(System.in);
	
	public HocVienLT() {
		super();
	}
	public HocVienLT(int loaiUT, int sobuoihoc) {
		super();
		this.loaiUT = loaiUT;
		this.sobuoihoc = sobuoihoc;
		
	}
	
	public void nhapThongTin() {
		super.nhapTongTin();
		System.out.print("\n Số buổi đã học: ");
			sobuoihoc = nhap.nextInt();
		System.out.print("\n Loại ưu tiên (0 || 1 || 2) : ");
			loaiUT = nhap.nextInt();
	}
	public void hocPhi() {
		
	    if (loaiUT==0) {
			hocphi = sobuoihoc * giaDH;
		}
	    else if(loaiUT == 1) {
			hocphi = sobuoihoc * giaDH - 1000000;
		}
		else if(loaiUT == 2) {
			hocphi = sobuoihoc * giaDH - 800000;
		}
	 }
	public String toString() {
		return "\n--Lập Trình--"+super.toString()+"\n+ Số buổi đã học: "+sobuoihoc+
				"\n+ Loại ưu tiên: "+loaiUT+ "\n+ Học phí: "+ hocphi;
	}
}
