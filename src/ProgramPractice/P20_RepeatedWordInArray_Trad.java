package ProgramPractice;

public class P20_RepeatedWordInArray_Trad {

	public static void main(String[] args) {

		 //most repeatative word inthe given string
        String[] words ={"chand", "aman", "Naz", "mom", "aman", "dad", "aman"};
        // Variables to store the most repeated word and its count
        String repeatedWord = " ";
        int maxCount = 0;
        // Outer loop to iterate through each word
        for(int i=0;i<words.length;i++){
            words[i] = words[i].toLowerCase();
            String currWord = words[i];
            int count=0;
            // Inner loop to count occurrences of the current word
            for(int j=0;j<words.length;j++){
                if(currWord.equals(words[j])){
                    count++;
                }
            }
        // Update the most repeated word and max count if needed
        if(count>maxCount){
            count = maxCount;   
            repeatedWord = currWord;
        }
        }
        System.out.println("Most repeated word in the given array is: " + repeatedWord);

	}

}
