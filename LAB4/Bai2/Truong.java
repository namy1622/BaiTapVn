package Bai2;

public class Truong {
	String ten, diaChi, hieuTruong;
	
	public Truong(String ten, String diaChi,String hieuTruong) {
		this.ten = "Mỏ Địa Chất";
		this.diaChi = "18 Phố Viên";
		this.hieuTruong = "Trần Thanh Hải";
	}
	public String getTen() {
		return  ten;
	}
	public void setTen(String ten ) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return  diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi= diaChi;
	}

	public String getHieuTruong() {
		return  hieuTruong;
	}
	public void set(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	public String toString() {
		return "\n- Tên trường: "+ ten+ "\n- Địa Chỉ: "+ diaChi+ "\n- Hiệu Trưởng: "+hieuTruong;
	}

}
