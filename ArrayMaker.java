import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Calendar;


public class ArrayMaker{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    File fileName = new File("classes.txt");
    String [][] schedule= new String[20][3];


    try {
      Scanner fileReader = new Scanner(fileName);
      for(int i=0;i<schedule.length;i++){
        while(fileReader.hasNext()){
          String day = fileReader.next();
          schedule[i][0]=day;
          String time = fileReader.next();
          schedule[i][1]=time;
          String class1= fileReader.next();
          schedule[i][2]=class1;
          System.out.println(Arrays.toString(schedule));
        }

      }
      fileReader.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Didn't find the file. Go to the library.");
    }
    int todaynum= Calendar.DAY_OF_WEEK;
    String date=whatday(todaynum);
    for(int i=0; i<schedule.length; i++){
      String classdate=schedule[i][0];
      // if(classdate.equals(date)){
      //   System.out.println(Arrays.toString(schedule[i]));
      // }
      System.out.println(classdate);
      // System.out.println(date);
    }
  }
  public static String whatday(int day){
    if(day==1){
      return "Mon";
    }
    if(day==2){
      return "Tue";
    }
    if(day==3){
      return "Wed";
    }
    if(day==4){
      return "Thu";
    }
    if(day==5){
      return "Fri";
    }
    if(day==6){
      return "Sat";
    }
    if(day==7){
      return "Sun";
    }
    return "error!";
  }
}
