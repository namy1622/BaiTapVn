package Lab4_bai1;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
	private String tieuSu, chanDoan, benhVien;

	public BenhNhan() {
	}

	public String gettieuSu() {
		return tieuSu;
	}

	public void settieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}

	public String getchanDoan() {
		return chanDoan;
	}

	public void setchanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public String getbenhVien() {
		return benhVien;
	}

	public void setbenhVien(String benhVien) {
		this.benhVien = benhVien;
	}

	Scanner nhap = new Scanner(System.in);

	public void nhapTT() {
		super.nhapTT();

		System.out.print("- Tiểu sử: ");
		this.tieuSu = nhap.nextLine();
		System.out.print("- Chẩn đoán: ");
		this.chanDoan = nhap.nextLine();
		System.out.print("- Đang chữa trị tại bệnh viện: ");
		this.benhVien = nhap.nextLine();
	}

	public String toString() {
		return super.toString() + " Tieu su: " + this.tieuSu + " Chan Doan: " + this.chanDoan + " Benh vien: "
				+ this.benhVien;
	}

}
