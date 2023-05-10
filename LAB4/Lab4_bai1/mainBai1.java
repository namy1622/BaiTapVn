package Lab4_bai1;

import java.util.Scanner;

public class mainBai1 {
	public static void main(String[] args) {
		BenhNhan bn = new BenhNhan();
		BenhVien bv = new BenhVien();
		System.out.println("-- Nhap thong tin benh nhan --");
		bn.nhapTT();
		System.out.println("\n ==> hien thi thong tin benh nhan:");
		bn.toString();

		Scanner nhap = new Scanner(System.in);
		char chon;
		System.out.println("\n Ban co muon nhap thong tin benh vien khong ???");
		System.out.print("\t y: yes \n\t n: no \n Chọn: ");
		chon = nhap.next().charAt(0);
		if (chon == 'y') {
			bv.nhapTT();
			System.out.println("--> Hien thi thong tin benh vien...");
			bv.toString();
		}

		System.out.println(" HOÀN THÀNH ");

	}
}
