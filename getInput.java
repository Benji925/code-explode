import java.util.Arrays;

public class GetInput {
    public static String[] getInput() {
        System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
        boolean keepGoing = true;
        int i = 0;
        String[] className = new String[10];
        while (keepGoing) {
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
                System.out.println("What time does the class meet?");
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
}
