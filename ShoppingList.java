/**
 * this class make a shopping list from getting inputs from user
 * provides commands for user to make that list
 * 
 * @author Duong H Chau
 * @version Assignment 8: Shopping list
 * 
 */ 
public class ShoppingList {
   /**
    * declare the array
    * declare the counter
    * declare the scanner
    */ 
   private String[] theList;
   private int count;
   private java.util.Scanner scan;
   
   /**
    * the constructor that instantiate the Array and Scanner
    * and asign value to the counter
    */ 
   public ShoppingList() {
      theList = new String[10];
      count = 0;
      scan = new java.util.Scanner(System.in);
   }
   /**
    * a method that print the list
    */ 
   public void printList() {
      System.out.println("Your shopping list:");
      for(int i = 0; i < theList.length; i++) {
        if (theList[i] != null){  
          int num = i + 1;
          System.out.println("  " + num + ". " + theList[i]);
        }
      }
   }
   /**
    * this method add items to the list
    * 
    * @param item The item that need to be added to the list
    */ 
   public void addToList(String item) {
     theList[count] = item;
     count ++;
   }
   /**
    * this method empty the list
    * 
    */ 
   public void emptyList() {
     for( int i = 0; i < theList.length; i++){
       theList[i] = null;
     }
     count = 0;
   }
   /**
    * this method show the size of the list
    */ 
   public int size() {
     int counter = 0;
     for(int i = 0; i < theList.length; i++){
       if(theList[i] != null) counter ++;
     }
     String[] list = new String[counter];
     return list.length;}
   
   /**
    * this method get input from user
    */ 
   public String getInput() {
      System.out.print("Enter your item or command: ");
      return scan.next();}
   
  /**
   * this method check duplicated input
   */ 
   public boolean checkDuplicates (String item){
     for (int i = 0; i < theList.length; i++){
       if (theList[i] != null){
         if (theList[i].compareToIgnoreCase(item) == 0) return true;
       }
     }return false;}
     
   /**
    * this method check if the list is full
    */
   public boolean checkFull () {
     if ( count == theList.length - 1 ) return true;
     return false;}
   
   /**
    * this method remove item(s) from the list
    */
   public void remove (int n){
     n --;
     while ( n > 0 ) {
       theList[n] = null;
       count --;
       n --;}
   }
   
   /**
    * this method print the welcoming line when start the program
    */ 
   public void printWelcome() {
      System.out.println("Welcome to the XYZ Shopping List Program.");
   }
   
   /**
    * this method print the thank you line after finish the program
    */ 
   public void printThankYou() {
      System.out.println("Thank you for using the XYZ Shopping List Program.");
   }
   
   /**
    * this method print the list of commands
    */ 
   public void printHelp() {
      System.out.println("Here are the list of commands:");
      System.out.println("  -p : Print the list");
      System.out.println("  -e : Empty the list");
      System.out.println("  -x : Exit the application");
      System.out.println("  -h : Print this command list");
   }
   /**
    * this is a main method that run the program
    * 
    * @param args The command-line arguments. 
    */ 
   public static void main(String[] args) {
      ShoppingList list;
      String input;
      list = new ShoppingList();
      list.printWelcome();
      list.printHelp();
      input = list.getInput();
      
      for( ; ; ) {
        
        char first = input.charAt(0);
        String check = Character.toString(first);
        
        if(check.equals("-")){
     
          if(input.equals("-h")) {
            list.printHelp();
          } else if(input.equals("-p")) {
            list.printList();
          } else if(input.equals("-x")) {
            break;
          } else if(input.equals("-e")) {
            list.emptyList();
            
//          } else if(input.length() == 4){
//            char third = input.charAt(3);
//            String three = Character.toString(third);
//            if (Character.isDigit(third) == true){
//              int num = Integer.parseInt(three);
//              list.remove(num);
//            }
          } else {
            System.err.println(" invalid commamds ");
            System.out.println();
            list.printHelp();
          }
        } else{
          
          if (list.checkFull() == true) {
            System.err.println(" The list is full ");
          } else {
            Boolean ft = list.checkDuplicates(input);
            String dup = "";
            if (ft == true){
              System.err.println(" This item is already in the list ");
              dup += input;
            } else {
              list.addToList(input);
            }
          }
        }
        input = list.getInput();
      }
      list.printThankYou();
   }
}