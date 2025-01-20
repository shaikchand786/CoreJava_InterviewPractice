package Interview;import com.beust.jcommander.Strings;

//Java program to print diamond star pattern
//Using for loop

//Importing input output classes
import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.lang.Iterable;

//Main class
public class Interview12_removeDup {

	// Main driver method
	public static void main(String[] args)
	{
		// Input : Today is a good day
		// Output : Tisg
		
		        String str = "Today is a good day";
//		        List<String> s = Arrays.asList(str);
//		        System.out.println(s);
		        LinkedHashSet<Character> rDup = new LinkedHashSet<Character>();
		        for(int i=0;i<str.length();i++)
		        {
		        	rDup.add(str.charAt(i));
//		            rDup.remove(str.charAt(i));    
		        }
		        System.out.println(rDup);
		        for(char st : rDup) 
		        {
		           	System.out.print(st);
		        }
		
	}
}
