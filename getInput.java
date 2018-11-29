import java.time.DayOfWeek;
import java.util.Arrays;
public class GetInput {
    public static void main(String[] args) {
        public static String[] getInput () {
            System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
            boolean keepGoing = true;
            String[] classes = new String[25];
            String[] timeStart = new String[25];
            String[] Sunday = new String[25];
            String[] Monday = new String[25];
            String[] Tuesday = new String[25];
            String[] Wednesday = new String[25];
            String[] Thursday = new String[25];
            String[] Friday = new String[25];
            String[] Saturday = new String[25];
            int i = 0;
            boolean[] daysOfWeek = new boolean[7];
            String[] className = new String[10];
            while (keepGoing) {
                classes[i] = getClasses() + " " + startTime();
                boolean meetAgain = true;
                while (meetAgain) {
                    String day = AskDay();
                    if (day.equals("sun")) {
                        Sunday[i] = PutInSunday(classes, i);
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
                //TextIO.writeFile(java.lang.string classSchedule.txt);

                /*System.out.println(Arrays.toString(Sunday));
                System.out.println(Arrays.toString(Monday));
                System.out.println(Arrays.toString(Tuesday));
                System.out.println(Arrays.toString(Wednesday));
                System.out.println(Arrays.toString(Thursday));
                System.out.println(Arrays.toString(Friday));
                System.out.println(Arrays.toString(Saturday)); */

                ridofNull(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday);
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
            public static String PutInSunday (String[]classes,int i){
                String[] Sunday = new String[25];
                Sunday[i] = classes[i];
                return Sunday[i];
            }
            public static String PutInMonday (String[]classes,int i){
                String[] Monday = new String[25];
                Monday[i] = classes[i];
                return Monday[i];
            }
            public static String PutInTuesday (String[]classes,int i){
                String[] Tuesday = new String[25];
                Tuesday[i] = classes[i];
                return Tuesday[i];
            }
            public static String PutInWednesday (String[]classes,int i){
                String[] Wednesday = new String[25];
                Wednesday[i] = classes[i];
                return Wednesday[i];
                return className;
            }
            public static String PutInThursday (String[]classes,int i){
                String[] Thursday = new String[25];
                Thursday[i] = classes[i];
                return Thursday[i];
            }
            public static String PutInFriday (String[]classes,int i){
                String[] Friday = new String[25];
                Friday[i] = classes[i];
                return Friday[i];
            }
            public static String PutInSaturday (String[]classes,int i){
                String[] Saturday = new String[25];
                Saturday[i] = classes[i];
                return Saturday[i];
            }
            public static String startTime () {
                System.out.println("What time does the class start?");
                String start = TextIO.getlnString();
                return start;
            }
            public static void ridOfNull(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday) {
                int i = 0;
                TextIO.writeFile(java.lang.String classSchedule.txt);
                if(Sunday[i] != "null") {
                    System.out.println(Sunday[i]);
                    i++;
                }else{
                    i=0;
                    break;
                }
                if(Monday[i] != "null") {
                    System.out.println(Monday[i]);
                    i++;
                }else {
                    i=0;
                    break;
                }
                if(Tuesday[i] != "null") {
                    System.out.println(Tuesday[i]);
                    i++;
                }else {
                    i=0;
                    break;
                }
                if(Wednesday[i] != "null") {
                    System.out.println(Wednesday[i]);
                    i++;
                }else {
                    i=0;
                    break;
                }
                if(Thursday[i] != "null") {
                    System.out.println(Thursday[i]);
                    i++;
                }else {
                    i=0;
                    break;
                }
                if(Friday[i] != "null") {
                    System.out.println(Friday[i]);
                    i++;
                }else {
                    i=0;
                    break;
                }
                if(Saturday[i] != "null") {
                    System.out.println(Saturday[i]);
                    i++;
                }else {
                    i=0;
                    break;
                }
            }
        }
    }
}