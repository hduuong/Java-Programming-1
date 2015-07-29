                                                                     
                                                                     
                                                                     
                                             
import java.util.*;

/**
 * This class is a shopping list for the user.
 * It creates a shopping list by getting  an input. 
 * Prints out the the shopping list, empty list, and 
 * remove a single item
 * 
 * @author Ivan Young
 * @version Assignment 8: Shopping List 
 */ 
public class ShoppingList2 {
  
  private String [] theList;
  private int counter;
  private Scanner scan;
  
  public ShoppingList2() {
    theList = new String [10]; 
    counter = 0;
    scan = new Scanner(System.in);
  }
  
  public boolean duplicate (String item){
    for(int i = 0; i < theList.length; i++){
      if(theList[i] != null){
        if(theList[i].compareToIgnoreCase(item) == 0){
          return true;
        }
      }
    }
    return false;
  }
    
  public void printList() {
    System.out.println("Your shopping list:");
    for(int i = 0; i < theList.length; i++) {
      int num = i + 1;
      if (theList[i] != null){
        System.out.println("   " + num + ". " + theList[i]);
      }
    }
  }
  
  public void addToList(String item) {
    if(duplicate(item)){
      System.out.println("The item is duplicated");
    }else if(counter < 10){
      theList[counter] = item;
      counter ++;
    }else{
      System.out.println("There is no more room");
    }
  }
  
  public void emptyList() {
    System.out.println("Remove all items from the list");
    System.out.println();
    for(int i = 0; i < counter; i++){
      theList[i] = null;
    }
    counter = 0 ;
  }
  
  public int size() {
    return counter;
  }
  
  public String getInput() {
    System.out.print("Enter your item or command: ");
    return scan.next();
  }
  
  public void printWelcome() {
    System.out.println("Welcome to the XYZ Shopping List Program.");
  }
  
  public void printThankYou() {
    System.out.println("Thank you for using the XYZ Shopping List Program.");
  }
  
  public void printHelp() {
    System.out.println("Here are the list of commands:");
    System.out.println("  -p : Print the list");
    System.out.println("  -e : Empty the list");
    System.out.println("  -x : Exit the application");
    System.out.println("  -h : Print this command list");
  }
  
  public static void main(String[] args) {
    ShoppingList2 list;
    String input;
    
    list = new ShoppingList2();
    
    list.printWelcome();
    list.printHelp();
    input = list.getInput();
    for( ; ; ) {
      if(input.charAt(0) == ('-')){ 
        if(input.equals("-h")) {
          list.printHelp();
        } else if(input.equals("-p")) {
          list.printList();
        } else if(input.equals("-x")) {
          break;
        } else if(input.equals("-e")) {
          list.emptyList();
        }else{
          System.err.println("The command is invalid");
          System.out.println();
          list.printHelp();
        }
      }else {
        boolean check = list.duplicate(input);
        list.addToList(input);
      }
      input = list.getInput();
    }
    list.printThankYou();
  }
}