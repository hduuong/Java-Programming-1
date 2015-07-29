/**
 * this class draws the pascal triangle
 * 
 * @author Duong H Chau
 * @version Assignment 6: Pascal Triangle
 */ 
public class PascalTriangle {
  
  /**
   * declaring a scanner field
   */ 
  private java.util.Scanner scan;
  
  /**
   * a method that calculate the factorial of a number
   * @param n . a number need to be calculate
   * @return. a number that is calculated
   */ 
  private int factorial(int n){
    int num = 1;
    if (n == 0) num = 1;
    else {
      for (int i = 1; i <= n; i ++){
        num = num * i;}
    }  
    return num;
  }
  /**
   * This draws the pascal triangle
   * @param height, the height of the triangle
   */ 
  public void drawTriangle(int height){
    int n = height;
    int k = 1;
    for (int i = 0; i <= height; i++){
    
      for (k = 0; k <= i; k++){
        int nk = i - k;
        int nums = factorial(i) / ( factorial(k) * factorial(nk) );
        System.out.printf("%6d", nums);
        
        }
      // blank line after each line
      System.out.println();
    }
    // blank line after each triangle
    System.out.println();
  }
  
  /**
   * a method that takes input from user and draws the triangle 
   * with that input as height
   */ 
  public void userInput (){
    scan = new java.util.Scanner(System.in);
    String invalid;
    int valid;
    
    System.out.println("Please enter positive value for the triangle's height ( less than 13 )");
    while (!scan.hasNextInt()){
      invalid = scan.next();
      System.out.println(" Must enter an integer value ");
      scan.hasNextInt();
    }
    
    valid = scan.nextInt();
    System.out.println("Pascal's Triangle with height " + valid);
    drawTriangle(valid);
  }
  /**
   * This runs the whole program
   * the method initiates the class and calls the other methods to draw the Pascal's Triangle
   * 
   * @param args The command-line arguments.
   * 
   */ 
  public static void main(String[] args) {
    
    PascalTriangle pascal = new PascalTriangle();
    //Test cases from the Lab
    System.out.println("Pascal's Triangle with height 10");
    pascal.drawTriangle(10);
    System.out.println("Pascal's Triangle with height 3");
    pascal.drawTriangle(3);
    System.out.println("Pascal's Triangle with height 1");
    pascal.drawTriangle(1);
    System.out.println("Pascal's Triangle with height 0");
    pascal.drawTriangle(0);
    //Asks user for a test case
    pascal.userInput();
}
}