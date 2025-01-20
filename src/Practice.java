import java.util.*;
public class Practice {
	
	public static Object RemoveDuplicate() {
		System.out.println("-----------Remove duplicate char using 'LinkedHashSet<>()' & 'StringBuilder()' classes----------------");
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
		return sb;
	}
	
	public static Object RemoveDup() {
		
		 //Remove duplicate characters from given string "Summercool"
		System.out.println("-----------Remove duplicate char using 'LinkedHashSet<>()'----------------");
		String dup = "Summercool";
//		char[] str = dup.toCharArray();
		//By instantiating 'ListedHashSet<datatype>' class
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<dup.length();i++)
		set.add(dup.charAt(i));
		System.out.println(set);
		for(Character ch : set) {
			//we will create a new empty string and calculate the original Character's length.
			System.out.print(ch.toString());
		}
//		
//		int index=1;
//		for(int i=0;i<dup.length();i++) {
//			for(int j=0;j<i;j++) {
//				if(str[i]== str[j] )
//				{
//					break;
//				}
//				if(j==i)
//				{
//					str[index++] = str[i];
//				}
//			}
//			System.out.println(String.valueOf(Arrays.copyOf(str, index)));
//		}
		return dup;
	}
	
	//Main method
	public static void main(String[] args) {
		Practice.RemoveDuplicate();
		Practice.RemoveDup();

		// Reverse a string "ChandNaz"
		System.out.println("");
		System.out.println("-------------------------Reverse the String---------------------");
		String name = "ChandNaz";
//		char[] n = name.toCharArray();
		//By using 'StringBuffer' class
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		System.out.println(buffer.reverse());
//		for(int i=name.length() - 1;i>=0;i--) {
//			System.out.print(name.charAt(i));
//		}
		System.out.println("");
		
		// Print a given String 3 times
		System.out.println("-------------------------Repeat String - 3 times---------------------");
		String city = "Hyderabad";
		for(int i=0;i<3;i++) {
			System.out.println(city);
		}
		System.out.println("");
		
		//To print Array to List
		System.out.println("-------------------------Array to List---------------------");
		Integer[] arr  = {1, 2, 3, 3, 4, 4, 4, 5};
//		Character[] arr = {'a', 'b', 'c', 'd', 'e'};
//		List<Integer> list = Arrays.asList(arr);
		//Using the Arrays.asList() method.
//		ArrayList<Object> newList = new ArrayList<Object>(list);
		LinkedHashSet<Integer> listNew = new LinkedHashSet<Integer>();
		for(Integer listN : arr)
		{
			listNew.add(listN);
		}
		System.out.println(listNew);
		System.out.println("");                                                                                                         
//		for(Character itemList : newList) {
//			System.out.print(itemList);
//		}
		//Using the Stream.of() method.
//		List<Integer> list =  Stream.of(arr).collect(Collectors.toList());
//		System.out.println(list);
		
	}
}
