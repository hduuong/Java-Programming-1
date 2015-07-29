/**
 * This class askes user for inputs that are the upper bound
 * of the list of number from 1 - n
 * validating inputs and call methods to print the list of prime numbers
 * 
 * @author Duong H Chau
 * @Version Assignment 9: Sieve of Eratosthenes
 */ 
public class SieveDriver {
   
  // declare fields
   private java.util.Scanner scan;
   private Sieve theSieve;
   
   /** 
    * constructor, instantiates the fields
    */ 
   public SieveDriver (){
     scan = new java.util.Scanner(System.in);
     theSieve = new SieveofEratosthenes();
   }
   
   /**
    * a method that calls all the methods to work
    * while the user's input is not zero
    */ 
   public void go() {
      
      java.util.List<Integer> primes;
      
      int n = getNumber();
      // if not zero, keep going
      while(n != 0) {
        primes = theSieve.getPrimes(n);
        printPrimes(n, primes);
        n = getNumber();
      }
   }
   
   /**
    * a method that uses scanner to ask for inputs
    * has input validation for un-integer and negative value
    */ 
   public int getNumber() {
     
      System.out.print("Please enter the upper bound (need to be greater than 1;  0 to exit): ");
      // check the input if it is integer
      while(!scan.hasNextInt()){
        System.err.println("this is not an integer");
        System.out.print("Please enter the upper bound (need to be greater than 1;  0 to exit): ");
        scan.next();
      }
      int n = scan.nextInt();
      // check the input if it is positive
      while(n<0){
          System.err.println("cannot enter negative integers");
          n = getNumber();
        }
      return n;
   }
   
   /**
    * a method that print the list of primes, 12 number per line 
    * and print out the percentage of primes in a list from 1 to n
    */ 
   public void printPrimes(int bound, java.util.List<Integer> list) {
      System.out.println("Here are the primes between 2 and " + bound + " :");
      double count = 0;
      double percent = 0;
      // print 12 per line
      java.util.Iterator<Integer> it = list.iterator();
      int twelve = 0;
      while(it.hasNext()){
        twelve ++;
        if(twelve % 12 == 0) {
          System.out.println(it.next() + " ");
        } else {
        System.out.print(it.next() + " ");
        }
        count ++;
      }
      
//      for(int i = 0; i < list.size() ; i ++) {
//        if( i != 0 && (i+1)%12==0){
//          System.out.println(list.get(i) + " ");
//        }else{
//         System.out.print(list.get(i) + " ");
//        }
//        count ++;
//      }
      
      // calculation for percentage
      percent = (count / bound) * 100;
      int percentage = (int)percent;
      System.out.println();
      System.out.println(percentage + "% of the number between 1 and " + bound + " are prime. ");
      System.out.println();
   }
   
  /**
   * This is the application method.
   * 
   * @param args The command-line arguments. 
   */ 
   public static void main(String[] args) {
   
      new SieveDriver().go();
      
   }
   
}