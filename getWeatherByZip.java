public static void getWeather(){
     System.out.println("Would you like to get the weather?");
     System.out.println("Enter your zipcoe or type 'no'");
     String zipcode = TextIO.getln();
     if (zipcode=="no"){
       System.out.println("Have a nice day!");
     }
     else {
    Weather w = APIdemo.getWeather(zipcode);
     System.out.printf("Here is the weather info for %s%n",zipcode);
     System.out.printf("The current temperature is %.1f F ",APIdemo.k2f(w.main.temp));
     System.out.printf(" with %s %n",w.weather.get(0).description);
     System.out.println("Have a nice day!");
   }
}
