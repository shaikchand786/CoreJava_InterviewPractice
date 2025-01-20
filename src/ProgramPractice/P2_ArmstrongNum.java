package ProgramPractice;

import java.io.*;


public class P2_ArmstrongNum {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		//To check whether given number is Armstrong or not?
//		An Armstrong Number is a number in which the sum of the cubes of each digit is equal to the number itself.
//		Armstrong number is a number that is equal to the sum of cubes of its digits.
		
		//1. take a number as N=12
		//2. logic: R = 1**3 + 2**3
		//3. if Armstrang num then R=N if not it's not an armstong num
//		int n =153;
		DataInputStream reader = new DataInputStream(System.in);
      // Reading integers

      System.out.print("Enter an integer:");

      int n = Integer.parseInt(reader.readLine());
		P2_ArmstrongNum.ArmStrong(n);
	
	}
	
	public static void ArmStrong(int origNum) throws NumberFormatException, IOException {
//		DataInputStream reader = new DataInputStream(System.in);
//        // Reading integers
//        int origNum = Integer.parseInt(reader.readLine());
//        System.out.print("Enter an integer: " + origNum);
//		int origNum = 153;
		int n = origNum;
		double r=0;
		
		while(n!=0) {
			int Num=n%10;
			r = r + Math.pow(Num, 3);
			n = n/10;
		}
		if(origNum == r) {
			System.out.println("Its an Armstrong Number");
		}
		else {
 			System.out.println("Its not an Armstrong Number");
 			}
		
}
	
}