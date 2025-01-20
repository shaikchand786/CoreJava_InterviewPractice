package Demo;

import java.util.LinkedHashSet;

public class NewPractice {
	public static void main(String args[]) {
		//remove duplicate char in a string
		String s = "summersoon";
		
		//
		char[] str = s.toCharArray();	//string to array
		LinkedHashSet<Character> dup = new LinkedHashSet<Character>();	//to remove duplicate char in array
		for(char ch : str) {
			dup.add(ch);
		
		}
		System.out.println(dup);
		
	}

}
