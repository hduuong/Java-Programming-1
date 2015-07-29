/**
 * This is a simple example of an Addition class.
 * 
 * @author Ivan Young
 * @Version Assignment 7: Addition 
 */
public class PhepCong{
  
  /**
   * This is the application method.
   * 
   * @param args The command-line arguments. 
   */ 
  public static void main(String [] args){ 
    int total=0;
    
    //Message for missing input
    if (args.length == 0) System.out.print("No input values"); 

    // store non integer number
    String [] ignoredArgs = new String [args.length];
    // store integer number
    String [] integer = new String[args.length];
    String showInteger = "";
    String firstInteger = "";
    //ignoreArgs counter 
    int k= 0; 
    
    // loop to check integer number in the arguments.
    for ( int i = 0; i < args.length; i++)  { 
      //check the input if it's integer number
      char current = args[i].charAt(0);
      
      if (Character.isDigit(current) == true) {
        // store value of string converted into integer
        total +=  Integer.parseInt(args[i]);  
        integer[i] = args[i]; 
      } else {
        ignoredArgs[k++] = args[i];  
      }
    }
    // store the first integer into a string
    for (int i = 0; i < integer.length; i++){
      if (integer[i] != null) {
        firstInteger = integer[i];
        break;
      }
    }
    showInteger += firstInteger;
    // store the remaining integers into a string add " + "
    for (int i = 0; i < integer.length; i++){
      if (integer[i] != null && integer[i] != firstInteger) {
      showInteger += " + " + integer[i];
      }
    }
    
    showInteger += " = " + total;
    // print the addition
    System.out.println(showInteger);  
    
    // print out the non-integer value
    System.out.print("Ignored arguments :");
    for (int j = 0; j < k; j++){
      //prints out non integer number 
      System.out.print(" " + ignoredArgs[j]);
    }
    System.out.println();
  } 
}