package com.dev.delta.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateBlogUtil {

	static String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	static String[] months = { "Jan", "Feb", "Mar", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	public static String toMonthName(int month) {
		return months[month];
	}

	public static String toDayName(int day) {
		return days[day];
	}

	public static Date toDate(String date, String format) throws ParseException {
		return new SimpleDateFormat(format).parse(date);
	}
	
	public static long diff2dates(String inputString1,String inputString2) throws ParseException
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MMM d HH:mm:ss zzz uuuu" , Locale.US );
		//String inputString1 = "23 01 1997";
		//String inputString2 = "27 04 1997";

		LocalDate date1 = LocalDate.parse(inputString1, dtf);
		LocalDate date2 = LocalDate.parse(inputString2, dtf);
		//long daysBetween = Duration.between(date1, date2).toDays();
		//System.out.println ("Days: " + daysBetween);
		//long daysBetween=0;
		long diffInDays = ( (asDate(date2).getTime() - asDate(date1).getTime()) / (1000 * 60 * 60 * 24) );
		
		//Days d = Days.daysBetween(date1, date2);
		//long days = d.getDays();
		return diffInDays;
	}
	
	public static Date asDate(LocalDate localDate) {
	    return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	  }
}
