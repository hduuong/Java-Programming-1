public class PascalsTriangle_1{  
  //creates my class
  
  /** @param n the factorial that needs to be calculated
    * @return calculated factorial
      */
  public static int factorial(int n){
    //a basic for loop that calculates factorials
    //Note: it hits a limit of int calculation at 12!
    int ret = 1;
    for(int i = 1; i <= n; i++) ret *= i;
    return ret;   
    }
  
  /**@param b a number greater than 12
    * @return portion of the factorial that is greater than 12!
    */
  public static int bigfactorial(int b){
    //a basic for loop that calculates portions of a factorial beyond 12
    int ret = 1;
    for(int i = 13; i <= b; i++) ret *= i;
    return ret;
  }


  /**
     * @param height the height of the triangle, method generates the values in each row
     */
  public static void row(int height){
    int n = height;
    int k = 1;
    //building the triangle for heights under 13 will not cause int overflow in calculations
    //therefore the basic formula can be followed
    if(n < 13){
      for(k = 0; k <= height; k++){
      int d = n - k;
      int value = factorial(n)/factorial(k)/factorial(d);
      System.out.printf("%6d", value);}
    }
    else{
      //This is a convoluted piece of code
      //There must be a way to reduce it!
      //Systematically removing int errors is a bit mind numbing
      for(k= 0; k<= height; k++){
        int d = n -k;
        //this if statement may seem odd
        //there is a crossover threshold that varies as the height gets bigger
        //it prevents the first few values in each from being accurate
        if(k< (n-11)){
        int value = bigfactorial(n)/factorial(k)/bigfactorial(d);
        System.out.printf("%6d", value);}
        //there is another crossover point here that causes and int overflow
        else if(k<10){
         int value = factorial(12)/factorial(d)*bigfactorial(n)/factorial(k);
         System.out.printf("%6d", value);}
        //another overflow crossover point
        else if(k<12){
          int value = factorial(12)/factorial(k)*bigfactorial(n)/factorial(d);
         System.out.printf("%6d", value);}
        //if the height goes over 15 there will continue to be other crossover points
        //and additional else if statements would be needed
        else if(k<= height){
         int value = bigfactorial(n)/bigfactorial(k)/factorial(d);
         System.out.printf("%6d", value);
        }
       }
      }  
   //looks prettier with this blank line
    System.out.println();
 }
  /**
   * @param h is the height of Pascal's Triangle that will be generated.
   * The method will create blank space at the beginning of each line <br>
   * as well as building the triangle line by line.
   */
  public static void triangle(int h){
    int counter = 0;
    //space will be used as a counter for generating blank space at the beginning
    //the nesting maybe redundant but its very effective at formatting,
    //I did not see a way around it, though I'm sure there are other methods
    int space = 0;
    for(counter = 0; counter <=h; counter++){
      for(space = 0; space < h-counter ; space++)
        System.out.print("   ");
      row(counter);
    }
    //print a blank for spacing
    System.out.println();
  }
  
  
      
  
  /**@param args Command-line arguments
    */
  public static void main(String[] args){
    System.out.println("Super Triangle!");
    triangle(4);
  }
}