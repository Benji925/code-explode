//This part of the program keeps track of
// the date

        /*
        ***IF we want a different format for the date,
        refer to below code.
        See following link for additional info:
        http://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html

        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        CurrentDate now = new CurrentDate();
        dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Today is " + dateFormatter.format(now));
        */

import java.util.Calendar;

public class CurrentDate {
  public static void main(String[] args){
      int current;
      current = Calendar.DAY_OF_WEEK;
      System.out.println("Today is " + current);

     }
  }
