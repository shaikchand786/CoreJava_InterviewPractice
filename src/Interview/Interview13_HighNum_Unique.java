package Interview;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Interview13_HighNum_Unique {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 2, 1, 3, 4};
		List<int[]> list = Arrays.asList(arr);
		LinkedHashSet<Integer> array = new LinkedHashSet<Integer>();		
		for(int i=0;i<arr.length;i++){
		 	array.add(arr[i]);
//		  	array.remove(arr);
		}
		System.out.println(array);
		//output: [1, 2, 3, 4]

	}

}
