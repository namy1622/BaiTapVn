package Bai2;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Stack;
public class Bai2 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int n;
		
		Scanner nhap = new Scanner(System.in);
		System.out.print("\n Nhập vào số phần tư nhập vào stack: ");
			n = nhap.nextInt();
		int in;
		for(int i = 0; i<n; i++) {
			System.out.print("\n + stack["+(i+1)+"]: ");
				in = nhap.nextInt();
				 stack.add(in);
				in = 0;
		}
		System.out.println("\nStack: "+stack);
		
		int m;
		do {
			System.out.print("\n - Nhập m (m<n): ");
			m = nhap.nextInt();
			if(m>n) {
				System.out.println("\n Nhập lại...");
			}
		}while(m>n);
		
		System.out.println("\n Lấy ra "+ m + " phần tử trong stack...");
		for (int i= 0 ; i<m;i++) {
			System.out.print(stack.get(i)+ "\t");
		}
	}
}
