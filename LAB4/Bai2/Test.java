package Bai2;

public class Test {
	public static void main(String[] args) {
		
		Truong truong= new Truong("Mỏ Địa Chất",  "18 Phố Viên", "Trần Thanh Hải");
		SinhVien sv = new SinhVien("Nam", 20, 'n',"G1", "Công Nghệ Thông Tin",truong);
		System.out.println(sv.toString());
	}
}
