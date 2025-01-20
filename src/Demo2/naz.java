package Demo2;

public class naz {
	
	int i=2;
	public int j=2;
	private int a=2;
	protected int k=2;
	public void method1() {
		System.out.println("M1");
	}
	private void method2() {
		System.out.println("M2");
	}
	protected void method3() {
		System.out.println("M3");
	}
	
	 void method4() {
		System.out.println("M4");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naz n = new naz();
		n.method2();
		n.method3();
		
	

	}
	
	//default--var/methods--access only within the same package classes
	//public--var/methods-- access any package class
	//private--var/methods--access only within the class where it is declared
	//protected--var/methods--same like default + other package sub-class

}
