import java.time.DayOfWeek;
import java.util.Arrays;
public class GetInput {
    public static void main(String[] args) {
        //This introduces the app
        System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
        boolean keepGoing = true;
        String[] classes = new String[25];
        String[] timeStart = new String[25];
        int i = 0;
        String[] className = new String[10];
        while (keepGoing) {
            classes[i] = getClasses() + " " + startTime();
            boolean meetAgain = true;
            while (meetAgain) {
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
                meetAgain = AnotherDay();
                if (i == 0) {
                    System.out.println("Please input the name of your first class.");
                } else {
                    System.out.println("Please input your next class");
                }
                className[i] = TextIO.getWord();
                boolean moreDays = true;
                String[] daysOfWeek = new String[7];
                int j = 0;
                while (moreDays) {
                    System.out.println("Please enter the day of the week this class meets:");
                    daysOfWeek[j] = TextIO.getWord();
                    System.out.println("Does the class meet another day?");
                    moreDays = TextIO.getBoolean();
                    j++;
                }
                System.out.println("Do you have another class?");
                keepGoing = TextIO.getlnBoolean();
                keepGoing = TextIO.getBoolean();
                i++;
            }
        }
    }

    public static String getClasses() {
        System.out.println("What is the name of your class?");
        String schoolClass = TextIO.getlnString();
        return schoolClass;
    }

    public static String AskDay() {
        boolean right = false;
        String day = " ";
        while (!right) {
            System.out.println("What day does the class meet? (enter the three letter abbreviation, ex thu.)");
            String check = TextIO.getWord();
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

    public static boolean AnotherDay() {
        System.out.println("Does the class meet another day?");
        boolean meetAgain = TextIO.getlnBoolean();
        return meetAgain;
    }

    public static String startTime() {
        System.out.println("What time does the class start?");
        String start = TextIO.getlnString();
        return start;
    }
}