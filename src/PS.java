import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS extends PS1 {
	
	@Test
	public void hello(){
		iamHere();
		PS2 alloper = new PS2(5);
//		int a=5;
		System.out.println(alloper.incr());
		System.out.println(alloper.decr());
//		PS3 alloper1 = new PS3(4);
		System.out.println(alloper.multi5());
		System.out.println(alloper.multi2());
	}
	
	@BeforeMethod
	public void bfmtd() {
		System.out.println("I am executing before you start the method");
	}
}
