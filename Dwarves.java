/*
 * This class creates an Array List. gets inputs and sort them in
 * order then print them out
 * 
 * @author Duong H Chau
 * @version Lab 10 : Dwarves
 */
public class Dwarves {

  // The collect to hold the names
  private java.util.ArrayList<String> dwarves = new java.util.ArrayList<String>();
 
  /**
   * Add the names of the dwarves to the collection.
   */
  public void addNames() {
    add("Doc");
    add("Grumpy");
    add("Happy");
    add("Sleepy");
    add("Bashful");
    add("Sneezy");
    add("Dopey");
  }
  
  /**
   * Add a single name to the collection
   * sort the name in order
   * @param name The name to be added
   */
  public void add(String name) {
    
    for (int i = 0; i < dwarves.size(); i++){
      String str = dwarves.get(i);
      int comp = name.compareTo(str);
      if (comp < 0) {
        dwarves.add(i,name);
        return;
      }
    }
    dwarves.add(name);
  }
  
  /**
   * A simple method to print out the contents of
   * the collection, using the for loop.
   */
  public void print() {
    System.out.println("Print out the list using a for loop:");
    for(String name : dwarves) {
      System.out.print(name + " ");
    }
    System.out.println();
  }




  /**
   * A second method to print out the contents of
   * the collection, using an Iterator.
   */
  public void print2() {
    System.out.println("Print out the list using an iterator:");
    java.util.Iterator<String> it = dwarves.iterator();
    while(it.hasNext()){
      System.out.print(it.next() + " ");
    }
    System.out.println();
  }

  /**
   * The application method
   * @param args Command-line parameters
   */
  public static void main(String[] args) {
     // instantiate the Dwarves class
     Dwarves theGuys = new Dwarves();
     theGuys.addNames();
     theGuys.print();
     theGuys.print2();
  }
  
}

