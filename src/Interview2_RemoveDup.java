import java.util.*;   

public class Interview2_RemoveDup {

	public static void main(String[] args) {
		// Remove duplicate letters from a String (summersoon)
		
		String s = "summersoon";
		char[] str = s.toCharArray();	//convert string into Character array
		
//		System.out.println(str);
		
		int index=0;
		//summerson
		  // Traversing character array 
		for(int i=0;i<s.length();i++)
		{
			
			// Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }
            if(j == i)    
                {    
                	str[index++] = str[i];
                }
               
        }   
        String newString = String.valueOf(Arrays.copyOf(str, index));
        System.out.println(newString);
        
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
        //Add each character of the string into LinkedHashSet   
        for(int i=0;i<s.length();i++)   
            set.add(s.charAt(i));   
           System.out.println(set);
           for(Character ch : set)   
             System.out.print(ch);
           
           System.out.println("");
           System.out.println("---------------------By using LinkedHashSet<>() & StringBuilder() classes---------------------");
//           String string = "Summercool";
//           char[] chars = string.toCharArray();	//convert string into Character array
           LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();	// Create an object of 'LinkedHashSet<>()'class
           for (char c : str) {
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
		
		//Create LinkedHashSet of type character 
//		String s = "summersoon";
//        LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
//        //Add each character of the string into LinkedHashSet   
//        for(int i=0;i<s.length();i++)   
//            set.add(s.charAt(i));   
//           System.out.println(set);
//        // print the string after removing duplicate characters   
//        for(Character ch : set)   
//            System.out.print(ch);   
	}

