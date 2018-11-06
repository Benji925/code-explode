public static void getInput(){
  System.out.println("Hello User! This is the Code Explode Daily Planning App, or CEDPA");
  boolean keepGoing = true;
  int i = 0;
  while(keepGoing){
    if (i == 0){
      System.out.println("Please input your first class. Below is an example of the format you should follow.");
      System.out.println("CLA123A M W Th 5:00-6:00");
    } else {
      System.out.println("Please input your next class, following the same format as before.");
    }
    String className = TextIO.getWord();
    boolean space = false;
    char nextChar = TextIO.getChar();

    while (nextChar != ' ');{
      nextChar=
    }

  }
}
