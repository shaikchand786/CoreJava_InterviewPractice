package ProgramPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P8_2ndHighNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,6,9,9};
		int temp;
		for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]> arr[j] ) {
						// first we sort the array
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				System.out.print(arr[i]);
			}
		for(int i = arr.length -2; i >=0; i--)
		{
			if(arr[i] != arr[arr.length-1])
			{
				System.out.println("The second largest element " + arr[i]);
				break;
			}
		}
	}
}
