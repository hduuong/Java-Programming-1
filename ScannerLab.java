/**
 * This is a class where I practice using scanner
 * 
 * @author Duong H Chau
 * @version Lab 7: Scanner (plus)
 */ 
public class ScannerLab {
   
   private java.util.Scanner scan;
   public ScannerLab (){
     scan = new java.util.Scanner(System.in);
   }
   
   public void echoStrings() {
      String word;
      for(int i = 0; i < 5; i ++) {
         System.out.print("Enter word " + i + ": ");
         word = scan.next();
         System.out.println("You entered " + word);
      }
   }
   
   public void echoIntsAndTotal() {
      int inputValue;
      String invalidValue;
      int total = 0;
      for(int i = 0; i < 5; i ++) {
         System.out.println("Enter integer value " + i + ": ");
         // updated
         if (scan.hasNextInt()){
           inputValue = scan.nextInt();
           System.out.println("You entered " + inputValue);
           total += inputValue;
         }else {
           invalidValue = scan.next();
           System.out.println("You entered a non-integer. Using -99 instead");
           total += -99;
           }
      }
      
      System.out.println("The total of your values is " + total);
   }
   
   public void echoDoublesAndAverage() {
      double inputValue;
      String invalidValue;
      double total = 0;
      for(int i = 0; i < 5; i ++) {
        System.out.println("Enter double value " + i + ": ");
        while (!scan.hasNextDouble()){
          invalidValue = scan.next();
          System.out.println("You entered an invalid input, please enter again ");
          scan.hasNextDouble(); 
        }
        if (scan.hasNextDouble()) {
          inputValue = scan.nextDouble();
          System.out.println("You entered " + inputValue);
          total += inputValue;
        }
      }
      total = total / 5;
        System.out.println("The average of your values is " + total);
   }
   
   public static void main(String[] args) {
      ScannerLab lab;
      lab = new ScannerLab();
//      lab.echoStrings();
//      lab.echoIntsAndTotal();
      lab.echoDoublesAndAverage();
   }
   
}