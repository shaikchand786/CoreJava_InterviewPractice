package ProgramPractice;

import java.util.HashMap;
import java.util.Map;

public class P21_RepeatedWordInArray_HashMap {

	public static void main(String[] args) {

		// Input array
        String[] words = {"chand", "aman", "Naz", "mom", "aman", "dad", "aman"};

        // Call the method to find the most repetitive word
        String mostRepetitive = findMostRepetitiveWord(words);

        // Print the result
        System.out.println("The most repetitive word is: " + mostRepetitive);
    }

    public static String findMostRepetitiveWord(String[] words) {
        // Map to store the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();
        int maxCount = 0;
        String mostRepetitiveWord = "";

        // Count the occurrences of each word
        for (String word : words) {
            word = word.toLowerCase(); // Making it case-insensitive
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

            // Update the most repetitive word
            if (wordCount.get(word) > maxCount) {
                maxCount = wordCount.get(word);
                mostRepetitiveWord = word;
            }
        }

        return mostRepetitiveWord;

	}

}
