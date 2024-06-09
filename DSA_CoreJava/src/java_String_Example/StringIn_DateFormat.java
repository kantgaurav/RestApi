package java_String_Example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class StringIn_DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> dates = new ArrayList<String>();
		
		List<Date> liDates= new ArrayList<Date>();

		dates.add("23/JAN/2000");
	
	   dates.add("13/JUN/2000");

		dates.add("03/APR/2000");
		
		System.out.println(dates);
		
		String pattern = "dd-MM-yyyy";
		  SimpleDateFormat sf = new SimpleDateFormat(pattern);
		    
		  LocalDateTime ldt = LocalDateTime.parse(sf.format(dates.get(0)));
		  
		  System.out.println(ldt);
		



	}

}
