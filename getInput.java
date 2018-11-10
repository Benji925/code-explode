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
            boolean meetAgain = true;
            while (meetAgain){
                String day = AskDay();
                if(day.equals("sun")) {
                    String[] Sunday = PutInSunday(classes, i);
                    meetAgain = AnotherDay();
                }else if(day.equals("mon")){
                    String[] Monday = PutInMonday(classes, i);
                    meetAgain = AnotherDay();
                }else if(day.equals("tue")){
                    String[] Tuesday = PutInTuesday(classes, i);
                    meetAgain = AnotherDay();
                }else if(day.equals("wed")){
                    String[] Wednesday = PutInWednesday(classes, i);
                    meetAgain = AnotherDay();
                }else if(day.equals("thu")){
                    String[] Thursday = PutInThursday(classes, i);
                    meetAgain = AnotherDay();
                }else if(day.equals("fri")){
                    String[] Friday = PutInFriday(classes, i);
                    meetAgain = AnotherDay();
                }else if(day.equals("sat")){
                    String[] Saturday = PutInSaturday(classes, i);
                    meetAgain = AnotherDay();
                }
            }
            double duration = durationOfClass();
            int start = startTime();
            System.out.println("Do you have another class?");
            keepGoing = TextIO.getlnBoolean();
            i++;
        }
    }

    public static String getClasses () {
        System.out.println("What is the name of your class?");
        String schoolClass = TextIO.getlnString();
        return schoolClass;
    }

    public static String AskDay(){
        boolean right = false;
        String day = " ";
        while(!right){
            System.out.println("What day does the class meet? (enter the three letter abbreviation, ex thu.)");
            String check = TextIO.getWord();
            if (check.equals("sun") || check.equals("mon")||check.equals("tue")||check.equals("wed")||check.equals("thu")||check.equals("fri")||check.equals("sat")) {
                day = check;
                right = true;
            }else {
                System.out.println("You made an error in entering the day (try mon, tue, wed...)");
                right = false;
            }
        }
        return day;
    }

    public static boolean AnotherDay(){
        System.out.println("Does the class meet another day?");
        boolean meetAgain = TextIO.getlnBoolean();
        return meetAgain;
    }

    public static String[] PutInSunday(String[] classes, int i) {
        String[] Sunday = new String [10];
        Sunday[i] = classes[i];
        return Sunday;
    }

    public static String[] PutInMonday(String[] classes, int i) {
        String[] Monday = new String [10];
        Monday[i] = classes[i];
        return Monday;
    }

    public static String[] PutInTuesday(String[] classes, int i) {
        String[] Tuesday = new String [10];
        Tuesday[i] = classes[i];
        return Tuesday;
    }

    public static String[] PutInWednesday(String[] classes, int i) {
        String[] Wednesday = new String [10];
        Wednesday[i] = classes[i];
        return Wednesday;
    }

    public static String[] PutInThursday(String[] classes, int i) {
        String[] Thursday = new String [10];
        Thursday[i] = classes[i];
        return Thursday;
    }

    public static String[] PutInFriday(String[] classes, int i) {
        String[] Friday = new String [10];
        Friday[i] = classes[i];
        return Friday;
    }

    public static String[] PutInSaturday(String[] classes, int i) {
        String[] Saturday = new String [10];
        Saturday[i] = classes[i];
        return Saturday;
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