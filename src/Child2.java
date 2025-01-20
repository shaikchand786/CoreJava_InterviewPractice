import javax.print.attribute.standard.Sides;

public class Child2 extends Parent {

	String Color ="blue";
	//super keyword can be used to access the varibales, methods and constructors of the parent class
	
//	public Child2() {
//		super();
//		System.out.println("I am child sonstructor");
//		
//	}
	
	public void getData() {
		
		System.out.println("I am child method");
		super.getData();
	}
	 public void gogree(int i) {
		 
		super.gogree(i);
		System.out.println("I am Blue");
	}
	
	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		Child2 b = new Child2();
		b.getData("White");
//		Parent p = new Parent();
		b.gogree(10);
	}
	
	public void getData(String Color) {
		System.out.println(Color);
		System.out.println(super.Color);
	}

}
