
public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];	//creating an array
		a[0][0] = 5;
		a[0][1] = 2;
		a[0][2] = 20;
		a[1][0] = 4;
		a[1][1] = 1;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 0;
	
		int min = a[0][0];
		int minCol=0;
		int max=a[minCol][0];//5
		for(int i=0; i<3; i++) {
			
			for(int j=0;j<3; j++) {
				
				
				if(a[i][j]<min)
				{
					min = a[i][j];
					minCol = i;
				}
//				System.out.print(a[i][j]);
//				System.out.print("\t");
			}
//			System.out.println(min);
			
		}
//		System.out.println(min);2a[0][minCol]=3
		for(int k=0;k<3;k++) {
			if(a[minCol][k]>max) {
				max = a[minCol][k];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
