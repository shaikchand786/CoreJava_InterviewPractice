 package ProgramPractice;

import java.util.*;


public class P10_MinMaxArray {

	public static void main(String[] args) {
		// Max & min num 10 & 0
//		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> arrayList = new LinkedList<>();
		arrayList.add(2);
		arrayList.add(0);
		arrayList.add(9);
		arrayList.add(1);
		arrayList.add(10);
//		Collections.sort(arrayList);
		System.out.println( arrayList.get(0));
		System.out.println(arrayList.get(arrayList.size()-1));
//		System.out.println(Collections.max(arrayList));
//		System.out.println(Collections.min(arrayList));
//		System.out.println(arrayList);
//		
		System.out.println("--------------");
		
		
		int[] arr1 = {2, 0, 10, 54, 89, 5};
		Arrays.sort(arr1);
		
		System.out.println( "min - " + arr1[0]);
		System.out.println( "max - " + arr1[arr1.length-1]);
//		System.out.println(arr1.length)[];
//		 List<Integer> b = Arrays.asList(arr1);		 
//		 LinkedList<Integer> AL1 = new LinkedList<Integer>(b);
//		 System.out.println(Collections.max(AL1));
		
//		Integer[] arr1 = {2, 0, 5};
//		 List<Integer> b = Arrays.asList(arr1);		 
//		 LinkedList<Integer> AL1 = new LinkedList<Integer>(b);
//		 System.out.println(Collections.max(AL1));
		System.out.println("--------------");
		String[] arr = {"2", "0", "5"};
		List<String> a = Arrays.asList(arr);
		LinkedList<String> AL = new LinkedList<String>(a);
		System.out.println("Maximum Number in list is: " + Collections.max(AL));
		
		System.out.println("--------------");
		
		Integer[] arrL = {2, 1, 5, 8, 9, 3};
//		Arrays.sort(arrL);
//		System.out.println("Min num is: " + arrL[0]);
//		System.out.println("Min num is: " + arrL[arrL.length - 1]);
		List<Integer> aL = Arrays.asList(arrL);
		ArrayList<Integer> in = new ArrayList<>(aL);
		Collections.sort(in);
		System.out.println(in.get(0));
		System.out.println(in.get(in.size()-1));
		
	}
}
