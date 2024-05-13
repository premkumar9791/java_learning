package oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BTjavaTutorialsUtil {
	
	public final static String WEBSITE_NAME="google.co.in";
	
	public static Date getDate(String date) throws ParseException {
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date parseDate=dateFormat.parse(date);
	
		return parseDate;
		
		
	}
	
	public static void test(){
		System.out.println("hello...");
	}

}
