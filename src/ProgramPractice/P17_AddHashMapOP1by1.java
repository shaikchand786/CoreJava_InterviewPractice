package ProgramPractice;

import java.util.HashMap;

public class P17_AddHashMapOP1by1 {

	public static void main(String[] args) {
		// how you can use a HashMap to add string values and display them one by one in Java
		
		HashMap<String, Object> str =new HashMap<String, Object>();
        str.put("a", 3);
        str.put("b", 5);
        str.put("b", 9);
        str.put("d", 12);
        str.put("c", 12);
        
        System.out.println(str);
        
        for(HashMap.Entry<String, Object>  entry : str.entrySet())	//enhanced for loop or for-each loop
        	//entrySet() --> Returns a Set view of the mappings contained in this map.
        {
            System.out.println("Key = " +entry.getKey() + " & Value = " + entry.getValue());
        }
	}

}
