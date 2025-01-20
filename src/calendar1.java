import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Calendar;
import java.util.Date;
//import java.util.Calendar;
//import java.util.Date;

public class calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Calendar	cal=Calendar.getInstance();
	
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y h:m");
	
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println( cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));

	}

}
