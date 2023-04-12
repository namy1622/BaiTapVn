package lap3_1_bai2;

	import java.util.Scanner;
public class DuongTron extends DIEM {
	
	public DuongTron() {
		super();
		this.r = 0;
	}
	DIEM O = new DIEM(x,y);
	DIEM R = new DIEM(x,y);
	float r;
	public void NhapDT() {
		System.out.print("\n Nhập tọa độ tâm đường tròn: ");
			O.NHAPDIEM();
		System.out.print("\n Nhập tọa độ điểm bất kì trên đường tròn: ");
			R.NHAPDIEM();
		r = (float)Math.sqrt((float)Math.pow((O.x-R.x), 2)+(float)Math.pow((O.y-R.y), 2));
	}
	public void InHT() {
		System.out.println("\n- Hình tròn có tâm O("+O.x +","+ O.y+")-- và bán kính r = "+ r);
	}
	public float DienTich() {
		float S = (float) (r*r*3.14);
		return S;
	}
	public float ChuVi() {
		float P = (float) (2*r*3.14);
		return P;
	}
}