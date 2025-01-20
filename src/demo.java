import java.util.LinkedHashSet;

public class demo {

	public static void main(String[] args) {
		
        String string = "Summercool";
        char[] chars = string.toCharArray();	//convert string into Character array
        LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();	// Create an object of 'LinkedHashSet<>()'class
        for (char c : chars) {
            charSet.add(c);
        }
        System.out.println(charSet);	//Output: [S, u, m, e, r, c, o, l]
        StringBuilder sb = new StringBuilder();	
        // 'StringBuilder()' class ->provides a mutable sequence of characters. 
        //	Used for dynamic string manipulation such as appending new characters to an existing string. 
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());	//Output: Sumercol
        
	}
}
