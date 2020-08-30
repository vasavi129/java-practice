package corejava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Date;

public class DateUtil {
Date getDate(String date) throws ParseException{
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	Date javaDate = format.parse(date);
	System.out.println(javaDate);
	String stringdate = format.format(javaDate);
	System.out.println(stringdate);
	return javaDate;
	
}
public static void main(String[] args) throws ParseException {
	DateUtil dateUtil = new DateUtil();
	Date date = dateUtil.getDate("24/09/2019");
	System.out.println(date);
}
	
	
		

}
