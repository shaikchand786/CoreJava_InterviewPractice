package ProgramPractice;

public class P13_CountRepeatedChar {

	public static void main(String[] args) {
		
		String str = "fissionlabs";
        boolean[] visited = new boolean[str.length()]; // To track processed characters
        //Above statement  creates a boolean array of size equal to the length of the string 'str'.
        //When a character is counted as a duplicate, its corresponding index in the visited array is marked as true.
        //This avoids re-processing the same character multiple times.

       // Outer loop to iterate through the string
        for (int i = 0; i < str.length(); i++)
        {
            if (visited[i]) continue; // Skip already processed characters

            char currentChar = str.charAt(i);
            int count = 1;

            // Inner loop to count occurrences of the current character
            for (int j = i + 1; j < str.length(); j++)
            {
                if (currentChar == str.charAt(j)) {
                    count++;
                    visited[j] = true; // Mark as processed
                }
            }

            // Print if the character is a duplicate
            if (count > 1) {
                System.out.println("The count of duplicate character " + currentChar + " is : " + count);
            }
        }

	}

}
