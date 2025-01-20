package ProgramPractice;

import java.util.Scanner;

public class P5_Swap2Str {

	public static void main(String[] args) {
	
	//swap two given strings
//		int x = 256; 				//"Chand";
//		int y = 562; 				//"Nazira";
		
		//By using Scanner class for User Input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x value: ");
		int x = scan.nextInt();
		System.out.println("Enter the y value: ");
		int y = scan.nextInt();
		
		x = x+y;	//818
		y =x-y;		//818-562=256
		x= x-y;		//818-256=562
		
//		str1 = str1 + str2;	//ChandNazira
//		str2 = str1.substring(0, str1.length() - str2.length()); //(0, 11-6=5) --> Chand
//		str1 = str1.substring(str2.length());	//Nazira
		
		System.out.println("Swapped from x to y: " + x);
		System.out.println("Swapped from y to x: " + y);
		
	}
}
