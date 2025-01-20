package Interview;import com.beust.jcommander.Strings;

//Java program to print diamond star pattern
//Using for loop

//Importing input output classes
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//Main class
public class Interview10_ChangeArrayList {

	// Main driver method
	public static void main(String[] args)
	{
		
		int[] arr = {1, 2, 3,4,5,6};
//		List<int[]> a = Arrays.asList(arr);
		for(int i=2;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
