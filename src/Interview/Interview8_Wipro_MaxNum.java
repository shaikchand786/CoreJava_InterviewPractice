package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Interview8_Wipro_MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] num = {1,3,5,4,102,99,8,2};
		
//		int max = num[0];
		
		List<Integer> list = Arrays.asList(num);
		Integer Max = Collections.max(list);
		Integer Min = Collections.min(list);
		
//		for(int i=0;i<num.length;i++) {
//			
//			if(num[i]>max) {
//				max=num[i];
//			}
//		}
		
		System.out.println(Max);
		System.out.println(Min);
	System.out.println("--------------------------------------------------");
	
	//Print a half the array in reverse order
	for(int i=num.length - 1;i>=0;i--) {
		System.out.println(num[i]);
	}
		
	}
}
