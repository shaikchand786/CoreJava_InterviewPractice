import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class PS1 {
	
	public void iamHere() {
		System.out.println("I am here!!!");
	}
	
	@AfterClass
	public void afmtd() {
		System.out.println("I am executing after you end the method");
	}
}
