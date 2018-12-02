import java.time.DayOfWeek;
import java.util.Arrays;
public class GetInput {
    //needs a main to compile. We can change this later
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

                } else if (day.equals("mon")) {
                    Monday[i] = PutInMonday(classes, i);
                } else if (day.equals("tue")) {
                    Tuesday[i] = PutInTuesday(classes, i);
                } else if (day.equals("wed")) {
                    Wednesday[i] = PutInWednesday(classes, i);
                } else if (day.equals("thu")) {
                    Thursday[i] = PutInThursday(classes, i);
                } else if (day.equals("fri")) {
                    Friday[i] = PutInFriday(classes, i);
                } else if (day.equals("sat")) {
                    Saturday[i] = PutInSaturday(classes, i);
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
            public static String getClasses () {
                System.out.println("What is the name of your class?");
                String schoolClass = TextIO.getlnString();
                return schoolClass;
            }
            public static String AskDay () {
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
            public static boolean AnotherDay () {
                System.out.println("Does the class meet another day?");
                boolean meetAgain = TextIO.getlnBoolean();
                return meetAgain;
            }
            public static void WriteToFile() {
            }
        }