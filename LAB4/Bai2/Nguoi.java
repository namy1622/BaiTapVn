package Bai2;

public class Nguoi {
	public String ten;
	public int tuoi;
	public char gioiTinh;

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
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

	public String toString() {
		return "- Họ và Tên :" + ten + "\n- Tuổi: " + tuoi + "\n- Giới Tính: " + gioiTinh;
	}

}
