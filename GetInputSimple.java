import java.time.DayOfWeek;
import java.util.Arrays;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
public class GetInputSimple {
  public static void main(String[] args) {
    System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
    Scanner reader = new Scanner(System.in);
    boolean keepGoing = true;
    String[][] schedule= new String[10][3];
    int i=0;
      Scanner Reader = new Scanner(System.in);

      while (keepGoing) {
        System.out.println("What is the name of your class?");
        String class1=Reader.next();
        schedule[i][2]=class1;
        System.out.println("What time does the class meet?");
        String time = Reader.next();
        schedule[i][1]=time;
        String day = AskDay();
        schedule[i][0]=day;
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
            System.out.println(Arrays.toString(schedule[i]));
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
      WriteToFile(schedule);
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

  public static void WriteToFile(String[][] classDayTime){
    try {
        File classes = new File ("classes.txt");
        PrintStream printing = new PrintStream("classes.txt", "UTF-8");
        System.setOut(printing);
        System.out.println(classDayTime);
    }catch (Exception e) {
        System.out.println("Error in WriteToFile:" + e);// printstream
    }
  }
}
