package example;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class DateClass {
 public static void main(String args[]){
   Date date1 = new Date();
   for(long i = 1 ; i <= 100000000000000l ; i*=10){
    date1.setTime(i);
   System.out.println(date1.toString());
   }
   System.out.println("\n-------------------------------------------");
   Date date2 = new Date();
                                                                               Date date3 = new Date(2000,3,23);
   System.out.println(date2);
   System.out.println(date3.toString());
   boolean a = date2.after(date3);
   System.out.println("Date d2 comes after Date 3 " + a);
    boolean b = date2.before(date3);
   System.out.println("Date d2 comes before Date 3 " + b);
   System.out.println("\n-------------------------------------------");
   Calendar cal = Calendar.getInstance();
   System.out.println(cal.getTime());
   System.out.println("\n-------------------------------------------");
   GregorianCalendar gr1 = new GregorianCalendar(1900,11,23);
   System.out.println(gr1.getTime());
   System.out.println(gr1.get(gr1.DATE));
   System.out.println(gr1.get(gr1.YEAR));
   System.out.println(gr1.get(gr1.MONTH));
   System.out.println(gr1.get(gr1.DAY_OF_MONTH));
   System.out.println(gr1.get(gr1.HOUR));
   System.out.println(gr1.get(gr1.MINUTE));
   System.out.println(gr1.get(gr1.SECOND));
   System.out.println(gr1.get(Calendar.AM_PM) + gr1.getTimeZone().getDisplayName());
   System.out.println("\n-------------------------------------------");
  
 }
}
