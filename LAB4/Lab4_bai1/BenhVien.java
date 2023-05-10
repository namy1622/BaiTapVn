package Lab4_bai1;

import java.util.Scanner;

public class BenhVien extends BenhNhan {
	private String ten, diaChi, giamDoc;

	public BenhVien() {
	}

	public String getten() {
		return ten;
	}

	public void setten(String ten) {
		this.ten = ten;
	}

	public String getdiaChi() {
		return diaChi;
	}

	public void setdiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getgiamDoc() {
		return giamDoc;
	}

	public void setgiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}

	Scanner nhap = new Scanner(System.in);

	public void nhapTT() {
		// super.nhapTT();

		System.out.print("- Ten: ");
		this.ten = nhap.nextLine();
		System.out.print("- Dia chi: ");
		this.diaChi = nhap.nextLine();
		System.out.print("- Ten giam doc: ");
		this.giamDoc = nhap.nextLine();
	}

	public String toString() {
		return "|| Ten benh vien: " + this.ten + "|| Dia chi: " + this.diaChi + "|| ten giam doc: " + this.giamDoc;
	}
}
