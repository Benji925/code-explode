public class Range{
  public static void main(String[] args){
    if (args.length==0) {
      // if not when print an error message and return to the shell
      System.out.println("You must supply a file name:  java Averages FILENAME.txt");
      return;
    }

    TextIO.readFile(args[0]);
    double val = TextIO.getlnDouble();
    double largestSoFar = val;
    double smallestSoFar = val;
    while (!TextIO.eof()){
      val = TextIO.getlnDouble();
      if (val > largestSoFar){
        largestSoFar = val;
      }
      if (val < smallestSoFar){
        smallestSoFar = val;
      }
    }
    double range = largestSoFar-smallestSoFar;
    System.out.printf("The largest number was %.2f%n",largestSoFar);
    System.out.println("The smallest is "+smallestSoFar+" and the range is "+range);
  }
}
