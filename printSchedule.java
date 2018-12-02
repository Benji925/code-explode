public class printSchedule {
  public static void main(String[] args) {
    String day = "mon";
    String[][] info = {{"monday","1:00","anthro"},{"Tuesday","2:00","cosi"}};
    PrintSchedule(info,day);
}
    public static void PrintSchedule(String[][] info, String day) {
        if (day.equals("mon"))
        System.out.println("Today is Monday!");
        System.out.println("Here are your classes today:");
            for (int i = 1; i <info.length; i++) {
                System.out.println(info[0][i]);
            }
          }
        }

//         } else if (day == "tue") {
//             for (int i = 0; i < tue.length; i++) {
//                 System.out.printf("%f%n", tue[i]);
//             }
//         } else if (day == "wed") {
//             for (int i = 0; i < wed.length; i++) {
//                 System.out.printf("%f%n", wed[i]);
//             }
//         } else if (day == "thu") {
//             for (int i = 0; i < thu.length; i++) {
//                 System.out.printf("%f%n", thu[i]);
//             }
//         } else if (day == "fri") {
//             for (int i = 0; i < fri.length; i++) {
//                 System.out.printf("%f%n", fri[i]);
//             }
//         } else if (day == "sat") {
//             for (int i = 0; i < sat.length; i++) {
//                 System.out.printf("%f%n", sat[i]);
//             }
//         } else if (day == "sun") {
//             for (int i = 0; i < sun.length; i++) {
//                 System.out.printf("%f%n", sun[i]);
//             }
//         }else{
//             System.out.println("There is an error");
//         }
//         return day;
//     }
// }
