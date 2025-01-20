
public class ReverseString {

	public static void main(String[] args) {
//		// Java program to ReverseString using "StringBuilder"
//		String name = "Shaik Chand";
//		StringBuffer sb = new StringBuffer();
////		// append a string into StringBuilder 'sb'
//		sb.append(name);
////		// reverse StringBuilder "sb"
//		sb.reverse();
//		System.out.println(sb);
		
		//Reverse a String  by converting string to characters one-by-one
//		String name = "Shaik Chand";
//		//convert String to character array by using toCharArray
//		char[] conv = name.toCharArray();
//		for(int i = conv.length - 1;i >= 0;i--) {
//			System.out.println(conv[i]);
//		}
		
		String name = "Shaik Chand";
//		char[] conv = name.toCharArray();
		for(int i= name.length()-1;i>=0;i--)
		{	
			System.out.println(name.charAt(i));
		}
		
	}

}
