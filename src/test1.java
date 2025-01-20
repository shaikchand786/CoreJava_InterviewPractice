import java.util.ArrayList;

import org.testng.annotations.Test;
public class test1 {
	@Test
	public void chand() {
		
		//Count the number of elements starting with letter 'A'
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Chand");
		list.add("Nazira");
		list.add("Aman");
		list.add("Ayesha");
		list.add("Anis");
		int count=0;
		
		for(int i=0; i<list.size(); i++)
		{
		
		String newlist = list.get(i);
		System.out.println(newlist);
		if(newlist.startsWith("A"))
		{
			count++;
			continue;
		}
		}
		System.out.println(count);
	}

@Test
public void nazira() {
	
	//Count the number of elements starting with letter 'A'
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("Chand");
	list.add("Nazira");
	list.add("Aman");
	list.add("Ayesha");
	list.add("Anis");

		Long c = list.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		

}	
}
