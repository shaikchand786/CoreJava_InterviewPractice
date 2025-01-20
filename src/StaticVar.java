import java.security.PublicKey;

public class StaticVar {

	String address;
	String name;
	static String city;
	static int i;
	static int j;
	static {
		city = "hyd";
		i=0;
		}
	
	
	public StaticVar(String a, String Add) {
		
		//a & Add are local variables
		this.name = a;
		this.address=Add;
//		this.city=city;
		i++;
		System.out.println(i);
		System.out.println(j);
}

	public void naz() {
		System.out.println(address + " " + name + " " + city);
//		int j=0;
		System.out.println(j);
		
	}
	
	public static void chand(String city) {
		System.out.println( city);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar stat = new StaticVar("naz", "Rocktown");
		StaticVar stat1 = new StaticVar("chand", "RK");
//		StaticVar stat = new StaticVar();
		stat.naz();
		stat1.naz();
//		StaticVar.city="chn";
//		chand("hyd");
	}	

}
