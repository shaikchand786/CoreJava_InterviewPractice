package ProgramPractice;

import java.util.Scanner;
public class P1_FibSeries {

	public static void main(String[] args) {
		// Generate Fibonacci Series

		// Use scanner class to get the user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of number_Series : ");
		int fiblength = sc.nextInt();	 //The nextInt() method scans the next token of the input data as an “int”.
		int[] num = new int[fiblength];	//create an array
		// Assign values 0 and 1 to the 0 and 1 indices of the defined array
		System.out.print("Enter the 0th Index number : ");
		num[0] = sc.nextInt();
		System.out.print("Enter the 1st Index number : ");
		num[1] = sc.nextInt();
		
		// Logic for getting the values of all the indices of the array using for loop
		for (int i = 2; i < fiblength; i++)
		{
			num[i] = num[i - 1] + num[i - 2];	//num[2] = num[1] + num[0] = 1 + 0 = 1 ..... 
//			System.out.println(num[i]);
		}
		// Printing the fibonacci series
		System.out.print("fibonacci series: ");
		
		for (int i = 0; i < fiblength; i++)
		{
			System.out.print(num[i] + " ");
		}
		
		System.out.println("----------------------------------------------------------------");
		int fib = 10;   
		for (int i = 2; i < fib; i++)
		{
			int f = (i - 1) + (i - 2);
			System.out.print(f + " ");
		}
		
	}
}
