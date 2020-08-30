package corejava;

import java.util.Date;
//import java.sql.Date;
public class StringToSQLDateExample {
public static void main(String[] args) {
	 long millis=System.currentTimeMillis();  
//Date date=Date.valueOf(millis);//converting string into sql date.
	// java.sql.Date date=new java.sql.Date(millis);
	 Date date1 = new Date(millis);
	 Date dat = new Date();
System.out.println(date1);
System.out.println(millis);
System.out.println(dat.toString());
}
}