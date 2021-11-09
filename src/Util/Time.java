package Util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static Date textToDate(String text) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("HH:mm");
		Date date = (Date)formatter.parse(text);
		return date;
	}
	
}
