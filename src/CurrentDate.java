import java.text.SimpleDateFormat;
import java.util.Date;

//import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("E d/M/y h:m:s:S");
	System.out.println(sdf.format(date));
		System.out.println(date.toString());
	
	}

}
