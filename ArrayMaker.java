import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;


public class ArrayMaker{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    File fileName = new File("classes.txt");
    String [][] schedule= new String[20][3];


    try {
      Scanner fileReader = new Scanner(fileName);
      for(int i=0;i<schedule.length;i++){
        while(fileReader.hasNext()){
          String class1 = fileReader.next();
          schedule[i][0]=class1;
          String time = fileReader.next();
          schedule[i][1]=time;
          String day= fileReader.next();
          schedule[i][2]=day;
          System.out.println(Arrays.toString(schedule[i]));
        }

      }
      fileReader.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Didn't find the file. Go to the library.");
    }
    /*for(int count=0;count<schedule.length;count++){
      Calendar calendar = Calendar.getInstance();
      int currentday = calendar.get(Calendar.DAY_OF_WEEK);
      System.out.println(currentday);

    }*/


    }
}
