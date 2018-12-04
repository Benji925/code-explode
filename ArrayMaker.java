import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Calendar;


public class ArrayMaker{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    File fileName = new File("classes.txt");
//count how many lines are in the file (number of classes)
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
      //create a 2-D array of the right size and fill in the user's schedule
      //with separate lines for class, date, and time
    String[][] schedule= new String[counter][3];

    try {
      Scanner fileReader = new Scanner(fileName);

        for(int i=0;i<schedule.length;i++){
          String day = fileReader.next();
          schedule[i][0]=day;
          String class1= fileReader.next();
          schedule[i][2]=class1;
          String time = fileReader.next();
          schedule[i][1]=time;
        }
        fileReader.close();
      }


    catch(FileNotFoundException e){
      System.out.println("Didn't find the file. Please try again.");
    }
    //find out what day of the week it is and print out the user's
    //schedule for that day only
    System.out.println("Your schedule for today is: ");
    Calendar now = Calendar.getInstance();
    int todaynum= now.get(Calendar.DAY_OF_WEEK);
    String date=whatday(todaynum);
    for(int j=0; j<schedule.length; j++){
      String classdate=schedule[j][0];
      if(classdate.contains(date)){
        System.out.print(" At ");
        System.out.print(schedule[j][2]);
        System.out.print(" you have ");
        System.out.print(schedule[j][1]);
        System.out.println();
      }
    }
    String quote=Getquote();
    System.out.println(quote);
  }
  public static String Getquote(){
    Scanner fileReader = new Scanner("Quotes.txt");
    java.util.Random rand = new java.util.Random();
    int num=rand.nextInt(74);
    String read1=" ";
    for(int i=0;i<num;i++){
      read1=fileReader.nextLine();
    }
    return read1;
  }




    //take the current date given by the calendar function as an
    // integer and make it into a string to match the array data
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
