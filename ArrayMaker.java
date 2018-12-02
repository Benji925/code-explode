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
          System.out.println(Arrays.toString(schedule[i]));
        }

      }
      fileReader.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Didn't find the file. Go to the library.");
    }
    int today= Calendar.DAY_OF_WEEK;
    for(int i=0; i<schedule.length; i++){

    }

}
