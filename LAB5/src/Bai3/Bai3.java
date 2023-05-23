package Bai3;

	import java.util.Queue;
	import java.util.List;
	import java.util.LinkedList;
	import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int n;
		Scanner nhap = new Scanner(System.in);
		System.out.print("\n- Nhập số phần tử của queue: ");
			n = nhap.nextInt();
		int q;
		for(int i= 0; i<n; i++) {
			System.out.print("\n+ queue["+ (i+1) + "] = ");
				q = nhap.nextInt();
			queue.offer(q);
		}
		System.out.print("\n==> Hiển thị queue: "+ queue);
		System.out.println("\n - Đầu queue: "+ queue.peek());
	}
}
