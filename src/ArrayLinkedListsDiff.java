

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedListsDiff {
	
	
	public static void main(String[] args) {
		int count=100;

		List<Integer> aL = new ArrayList<Integer>();
		long time = addElement(count, aL);
		//Arraylist
		System.out.println("arraylist with " + count + "Elements: " + time + " milliseconds");
		List<Integer> lL = new LinkedList<Integer>();
		time = addElement(count, lL);
		//LinkedList
		System.out.println("LinkedList with " + count + "Elements: " + time + " milliseconds");
	}

	private static long addElement(int number, List<Integer> list) {
		// TODO Auto-generated method stub
		long Start = System.currentTimeMillis();
//		System.out.println(Start);
		for(int i=0;i<number;i++) {
			list.add(i);
		}
		long End = System.currentTimeMillis();
//		System.out.println(End);
		return End-Start;
	}

}
