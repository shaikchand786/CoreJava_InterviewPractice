package Interview;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview_MaxRepeatWord {

	public static void main(String[] args) {
		// 
		String[] array = {"java", "for", "java", "a", "portal", "to", "learn", "can", "be", "computer", 
						"mouse", "zoom", "yup", "fire", "in", "be", "data", "java"};
			System.out.println("----------------Using 'HashMap' concept --------------------------");
		        // Create a HashMap to store the word frequencies
		        Map<String, Integer> wordCountMap = new HashMap<>();  //creates a HashMap object which stores 'key-value' pairs.
		        //<String, Integer> defines the types of keys and values in the map.

		        // Count the occurrences of each word
		        for (String word : array)
		        {  
		            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
//		            Above step is used to update the count of occurrences for a word in a HashMap (wordCountMap). 
		            //Here's a breakdown of what each part of this line does:
//
//		            1. wordCountMap.getOrDefault(word, 0):
//		            This method checks if the 'word' is 'already present in the wordCountMap'.
//		            If the word 'exists' in the map, getOrDefault() returns the ~current count~ (value) associated with that word.
//		            If the word 'does not exist' in the map, it returns the ~default value 0 ~.
		            //For example:
//		            If word = "java" and "java" is already in the map with a count of 2, it will return 2.
//		            If word = "portal" and "portal" is not yet in the map, it will return the default value 0.
		            
//		            2. + 1
//		            If it's the first occurrence of the word (i.e., it wasn't in the map, and getOrDefault() returned 0), 
		            //adding 1 will set the count to 1.
//		            For subsequent occurrences of the word, this will increment the count by 1 each time.
		            
//		            3. wordCountMap.put(word, ...)
//		            The put() method 'inserts or updates or add entries' the value in the 'wordCountMap'.
//		            If the word already exists in the map, put() updates the value with the new count.
//		            If the word does not exist in the map, put() adds the word as a new key with the corresponding count.
//		            Complete Example:
		            
//		            If the word "java" appears for the first time:
//		            wordCountMap.getOrDefault("java", 0) will return 0 (since it's not in the map yet). ~ The expression becomes 0 + 1 = 1.
//		            wordCountMap.put("java", 1) will add the key "java" with the value 1 in the map.
//		            If "java" appears again later:
//		            wordCountMap.getOrDefault("java", 0) will now return 1 (since "java" is already in the map with a count of 1).
//		            The expression becomes 1 + 1 = 2.  
//		            wordCountMap.put("java", 2) will update the count of "java" to 2.
		            
		            //Ensures that every time a word is encountered, it either:
		            	//Adds the word to the map with a 'count of 1' if it's the first-time the word is seen, or
		            	//Increments the count of the word if it's already present in the map.
		        }

		        // Find the maximum repeated word
		        String maxRepeatedWord = "";
		        int maxCount = 0;

		        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) 
		        //This loop is used to 'find the word' that has the highest count in the 'wordCountMap' which is a HashMap<String, Integer>
//		        	where the key (String) --> word, and the value (Integer) --> number of times that word appears in the array
		        //"wordCountMap.entrySet()" returns a 'set of all key-value pairs' (called "entries") in the map.
//		        entry --> holds each key-value pair from the map.
//		        	Example:
//		        		o	Let's say 'wordCountMap' contains {"java"=3, "for"=5, "be"=2}.
//		        		o	On the first iteration, 'entry' will be {"java"=3}.
//		        		o	On the second iteration, 'entry' will be {"for"=5}.
//		        		o	On the third iteration, 'entry' will be {"be"=2}.	
		        {
		            if (entry.getValue() > maxCount)	//'entry.getValue()' retrieves the number of occurrences of the current word.
		            									//'maxCount' is a variable that stores the highest count found so far.
		            {
		                maxCount = entry.getValue();	//gives the word (the key of the map)
		                maxRepeatedWord = entry.getKey(); //gives the count of 'how many times that word has appeared'(the value of the map)
		            }
//		            If the 'if condition' is true (the current word has a higher count than the previous maximum), 
		            //this line updates 'maxCount' to the value of the current word's count.
		            //Summary: After the loop completes, 'maxCount' will hold the highest count, 
		            //			& 'maxRepeatedWord' will hold the word associated with that count.
		        }
		        System.out.println("The most repeated word is '" + maxRepeatedWord + "' with count " + maxCount);
//		        Explanation:
//		        	The HashMap stores each word as a key and the count of occurrences as the value.
//		        	The loop iterates over the array and populates the map by incrementing the count each time a word is encountered.
//		        	A second loop finds the word with the highest count by comparing each entry in the map.
		        
		        
//		        Example Scenario:
//		        In the context of counting words from an array, this HashMap will store words as keys (e.g., "java", "for") 
//		        and their corresponding frequencies as values (e.g., 3, 5). You'll populate it by iterating through the array 
//		        and updating the counts for each word.
		        
		        
		        
		        System.out.println("----------------Using 'Streams' concept --------------------------");    
		     // Find the most repeated word using streams
		        Map.Entry<String, Long> maxRepeated = Arrays.stream(array)
		                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
		                .entrySet()
		                .stream()
		                .max(Map.Entry.comparingByValue()) // Find the entry with max value
		                .orElse(null);

		        if (maxRepeated != null) {
		            System.out.println("The most repeated word is '" + maxRepeated.getKey() + "' with count " + maxRepeated.getValue());
		        }
//		        Explanation:
//		        	This approach uses Java Streams to group words by their occurrences (groupingBy) and count how often each word appears (Collectors.counting()).
//		        	The max() function is then used to find the word with the highest count.
		        
		        System.out.println("---------------------- Using Collections.frequency --------------------------");
//		        Notes: You can also use Collections.frequency() to count the occurrences, although it is less efficient 
//		        		for larger arrays compared to the HashMap approach.
		        List<String> list = Arrays.asList(array);
//		        String maxRepeatedWord = "";
//		        int maxCount = 0;

		        for (String word : list) 
		        {
		            int count = Collections.frequency(list, word);
		            System.out.println(count);
		            if (count > maxCount) {
		                maxCount = count;
		                maxRepeatedWord = word;
		            }
		        }

		        System.out.println("The most repeated word is '" + maxRepeatedWord + "' with count " + maxCount);
		        
//		        Explanation:
//		        	Collections.frequency() counts the occurrences of a word in the list.
//		        	This approach is simpler but less efficient because frequency() scans the entire list for each word, 
//		        		resulting in O(n²) complexity.
		        
		        System.out.println("---------------------- Using TreeMap (Sorted Order)--------------------------");		        
//		        If you want the repeated words in sorted order by their occurrences or lexicographical order, you can use a TreeMap.
		        TreeMap<String, Integer> WordCount = new TreeMap<>();

		        for (String word : array) {
		        	WordCount.put(word, WordCount.getOrDefault(word, 0) + 1);
		        }

//		        String maxRepeatedWord = "";
//		        int maxCount = 0;

		        for (Map.Entry<String, Integer> entry : WordCount.entrySet())
		        {
		            if (entry.getValue() > maxCount) {
		                maxCount = entry.getValue();
		                maxRepeatedWord = entry.getKey();
		            }
		        }
		        System.out.println("The most repeated word is '" + maxRepeatedWord + "' with count " + maxCount);
//		        Explanation:TreeMap keeps the keys in sorted order, which allows you to get the results in alphabetical order if required.
		        	
//		        Conclusion:  
//		        	HashMap is the most efficient and widely used approach for 'counting word occurrences'.
//		        	Streams offer a 'concise and modern' alternative, especially in Java 8+.
//		        	Collections.frequency() is simple but 'less efficient' for large arrays.
//		        	TreeMap provides a sorted approach if needed.
		        
	}

}
