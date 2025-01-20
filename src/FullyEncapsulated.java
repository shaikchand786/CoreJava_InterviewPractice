
public class FullyEncapsulated {
	private String var;	//private data member
	
	//Getter method for var
	public String getPrivateVar() {
		return var;
	}
	//Setter method for var
	public void setPrivateVar(String var) {
		this.var = var;
	}
	
	public static void main(String[] args) {
		//Creating instance(object) of the Encapsulated class
		FullyEncapsulated encap = new FullyEncapsulated();
		//Setting value in the name member
		encap.setPrivateVar("ChandNaz");
		encap.setPrivateVar("Aman");
		//Getting value of the name member
		System.out.println(encap.getPrivateVar());		
 	}
}
