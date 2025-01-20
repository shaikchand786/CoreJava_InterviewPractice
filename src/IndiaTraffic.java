
public class IndiaTraffic implements CentralTraffic {
	int naz=6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CentralTraffic a = new IndiaTraffic();
		IndiaTraffic b = new IndiaTraffic();
		
//		b.GoGreen();
//		b.Gored();
//		System.out.println(naz);
		

	}
//	public void chand() {
//	}


	@Override
	public void GoGreen() {
		// TODO Auto-generated method stub
		System.out.println("go green"+ naz);
	}

	@Override
	public void Gored() {
		// TODO Auto-generated method stub
		System.out.println("go red" + naz);
	}

}
