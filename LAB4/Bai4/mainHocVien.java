package Bai4;

	import java.util.Scanner;
	import java.util.ArrayList;
public class mainHocVien {
	public static void main(String[] args) {
		HocVien hv;
		HocVienLT hvLT;
		HocVienDH hvDH;
		Scanner nhap = new Scanner(System.in);
		int chon;
		ArrayList<HocVien> arrHV = new ArrayList<>();
		
		System.out.print("\n\t--QUẢN LÝ HỌC VIÊN--\n");
		System.out.println("- Bạn muốn nhập thông tin quản lý cho đối tượng nào?");
		System.out.println("\t+ 1: Lập Trình\n\t+ 2: Đồ Họa\n\t+ 3: Cả 2\n-> Chọn 1,2,3: ");
			chon = nhap.nextInt();
		switch (chon){
			case 1:
				System.out.println("\n==> Nhập thông tin cho học viên Lập trình\n");
				hvLT = new HocVienLT();
				hvLT.nhapTongTin();
					arrHV.add(hvLT);
				break;
			case 2:
				System.out.println("\n==> Nhập thông tin cho học viên Đồ họa\n");
				hvDH = new HocVienDH();
				hvDH.nhapTongTin();
					arrHV.add(hvDH);
				break;
			case 3:
				System.out.println("\n==> Nhập thông tin lần lượt cho học viên Lập Trình, Đồ Họa\n");
				System.out.println("\n* Nhập thông tin cho học viên Lập trình\n");
				hvLT = new HocVienLT();
				hvLT.nhapTongTin();
					arrHV.add(hvLT);
				System.out.println("\n* Nhập thông tin cho học viên Đồ họa\n");
				hvDH = new HocVienDH();
				hvDH.nhapTongTin();
					arrHV.add(hvDH);
				break;
		}
		System.out.println("\n--------------------\n");
		System.out.println("Hiển thị thông tin Học Viên...\n");
		for(HocVien hocvien : arrHV) {
			hocvien.hocPhi();
			System.out.println(hocvien.toString());
		}
		
		
		
		/*	//HocVien hv;
		HocVienDH dh = new HocVienDH();
		dh.nhapThongTin();
		dh.hocPhi();
		//hv.nhapTongTin();
		System.out.println(dh.toString());
	
		HocVienLT dh = new HocVienLT();
		dh.nhapThongTin();
		dh.hocPhi();
		//hv.nhapTongTin();
		System.out.println(dh.toString());
		*/	
	}
}
