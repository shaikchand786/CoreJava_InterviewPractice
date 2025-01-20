package ProgramPractice;

public class P7_CountOfCapStr {

	public static void main(String[] args) {
		// Write a Java Program to get the count of Capitalized words in a String.
		int count=0;
		String str = "ChandNaz ChandNaz ChandNaz ChandNaz";
		for(int i=0;i<str.length();i++) {
//			Character.isUpperCase(): The Character class wraps a value of the primitive_type char in an object.
//			An object of class Character contains a single field whose type is char. 
			
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.println("At the position of "+ i + " I found Capital Letter as: " + str.charAt(i));
				count++;
			}
			
		}
		System.out.println("Total count of Capitalized words are:  " + count);
		
	}
}
