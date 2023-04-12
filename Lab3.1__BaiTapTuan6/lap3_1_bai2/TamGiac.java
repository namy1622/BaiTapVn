package lap3_1_bai2;

	import java.util.Scanner;
public class TamGiac extends DIEM{
	public TamGiac() {
		super();
	}
	DIEM A =new DIEM(x,y) ;
	DIEM B =new DIEM(x,y) ;
	DIEM C =new DIEM(x,y) ;
	public void NhapTG() {
		System.out.println("\n--Điểm A---");
			A.NHAPDIEM();
		System.out.println("\n--Điểm B---");
			B.NHAPDIEM();
		System.out.println("\n--Điểm C---");
			C.NHAPDIEM();
	}
	
	public void InTG() {
		System.out.println("==> Tam Giác có 3 đỉnh A B C tọa độ lần lượt là:");
		
		System.out.println("\t+ Điểm A:");
			A.InDiem();
		System.out.println("\t+ Điểm C:");
			B.InDiem();
		System.out.println("\t+ Điểm C:");
			C.InDiem();
	}
	
	public void KiemTra() {
		System.out.println("\n\t Kiểm tra Tam Giác hợp lệ không...");
		if((A.x == B.x && A.y == B.y) || (A.x == C.x && A.y == C.y) || (B.x == C.x && B.y == C.y)) {
			System.out.println("\n\t -->Tam Giac không hợp lệ !!!");
			return;
		}
		else System.out.println("\n\t -->Tam Giác hợp lệ !!!");
	}
	float AB, AC, BC;
	public void TinhCanh() {
		AB = (float)Math.sqrt((float)Math.pow((B.x-A.x),2) +(float)Math.pow(B.y-A.y, 2));
		AC = (float)Math.sqrt((float)Math.pow((C.x-A.x),2) +(float)Math.pow(C.y-A.y, 2));
		BC = (float)Math.sqrt((float)Math.pow((C.x-B.x),2) +(float)Math.pow(C.y-B.y, 2));
	}
	float cv;
	public float ChuVi(/*float AB,float AC,float BC*/) {
		
		return  cv= AB + AC + BC;
	}
	public float DienTich(/*float cv,float AB,float AC,float BC*/) {
		float dt;
		cv = cv/2;
		return dt=(float)Math.sqrt(cv*(cv-AB)*(cv - AC)*(cv - BC)) ;
	}
}