package Bai5;

	import java.util.Scanner;
	import java.util.TreeSet;
	import java.util.Iterator;
public class Bai5 {
	public static void main(String[] args) {
		int n;
		Scanner nhap = new Scanner(System.in);
		System.out.print("\n- Nhập số phần tử cho mảng: ");
			n = nhap.nextInt();
		float[] arr = new float[n];
		
		System.out.println("\n- Nhập giá trị cho mảng: ");
		for (int i= 0; i<n; i++) {
			System.out.print("\t+ arr["+ (i+1)+"]: ");
				arr[i] = nhap.nextFloat();
		}
		
		TreeSet<Float> set = new TreeSet<Float>(); 
		
		for(int i= 0; i<n; i++) {
			set.add(arr[i]);
		}
		System.out.println("\n Set: "+set);
//------------------------------------------------------------------------		
		float a;
		System.out.print("\n- Nhập số thực A: ");
			a = nhap.nextFloat();
		
		if(set.contains(a)) {
			System.out.println("\n--> "+ a+ " có xuất hiện trong set\n");
		}
		else System.out.println("\n--> "+ a+ " không xuất hiện trong set\n");
//------------------------------------------------------------------------
		Iterator<Float> iterator = set.descendingIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"\t");
		}
		
	}
}
