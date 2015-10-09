import java.util.Date;
import java.text.DateFormat;

public class DateChangeActivity {

	public static void main(String[] args) {
		Date now = new Date();
		
		DateFormat formattedDate = DateFormat.getDateInstance(); 
		DateFormat formattedTime = DateFormat.getTimeInstance();
		
		
		String dateStr = formattedDate.format(now);
		String timeStr = formattedTime.format(now);
		
		
		System.out.println("Today's Date is: " + dateStr);
		System.out.println("The time is: " + timeStr);
	}

}