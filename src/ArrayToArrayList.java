import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Chand", "Naz", "Naz"};
		List<String> ArrayListName = Arrays.asList(name);
//		ArrayListName.add("Amani");
		
//		System.out.println(ArrayListName);
//		System.out.println(ArrayListName.contains("Aman"));
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
		
		for(int i=0;i<name.length;i++) {
			System.out.println(ArrayListName.get(i));
//			System.out.println(ArrayListName);
		}
	}

}
