
import java.util.Arrays;
import java.util.List;

public class CapCountInString {
	
//	public static int capCountInStr(String InputString) {
//
//		//to get a count of Capitalized words in a String 
//		//At 0th place i found capital letter "S";
//		String word = "ShaiK";
//		int count=0;
//				
//		for(int i=0;i<word.length();i++)
//		{
//			if(word.charAt(i)>='A'&& word.charAt(i)<='Z') {
//				count++;
//				System.out.println("At "+ i + "th place I found Capital Letter " + word.charAt(i));
//			}
//		}
//		return count;
////		System.out.println(count);
//}


public static void main(String[] args) {
//	System.out.println(capCountInStr("ShaiK"));
	String word = "ShaiK";
	
	char[] str = word.toCharArray();
	
	List<char[]> s = Arrays.asList(str);
	
	int count=0;
			
	for(int i=0;i<word.length();i++)
	{
		s.contains(str[i]>='A'&& str[i]<='Z');
//		if(str[i]>='A'&& str[i]<='Z') {
		count++;
		System.out.println("At "+ i + "th place I found Capital Letter " + str[i]);
		
	}
	System.out.println(count);
}
}
