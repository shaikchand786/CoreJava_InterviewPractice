
	import java.util.*;
	public class RemoveDupCharInString {
	    public static void main(String[] args) 
	    {
	         
	         String str = "chandchandcha";
	         char[] arr = str.toCharArray(); 	//convert string into Character array
	         LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
	           for (char c : arr) {
	               charSet.add(c);
	           }
//	           System.out.print(charSet);
	           StringBuffer sb = new StringBuffer();
	           for(char s : charSet) {
	        	   sb.append(s);
	           }
	           System.out.println(sb);
	    }
	}
