import static org.testng.Assert.assertEquals;

public class PS2 extends PS3{
	
	int a;	// class level variable
	
	public PS2(int x) {	//x ---> instance variable
		// TODO Auto-generated constructor stub
		super(x);
		this.a = x;
	}

	public int incr() {
		a = a + 1;
		return a;
	}
	public int decr() {
		a = a - 1;
		return a;
	}
}
