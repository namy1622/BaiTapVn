package Lab4_bai1;

import java.util.Scanner;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioiTinh;

	public Nguoi() {
	}

	public Nguoi(String ten, int tuoi, char gioiTinh) {

	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public char getGT() {
		return gioiTinh;
	}

	public void setGT(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	Scanner nhap = new Scanner(System.in);

	public void nhapTT() {
		System.out.print("- Họ và tên: ");
		ten = nhap.nextLine();
		System.out.print("- Tuổi: ");
		tuoi = nhap.nextInt();
		System.out.print("- Giới Tính: ");
		gioiTinh = nhap.next().charAt(0);
	}

	public String toString() {
		return "|| Há»� vÃ  TÃªn :" + ten + "|| Tuá»•i: " + tuoi + "|| Giá»›i TÃ­nh: " + gioiTinh;
	}

}
