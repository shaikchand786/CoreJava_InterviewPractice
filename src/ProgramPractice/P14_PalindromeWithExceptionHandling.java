package ProgramPractice;

public class P14_PalindromeWithExceptionHandling {

	//Java program to reverse a string and check if it’s a Palindrome, with exception handling
	
	public static void main(String[] args) {
		
		try {
            checkPalindrome("Madam");
            checkPalindrome("Hello");
            checkPalindrome(null); // Will throw an exception
        } 
		catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

		public static void checkPalindrome(String str) throws Exception
		{
	        if (str == null) {
	            throw new Exception("Input string cannot be null");
	        }
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		String newstr = sb.reverse().toString();
		
		if(str.equalsIgnoreCase(newstr)) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}

	}

}
