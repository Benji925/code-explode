import java.util.Arrays;
import java.io.*;
import java.lang.System.*;

public class TwoArrayGetInput2 {
  public static void main(String[] args) {
    String[][] classAndDay = new String[10][7];
    getInput(classAndDay);
    writeFile(classAndDay);
  }
  public static String[][] getInput(String[][] classAndDay) {
    System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
    boolean keepGoing = true;
    int i = 0;
      while (keepGoing) {
        if (i == 0) {
          System.out.println("Please input the name of your first class.");
        } else {
          System.out.println("Please input your next class");
        }
        classAndDay[i][0] = TextIO.getWord();
        System.out.println("What time does you class start?");
        classAndDay[i][1] = TextIO.getWord();
        System.out.println("Please enter the days of the week this class meets (seperated with commas, no spaces).");
        System.out.println ("Press enter to continue:");
        classAndDay[i][2]= TextIO.getlnWord();
        System.out.println("Do you have another class?");
        keepGoing = TextIO.getBoolean();
        i++;
      }
      return classAndDay;
  }

  public static void writeFile(String[][] classesWithDays){
      System.out.println(Arrays.deepToString(classesWithDays));

    try {
      FileWriter fw = new FileWriter("UserInfo.txt");
      PrintWriter pw = new PrintWriter(fw);
        for(int i=0; i<10; i++) {
          for(int j=0; j<7; j++){
            if(classesWithDays[i][j]!=null){
              pw.printf("%s, ", classesWithDays[i][j].toLowerCase());
            }
          }
          pw.println();
        }
        pw.close();
      } catch(IOException e){
        System.out.println("error");
      }
  }
}
