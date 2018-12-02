import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ArrayMaker{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    File fileName = new File("RandJ.txt");
    String [] schedule=[5][3]


    try {
      Scanner fileReader = new Scanner(fileName);
      while(fileReader.hasNext()){
        for(int i=0;i<schedule.length;i++){
          String day = fileReader.next();
          schedule[i][0]=day;
          String time = fileReader.next();
          schedule[i][1]=time;
          String class= fileReader.next();
          schedule[i][2]=class;
        }
      }
      fileReader.close();
    } catch(FileNotFoundException e){
      System.out.println("Didn't find the file. Go to the library.");
    }
    

    }
  }
