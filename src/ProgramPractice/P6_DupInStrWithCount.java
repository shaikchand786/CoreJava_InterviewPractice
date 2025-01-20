package ProgramPractice;

import java.util.*;

public class P6_DupInStrWithCount {

	public static void main(String[] args) {
/* 		Write a Java Program to find the duplicates of a given String.
		Solution: HashMap is used to store elements in the form of key-Value pairs.
		We create a 'hash_map' object and store each character as key
		and the total count of each character as value.
		Then we check the keys whose values are more than 1 using the 'keySet()' method.
		Thus we get the duplicates in the given String.	*/	
		
			String string = "rahulshettyacademy";

			// Creating a 'hash_map' object
			HashMap<Character, Integer> hash_map = new HashMap<>();
			char[] strArray = string.toCharArray();
			
			for (char c : strArray) {
				if (hash_map.containsKey(c)) {	//true if this map contains a mapping for the specifiedkey.
					hash_map.put(c, hash_map.get(c) + 1);	// put() --> the previous value associated with key, or null if there was no mapping for key.
					//get() --> the value to which the specified key is mapped, or null if this map contains no mapping for the key
				}

				else {
					hash_map.put(c, 1);
				}
			}
			System.out.println(hash_map);
			// Store the key-values in a set and then get the number of each duplicate character.
			Set<Character> keys = hash_map.keySet();
			for (char c : keys) {	
				if (hash_map.get(c) > 1) {
					System.out.println(c + "-->" + hash_map.get(c));
				}
			}

			
	}
}