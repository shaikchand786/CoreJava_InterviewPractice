package ProgramPractice;

import java.util.Scanner;

public class P19_PalindromeSimple {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of String: ");
        String str = sc.nextLine();

        String nw = "";
        for(int i=str.length()-1;i>=0;i--){
        	nw = nw + str.charAt(i);
        }
        System.out.println(nw);
        
        //Comparison between two strings
        if(str.equalsIgnoreCase(nw)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

}
