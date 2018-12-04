import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Calendar;


public class ArrayMaker{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    File fileName = new File("classes.txt");
    int counter = (1);
    boolean continue1 = (true);
    try {
      Scanner fileReader = new Scanner(fileName);
      String line1=fileReader.nextLine();
      while(fileReader.hasNext()){
        if(line1 != null && !line1.isEmpty()){
          counter++;
        }
        else {
          continue1=false;
        }
        line1=fileReader.nextLine();
      }
        fileReader.close();
        }

      catch(FileNotFoundException e){
        System.out.println("Didn't find the file. Please try again.");
      }

    String[][] schedule= new String[counter][3];

    try {
      Scanner fileReader = new Scanner(fileName);

        for(int i=0;i<schedule.length;i++){
          String day = fileReader.next();
          schedule[i][0]=day;
          String time = fileReader.next();
          schedule[i][1]=time;
          String class1= fileReader.next();
          schedule[i][2]=class1;

        }
        fileReader.close();
      }


    catch(FileNotFoundException e){
      System.out.println("Didn't find the file. Please try again.");
    }
    Calendar now = Calendar.getInstance();
    int todaynum= now.get(Calendar.DAY_OF_WEEK);
    String date=whatday(todaynum);
    for(int j=0; j<schedule.length; j++){
      String classdate=schedule[j][0];
      if(classdate.equals(date)){

        System.out.println(Arrays.toString(schedule[j]));
      }
    }
  }

  public static String whatday(int day){
    if(day==1){
      return "sun";
    }
    if(day==2){
      return "mon";
    }
    if(day==3){
      return "tue";
    }
    if(day==4){
      return "wed";
    }
    if(day==5){
      return "thu";
    }
    if(day==6){
      return "fri";
    }
    if(day==7){
      return "sat";
    }
    return "error!";
  }

}
