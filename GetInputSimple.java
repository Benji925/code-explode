import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class GetInputSimple {
  public static void main(String[] args) {
    System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
    Scanner reader = new Scanner(System.in);
    boolean keepGoing = true;
    String[][] schedule= new String[10][3];
    int i=0;
      Scanner Reader = new Scanner(System.in);
    String schedulestring="";
      while (keepGoing) {
        System.out.println("What is the name of your class?");
        String class1=Reader.next();
        schedule[i][2]=class1;
        System.out.println("What time does the class meet?");
        String time = Reader.next();
        schedule[i][1]=time;
        String day = AskDay();
        schedule[i][0]=day;
        schedulestring=Arrays.toString(schedule[i]);
        schedulestring=schedulestring.substring(1,schedulestring.length()-1);
        WriteToFile(schedulestring);
        i++;

        boolean keepGoing2=true;
        while(keepGoing2){
          System.out.println("does the class meet again?");
          String MeetAgain= reader.nextLine();
          if(MeetAgain.equals("yes")){
            schedule[i][2]=schedule[i-1][2];
            schedule[i][1]=schedule[i-1][1];
            day = AskDay();
            schedule[i][0]=day;
            schedulestring=Arrays.toString(schedule[i]);
            schedulestring=schedulestring.substring(1,schedulestring.length()-1);
            WriteToFile(schedulestring);
            i++;
          }
          else{
            keepGoing2=false;
          }
        }

        System.out.println("Do you have another class? Enter yes or no)");
        String anotherClass = reader.nextLine();
        if (anotherClass.equals("yes")) {
            keepGoing = true;
        } else {
            keepGoing = false;
        }
      }
      Reader.close();
  }

  public static String AskDay() {
      Scanner reader = new Scanner(System.in);
      boolean right = false;
      String day = " ";
      while (!right) {
          System.out.println("What day does the class meet? (enter the three letter abbreviation, ex thu.)");
          String check = reader.next();
          if (check.equals("sun") || check.equals("mon") || check.equals("tue") || check.equals("wed") || check.equals("thu") || check.equals("fri") || check.equals("sat")) {
              day = check;
              right = true;
          } else {
              System.out.println("You made an error in entering the day (try mon, tue, wed...)");
              right = false;
          }
      }
      return day;
  }

  public static void WriteToFile(String classDayTime){
      try {
          File file = new File("classes.txt");
          FileWriter writer = new FileWriter(file, true);
          writer.write(classDayTime + "\n");
          writer.close();
      } catch (Exception e) {
          System.out.println("Error in WriteToFile:" + e);// printstream
      }

  }
}
