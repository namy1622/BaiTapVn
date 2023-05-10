package Bai2;

public class SinhVien extends Nguoi {
	String lop, nghanh;
	Truong truong;
	public SinhVien(String ten, int tuoi, char gioiTinh,String lop, String nghanh, Truong truong) {
		super(ten,tuoi, gioiTinh);
		this.lop = lop;
		this.nghanh = nghanh;
		this.truong = truong;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNghanh() {
		return nghanh;
	}

	public void setNghanh(String nghanh) {
		this.nghanh = nghanh;
	}

	public String toString() {
		return super.toString()+ "\n- Lớp: " + lop
				+ "\n- Nghành: " + nghanh+ truong.toString();
	}
}
