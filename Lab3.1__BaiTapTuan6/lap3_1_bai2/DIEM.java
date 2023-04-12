package lap3_1_bai2;

	import java.util.Scanner;
public class DIEM {
	public int x,y;
	
	public DIEM(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public DIEM() {}
	Scanner nhap = new Scanner(System.in);
	
	public void NHAPDIEM() {
		System.out.println("\n - Nhập tọa độ x, y ...");
		System.out.println("\t x = ");
			x = nhap.nextInt();
		System.out.println("\t y = ");
			y = nhap.nextInt();
	}
	public void InDiem() {
		System.out.println("\t \tTọa độ (x,y) là : ("+ this.x+", "+ this.y+ ") " );
	}
}