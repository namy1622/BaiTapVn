package Bai4;

	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.Set;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.HashSet;
public class Bai4 {
	public static void main(String[] args) {
		int size;
		Scanner nhap = new Scanner(System.in);
		System.out.print("\n- Nhập chiều dài cho mảng: ");
			size = nhap.nextInt();
		float[] arr = new float[size];
		
		System.out.println("\n - Nhập phần tử cho mảng: ");
		for(int i= 0; i< size; i++) {
			System.out.print("\n+ arr["+(i+1)+ "]: ");
				arr[i] = nhap.nextFloat();
		}
		Set<Float> set = new HashSet<Float>();
		Map<Float, Integer> map = new HashMap<Float,Integer>();
//-SET-------------------------------------------------------		
		for(int i=0; i<size; i++) {
			addSet(set,arr[i]);
		}
		System.out.println("\n - Phần tử trong Set chỉ xuất hiện trong mảng 1 lần là");
//-MAP-------------------------------------------------------
		for(int i = 0; i< size; i++) {
			addMap(map,arr[i]);
		}
		System.out.println(set);
		System.out.println("\n Phần tử  trong Map chỉ xuất hiện 1 lần:");
		for(float key : map.keySet()) {
			if(map.get(key)==1) {
				System.out.print(key+"; ");
			}
		}
	}
	public static void addSet(Set<Float> set, float element) {
		boolean check = set.add(element);
		if(check == false) {
			set.remove(element);
		}
	}
	
	public static void addMap(Map<Float,Integer> map, float element) {
		if(map.containsKey(element)) {
			int count = map.get(element)+1;
			map.put(element, count);
		}
		else map.put(element, 1);
	}
}
