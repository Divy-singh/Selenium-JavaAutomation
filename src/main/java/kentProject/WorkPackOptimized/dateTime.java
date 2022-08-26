package kentProject.WorkPackOptimized;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class dateTime 
{

	public void gmt_time()
	{
		TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date now = new Date();
        String currencydate_time= dateFormat.format(now);
        System.out.println("Current Date in milliseconds is :" + now.getTime());
		System.out.println("Current date and time is " +currencydate_time);
	}
}
