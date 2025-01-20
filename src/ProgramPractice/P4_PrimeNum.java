package ProgramPractice;

import java.util.*;
public class P4_PrimeNum {

	public static void main(String[] args) {
		// check the number is Prime or not?
		
		// Pass the integer value to check whether it is prime or not.
		
		//To check particular prime number:
//		Prog4 obj = new Prog4();
//		System.out.println(obj.primeNum(7));
		
		//To print list of Prime numbers:
			Scanner s = new Scanner(System.in);  
	       System.out.print("Enter the first number : ");  
	       int start = s.nextInt();  
	       System.out.print("Enter the second number : ");  
	       int end = s.nextInt();  
	       System.out.println("List of prime numbers between " + start + " and " + end + " are: ");  
	       for (int i = start; i <= end; i++) 
	       {  
	           if (primeNum(i)) {  
	               System.out.print(i + "\t");  
	           }  
	       }  
		
	}
	
	public static boolean primeNum(int num) {
		// Validate that the number is neither less than 1 nor equal to 1.
		// It should return false as it cannot be a prime number
		if (num <= 1)
		return false;

		// Logic to check if a number is prime or not. If its Prime, returns true else
		// return false
		for (int i = 2; i < num; i++) {
		if (num % i == 0) {
		return false;
		}
		}
		return true;
	}
}
