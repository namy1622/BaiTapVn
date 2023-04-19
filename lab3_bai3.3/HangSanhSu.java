package Bai3_3;
	import java.util.Scanner;
public class HangSanhSu extends HangHoa{
	 public String loaiNguyenLieu;
	 HangSanhSu(String loaiNguyenLieu){
		 this.loaiNguyenLieu = loaiNguyenLieu;
	 }
	 Scanner nhap = new Scanner(System.in);
	 public HangSanhSu() {
		 super.nhap();
		
		 System.out.print("\t+ Nguyên liệu làm: ");
		 	this.loaiNguyenLieu = nhap.nextLine();
	 }
	 public String toString() {
		 return super.toString()+"\n- Loại nguyên liệu: "+loaiNguyenLieu;
	 }
}
