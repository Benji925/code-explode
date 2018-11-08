import java.time.DayOfWeek;
import java.util.Arrays;

public class GetInput {
    public static void main(String [] args) {
        System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
        boolean keepGoing = true;
        String[] classes = new String[10];
        int i = 0;
        boolean[] daysOfWeek = new boolean[7];
        while(keepGoing) {
            classes[i] = getClasses();
            days(daysOfWeek);
            double duration = durationOfClass();
            int start = startTime();
            System.out.println("Do you have another class?");
            keepGoing = TextIO.getBoolean();
            i++;
        }
    }

    public static String getClasses () {
        System.out.println("What is the name of your class?");
        String schoolClass = TextIO.getlnString();
        return schoolClass;
    }

    public static boolean[] days (boolean[] daysOfWeek){
        boolean anotherDay = true;
        while(anotherDay){
            System.out.println("What day does the class meet? (enter the three letter abbreviation, ex thu.)");
            String day = TextIO.getWord();
            switch (day) {
                case "sun":
                    daysOfWeek[0]=true; break;
                case "mon":
                    daysOfWeek[1]= true; break;
                case "tue":
                    daysOfWeek[2]= true; break;
                case "wed":
                    daysOfWeek[3]= true; break;
                case "thu":
                    daysOfWeek[4]= true; break;
                case "fri":
                    daysOfWeek[5]= true; break;
                case "sat":
                    daysOfWeek[6]= true; break;
                default:
                    System.out.println("You made an error in entering the day (try mon, tue, wed...)");
            }
            System.out.println("Does the class meet another day of the week?");
            anotherDay = TextIO.getBoolean();
        }
        return daysOfWeek;
    }

    public static double durationOfClass() {
        System.out.println("How many hours does the class last?");
        double duration = TextIO.getDouble();
        return duration;
    }

    public static int startTime() {
        System.out.println("What time does the class start?");
        int startHour = TextIO.getInt();
        TextIO.getChar();
        int startMinute = TextIO.getInt();
        int start = (startHour * 100) + startMinute;
        return start;
    }

}