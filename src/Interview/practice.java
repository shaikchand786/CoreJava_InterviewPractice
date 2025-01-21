package Interview;



public class practice {

	public static void main(String[] args) {
		// Fibonacci Series:
		int num = 10;	//length of the series
		int firstNum = 0;	//first num in the series
		int secondNum = 1;	//second num in the series
		
		System.out.println("Fibonacci Series: ");
		System.out.println("--------------------------------------");
		System.out.println( "First Number of FS: " + firstNum + "");
		System.out.println("Second Number of FS: " + secondNum + "");
		
		for(int i=2; i<=num; i++) 		
		{
			int newNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = newNum;		
			System.out.println(newNum + "");
		}	
	}
}
