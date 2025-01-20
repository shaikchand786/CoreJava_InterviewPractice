package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview9_DupHighNum {
	public static void main(String arg[]) {
		
		//Duplicate numbers with its count
		int[] arr = {4,9, 2, 5,8,  8,2,1};
		int highNum = arr[0];
		int numCount = 0;
		ArrayList<Integer> empty = new ArrayList<Integer>();
		ArrayList<Integer> dup = new ArrayList<Integer>();
		ArrayList<Integer> unq = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			if(!empty.contains(arr[i])) 
			{
				empty.add(arr[i]);
				count++;
				for(int j=i+1;j<arr.length;j++) 
				{
					if(arr[i]==arr[j]) {
						count++;
						//Highest in duplicate numbers?
						if(numCount<=count ) {
							numCount = count;
							if(highNum < arr[i]) {
								highNum = arr[i];
							}
						}	
						
					}
				}				
				//To print duplicate & unique numbers
				if(count>1) {
					dup.add(arr[i]);
					System.out.println("Duplicate number is: " + arr[i] + " and Count for it is: " + count);
				}
				else {
					unq.add(arr[i]);
					System.out.println("Unique number is: " + arr[i] + " and Count for it is: " + count);
				}
				
		
			}//if cond.
		}//outer for loop.
		System.out.println("---------------------------");
		System.out.println("Duplicate numbers are:" + dup);
		System.out.println("Unique numbers are:" + unq);
		System.out.println("Highest Duplicate number is:  " + highNum);
		System.out.println("Highest Duplicate number is:  " + highNum + "  and Count for it is: " + numCount);
		
		
		//Method2: To find highest number in Duplicates?
//		int[] arr = {4, 3, 6, 6, 4, 8, 1, 9, 3, 6, 7, 8, 6};
		System.out.println("---------------------------");
		Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(
		                Function.identity(), Collectors.counting() ));
		// groupingBy() – this is the method of Collectors class to group objects by some property and store results in a Map instance.
		//Function.identity() – it is a functional interface in Java; the identity method returns a Function that always returns its input arguments.
		//Collectors.counting() – this Collectors class method counts the number of elements passed in the stream as a parameter.
		System.out.println(map);	//output: {1=1, 2=2, 4=1, 5=1, 8=2, 9=1}

		Map.Entry<Integer, Long> max = Collections.max(
		        map.entrySet(), Map.Entry.comparingByValue()
		);
//		Collections.max() --> Returns: the maximum element of the given collection.
//		map.entrySet() --> Returns: a set view of the mappings contained in this map.
//		comparingByValue() --> Returns a comparator that compares Map.Entry in natural order on value.
                                                                                                                                                                                                                                                                                                               
		System.out.println(max.getKey());
		
  	}
}
