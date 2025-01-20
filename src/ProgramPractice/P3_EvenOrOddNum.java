package ProgramPractice;

import java.util.ArrayList;
import java.util.Iterator; 

public class P3_EvenOrOddNum {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Project\\chromedriver_v114\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			num.add(i);
		}
//		System.out.println(num);
		Iterator<Integer> it = num.iterator();
		while(it.hasNext()) {
			Integer newNum = it.next();
			
			if(newNum % 2 == 0) {
				System.out.println("Even Number is: " + newNum);
			}
			else {
				System.out.println("Odd Number is: " + newNum);
			}
		}
		

		
	}
}