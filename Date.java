//This part of the program keeps track of
// the date

        /*
        ***IF we want a different format for the date,
        refer to below code.
        See following link for additional info:
        http://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html

        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        Date now = new Date();
        dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Today is " + dateFormatter.format(now));
        */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date {
  public static void main(String[] args){

        Date now = new Date();
        System.out.println("Today is " + now);

     }
  }
