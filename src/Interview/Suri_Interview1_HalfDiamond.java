package Interview;

public class Suri_Interview1_HalfDiamond {

	public static void main(String[] args) {
//		 int n=5;
		 
//		 for(int i=0;i<n;i++) {
//			 for(int j=0;j<i;j++) {
//				 System.out.print(" ");
//			 }
//			 //To print Half-Diamond tree as 'Reverse':
////			 for(int k=n-i;k>=1;k--)   {
////				 System.out.print(k+" ");
////			 }
//			 System.out.println();
//		 }
//	
		 int n,m, number=5;
		 for (m = 1; m <= number; m++) 
		 {

	   			// Inner loop 1 --> print whitespaces inbetween
				for (n = 1; n <= number - m; n++) {
					System.out.print(" ");
				}

				// Inner loop 2 --> prints 'star(*)'
				for (n = 1; n <= m * 2 - 1; n++) {
					System.out.print("*");
				}

			// Ending line after each row
				
			System.out.println();
		}
	}
}
