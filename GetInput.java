import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

public class GetInput {
    private static PrintStream outputFile;

    public static void main(String[] args) {
        //This introduces the app
        System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
        Scanner reader = new Scanner(System.in);
        boolean keepGoing = true;
        String[] classes = new String[25];
        String[] timeStart = new String[25];
        int i = 0;
        while (keepGoing) {
            classes[i] = getClasses() + " " + startTime();
            String day = AskDay();
            if (day.equals("sun")) {
                classes[i] = classes[i] + " sun";
            } else if (day.equals("mon")) {
                classes[i] = classes[i] + " mon";
            } else if (day.equals("tue")) {
                classes[i] = classes[i] + " tue";
            } else if (day.equals("wed")) {
                classes[i] = classes[i] + " wed";
            } else if (day.equals("thu")) {
                classes[i] = classes[i] + " thu";
            } else if (day.equals("fri")) {
                classes[i] = classes[i] + " fri";
            } else if (day.equals("sat")) {
                classes[i] = classes[i] + " sat";
            }
            writeToFile(classes[i]);

            System.out.println("Do you have another class?");
            String anotherClass = reader.nextLine();
            if (anotherClass.equals("yes")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
            i++;
        }
    }

    public static String getClasses() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the name of your class?");
        String schoolClass = reader.nextLine();
        return schoolClass;
    }

    public static String AskDay() {
        Scanner reader = new Scanner(System.in);
        boolean right = false;
        String day = " ";
        while (!right) {
            System.out.println("What day does the class meet? (enter the three letter abbreviation, ex thu.)");
            String check = reader.nextLine();
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

    public static String startTime() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What time does the class start?");
        String start = reader.nextLine();
        return start;
    }

    public static void writeToFile(String classDayTime){
        if (outputFile == null) {
            try {
                outputFile = new PrintStream("classes.txt", StandardCharsets.UTF_8);
            } catch (Exception e) {
                System.out.println("Error in writeToFile:" + e);// printstream
            }
        }
        outputFile.println(classDayTime);
    }
}