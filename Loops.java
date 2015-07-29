/**
 * this class makes loops
 * 
 * @author Duong H Chau
 * @version Lab 6: Loops
 */ 
public class Loops {
  /**
   * this method using a while loop to add int to a string
   * and print the string with the integers in a same line
   */ 
  public void wLoop () {
   
    System.out.println("Using a while loop :");
    // initiate
    int x = 1;
    String line = "" + x;
    // While Lopps
    while ( x < 170) {
      x = x + 13;
      line = line + ", " + x;
    }
    line = line + "." + "\n";
    System.out.println(line);
  }
  /**
   * this method using a for loop to add int to a string
   * and print the string with the integers in a same line
   */
  public void fLoop () {
    
    System.out.println("Using a for loop :");
    // initiate
    int i = 1;
    String line2 = "" + i;
    // For Loops
    for ( int y = i + 13 ; y <= 170 ; y = y +13) {
      line2 = line2 + ", " + y;
    }
    line2 = line2 + "." + "\n";
    System.out.println(line2);
  }
  /**
   * this method using a do loop to add int to a string
   * and print the string with the integers in a same line
   */ 
  public void dLoop(){
    
    System.out.println("Using a do loop :");
    //initiate
    int k = 1;
    int z = k + 13;
    String line3 = "" + k;
    // Do Loops
    do{
      line3 = line3 + ", " + z;
      z = z + 13;
    }while(z <= 170);
    line3 = line3 + ".";
    System.out.println(line3);
  }
  /**
   * this runs the program
   * the method instantiates the class and calls the three methods.
   * @param args The command-line arguments.
   */ 
  public static void main(String[] args) {
   
    Loops bob = new Loops();
    bob.wLoop();
    bob.fLoop();
    bob.dLoop();
  }
}