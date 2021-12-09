package nineDecmber;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class VerifyDate {

	
	public static void main(String[] args) {
		
		
	//get current date and time
		Date CurrentDate = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// SimpleDateFormat method  which is present in  date class
		
		System.out.println(sdf.format(CurrentDate));
		
		// to get calender
		
		//Calendar cal =Calendar.getInstance();
		
		 Calendar cal =  new GregorianCalendar();
  System.out.println(cal.get(Calendar.YEAR));
	  System.out.println(cal.get(Calendar.MONTH));
	  System.out.println(cal.get(Calendar.DATE));
		

	}

}

