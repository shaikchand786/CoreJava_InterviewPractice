import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		// To Reverse an Array by using 'StringBuilder'
		String[] ArrayList =  {"Chand", "Naz", "Aman"};
//		Object[] Array = {"C", "h", "a", "n", "d"};
		
//		Collections.reverse(z);	//By using 'Collections'
		StringBuilder sb = new StringBuilder();
		for(int i=ArrayList.length-1;i>=0;i--) {
		sb.append(ArrayList[i]).append(" ");
		}
//		String[] reversedArray = sb.toString().split(" ");
//		System.out.println(Arrays.toString(reversedArray));
		System.out.println(sb);
	}

}
