import java.util.Arrays;

public class GetInput {
    public static String[] getInput() {
        System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
        boolean keepGoing = true;
        //this boolean will be used to ask if the user has more classes to enter
        int i = 0;
        //this int is for keeping track of the number of classes and for storing them in the array
        String[] className = new String[10];
        //this array is for keeping track of the number of classes
        while (keepGoing) {
            if (i == 0) {
                System.out.println("Please input the name of your first class.");
            } else {
                System.out.println("Please input your next class");
            }
            className[i] = TextIO.getWord();
            boolean moreDays = true;
            //this boolean is to ask if the class meets more than one day a week
            String[] daysOfWeek = new String[7];
            //this array keeps track of the days of the week, kind of. I need a better way of doing this
            int j = 0;
            //this int keeps track of how many days a week the class meets
            while (moreDays) {
                System.out.println("Please enter the day of the week this class meets:");
                daysOfWeek[j] = TextIO.getWord();
                System.out.println("What time does the class meet on?");
                System.out.println("Does the class meet another day?");
                moreDays = TextIO.getBoolean();
                j++;
            }

            System.out.println("Do you have another class?");
            keepGoing = TextIO.getBoolean();
            i++;
        }
        return className;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getInput()));
    }
    //sees what kind of information the user input
}
