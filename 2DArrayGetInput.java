import java.util.Arrays;
import java.io.*;
import java.lang.System.*;

public class 2DArrayGetInput {

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
            boolean moreDays = true;
            int j = 1;
            while (moreDays) {
                System.out.println("Please enter the day of the week this class meets:");
                classAndDay[i][j] = TextIO.getWord();
                System.out.println("Does the class meet another day?");
                moreDays = TextIO.getBoolean();
                j++;
            }
            System.out.println("Do you have another class?");
            keepGoing = TextIO.getBoolean();
            i++;
        }
        return classAndDay;
  }

    public static void writeFile(String[][] classesWithDays){
      try {
        FileWriter fw = new FileWriter("UserInfo.txt");
        PrintWriter pw = new PrintWriter(fw);
        for(int i=0; i<10; i++) {
          pw.println();
          for(int j=0; j<7; j++){
            if(classesWithDays[i][j]!=null){
              pw.printf("%5s", classesWithDays[i][j]);
            }
          }
        }
          pw.close();

      } catch(IOException e){
        System.out.println("error");
      }
  }
}
