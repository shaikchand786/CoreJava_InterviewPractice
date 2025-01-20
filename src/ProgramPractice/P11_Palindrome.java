package ProgramPractice;

import java.util.Scanner;
public class P11_Palindrome {

	public static void main(String[] args) {
		// String is Palindrome or not?
		//Palindrome: A palindrome number is a number that is same after reverse.
		String str = "CahaC";
		char x = 0;
		int i=0;
			for(int j=str.length()-1;j>0;j--) {
				x = str.charAt(j);
		}
			if(str.charAt(i)==x) {
				System.out.println("Its Palindrome");
			}
			else {
				System.out.println("Its not Palindrome");
			}
	}
}
