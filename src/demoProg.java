import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demoProg {

	public static void main(String args[]) {
		String name = "ChandNaz";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.println(name.charAt(i));
		}
		int	a=Aman();
		System.out.println(a);
		demoProg demo = new demoProg();
//		demo.ArrList();
		System.out.println("****************************************");
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i<5);
		
	}
	public static int Aman() {
		
		System.out.println("My name is Aman");
		return 2;
		
	}
	
	public String ArrList() {
		String[] arr = {"chand", "Naz", "Aman"};
		List<String> aList = Arrays.asList(arr);
		aList.contains("Aman");
//		aList.add(0, "ChandNaz");
		System.out.println(aList);
		return toString();
	}
}
