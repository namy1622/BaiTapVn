package lap3_1_bai2;
	
import java.util.Scanner;
public class main3_2 {
	public static void main(String[] args) {
		System.out.println("-------- Lab 3.1- Bài 3.2 -----");
		String c;
		Scanner nhap = new Scanner(System.in);
		System.out.println("\n - Nhập phần a, b hoặc c:");
			c = nhap.nextLine();
		
	switch(c) {
		case "a":
		  System.out.println("\n Phần a: Xây dựng lớp DIEM nhá ...");
			DIEM diem = new DIEM();
		
			diem.NHAPDIEM();
			diem.InDiem();
		break;
		
		case "b":
			System.out.println("\n Phần b: Xây dựng lớp TAMGIAC nhá ...");
			TamGiac TG = new TamGiac();
			TG.NhapTG();
			
			TG.InTG();
			
			TG.KiemTra();
			
			TG.TinhCanh();
			
			
			System.out.println("\nCạnh TamGiac ABC lần lượt là\n\t AB ="+ TG.AB+ "; AC = "+ TG.AC+ "; BC ="+ TG.BC);
			
			System.out.println("\n==> Chu Vi TamGiac ABC = "+ TG.ChuVi());
			System.out.println("\n==> Dien Tich TamGiac ABC = "+ TG.DienTich());
		break;
		
		case "c":
		  System.out.println("\n Phần c: Xây dựng lớp DUONGTRON nhá ...");
			DuongTron Dtron = new DuongTron();
			Dtron.NhapDT();
			
			Dtron.InHT();
			System.out.println("\n==> Chu Vi = "+ Dtron.ChuVi());
			
			System.out.println("\n==> DienTich = "+ Dtron.DienTich());
		break;
	}
	}
}		
	