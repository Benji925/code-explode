public class printSchedule {
    String day = " ";
    public static String PrintSchedule(String day, String[] mon, String[] tue, String[] wed, String[] thu, String[] fri, String[] sat, String[] sun) {

        if (day == "mon") {
            for (int i = 0; i < mon.length; i++) {
                System.out.printf("%f%n", mon[i]);
            }
        } else if (day == "tue") {
            for (int i = 0; i < tue.length; i++) {
                System.out.printf("%f%n", tue[i]);
            }
        } else if (day == "wed") {
            for (int i = 0; i < wed.length; i++) {
                System.out.printf("%f%n", wed[i]);
            }
        } else if (day == "thu") {
            for (int i = 0; i < thu.length; i++) {
                System.out.printf("%f%n", thu[i]);
            }
        } else if (day == "fri") {
            for (int i = 0; i < fri.length; i++) {
                System.out.printf("%f%n", fri[i]);
            }
        } else if (day == "sat") {
            for (int i = 0; i < sat.length; i++) {
                System.out.printf("%f%n", sat[i]);
            }
        } else if (day == "sun") {
            for (int i = 0; i < sun.length; i++) {
                System.out.printf("%f%n", sun[i]);
            }
        }else{
            System.out.println("There is an error");
        }
        return day;
    }
}