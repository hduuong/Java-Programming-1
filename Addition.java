/**
 * This class works with static void main method
 * using integer entered in the argument to find the sum
 * 
 * @author Duong H Chau
 * @version Assignment 7: Addition
 */

public class Addition{ 
 /**
  * this is a main method that run the program
  * 
  * @param args The command-line arguments. 
  */ 
  public static void main(String[] args){
    int sum = 0;
    int count = 0;
    String string = "";
    String unwanted = "";
    String first = "";
    String[] list = new String[args.length];
    
    if (args.length == 0) System.out.println("There is no input");
    else {
      // store the integers number in a list and count the sum of the integers
      // if not integers, store as string in a new string
      for (int i = 0; i < args.length; i++){
      String check = args[i];
      char character = check.charAt(0);
      if (Character.isDigit(character) == true){
        int a = Integer.parseInt(check);
        sum += a;
        list[i] = check;
      } else {
        unwanted += check + " ";
      }
    }
    
    // list the first integer into a string
    for (int i = 0; i < list.length; i++){
      if (list[i] != null) {
        first = list[i];
        break;
      }
    }
    string += first;
    
    // list the remaining integers into a string add " + " infront
    for (int i = 0; i < list.length; i++){
      if (list[i] != null & list[i] != first) string += " + " + list[i];
    }
    
    // displace the " = " and the sum of the integers into the string
    string += " = " + sum;
    
    // show the addition
    System.out.println(string);
    // show the ignored arguments
    System.out.println("Ignored arguments: " + unwanted);
    }
  }
}



