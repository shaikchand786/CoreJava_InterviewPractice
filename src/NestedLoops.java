
public class NestedLoops {

	public static void main(String[] args) {
		//How to print Pyramid Triangle?
		int k=1;
		for(int i=1;i<4;i++)		//outer loop
		{
			for(int j=1;j<=i;j++)	//Inner loop
			{
				
				System.out.print(k*2);
				System.out.print("\t");	//Providing a space between numbers
//				k++;	//continuation of series
				 k++;
			}
			System.out.println("");//after inner loop is finish, cursor should enter into a new line. 
		}

	}

}
