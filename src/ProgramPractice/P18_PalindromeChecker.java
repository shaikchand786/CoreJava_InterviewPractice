package ProgramPractice;

public class P18_PalindromeChecker {

	// Method to reverse a string
    public static String reverseString(String input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
            
        }
        return reversed;
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed); // Case-insensitive comparison. Return type: True or False
    }

    // Test method
    public static void testPalindrome(String testString) {
        try {
            System.out.println("Testing string: " + testString);
            String reversed = reverseString(testString);	//reverseString() method to reverse a String
            System.out.println("Reversed string: " + reversed);
            //to check whether string is a palindrome or not:
            boolean result = isPalindrome(testString);
            if (result)	//if result is 'True'then enter into loop
            {
                System.out.println("The string \"" + testString + "\" is a palindrome.\n");
            } 
            else {
                System.out.println("The string \"" + testString + "\" is not a palindrome.\n");
            }
        }
        catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        // Test cases
        testPalindrome("madam");
        testPalindrome("hello");
        testPalindrome("racecar");
        testPalindrome(null); // This will trigger an exception
        testPalindrome("Palindrome");
    }

}
