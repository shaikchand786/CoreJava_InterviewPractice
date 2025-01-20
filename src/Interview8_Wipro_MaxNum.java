
public class Interview8_Wipro_MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,3,5,4,102,99,8,2};
		
		int max = num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println(max);
	System.out.println("--------------------------------------------------");
	
	//Print a half the array in reverse order
	for(int i=num.length/2 - 1;i>=0;i--) {
		System.out.println(num[i]);
	}
		
	}

}
