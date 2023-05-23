package Bai6;
	import java.util.Scanner;
	import java.util.Map;
	import java.util.HashMap;
public class Bai6 {
	public static class SinhVien{
		private String hoTen;
		private String maSV;
		private String lop;
		
		public SinhVien(String maSV, String hoTen, String lop) {
			this.hoTen = hoTen;
			this.lop = lop;
			this.maSV = maSV;
		}
		public String getmaSV() {
			return maSV;
		}
		public void setmaSV(String maSV) {
			this.maSV = maSV;
		}
		public String gethoTen() {
			return hoTen;
		}
		public void sethoTen(String hoTen) {
			this.hoTen = hoTen;
		}
		public String getLop() {
			return lop;
		}
		public void setLop(String lop) {
			this.lop = lop;
		}
	}
	
	public static void main(String[] args) {
		Map<String, SinhVien> map = new HashMap<>();
		int n;
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("\n- Nhập số lượng Sinh Viên: ");
			n = nhap.nextInt();
		nhap.nextLine();
		for(int i= 0 ; i<n; i++) {
			System.out.println("\n- Sinh viên thứ "+(i+1)+":");
			System.out.print("\n+ Tên: ");
				String hoTen = nhap.nextLine();
			System.out.print("\n+ Mã SV: ");
				String maSV = nhap.nextLine();
			System.out.print("\n+ Lớp: ");	
				String lop = nhap.nextLine();
				map.put(maSV,new SinhVien(maSV ,hoTen ,lop));
		}
		System.out.println(map);
//----------------------------------------------------
		String tenLop,tenMaSV;
		System.out.print("\n- Nhập Lớp cần hiênt thị:");
			tenLop = nhap.nextLine();
		
			for(Map.Entry<String, SinhVien> entryMap : map.entrySet()) {
			if(entryMap.getValue().getLop().equals(tenLop)) {
				System.out.println("\n==> Thông tin:");
				System.out.println(entryMap.getValue());
			}
			else System.out.println("\n!!! không có lớp "+ tenLop);
		}
		
			System.out.print("\n- Nhập mã Sinh viên muốn hiên thị thông tin: ");
				tenMaSV = nhap.nextLine();
			
			System.out.println("\n==> Thông tin: "+map.get(tenMaSV));
	}
}
