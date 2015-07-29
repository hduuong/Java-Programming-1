/**
 * This creates trees
 * CSC 142
 * @author Duong H Chau
 * @version: Assignment 4
 */
import java.awt.Color;
  
public class MyTree extends NsccComponent{
  private NsccEllipse theLeaf;
  private NsccRectangle theTrunk;
  /**
   * Constructor for objects of class MyTree.
   * this constructor creates a tree with selcted position
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   */ 
  public MyTree (int x, int y){
    super(x,y,80,180);
    
    theLeaf = new NsccEllipse(0, 0, 60, 90);
    theTrunk = new NsccRectangle(23, 85, 15, 45);
    
    theLeaf.setFilled(true);
    theTrunk.setFilled(true);
    
    theLeaf.setBackground(Color.green);
    theTrunk.setBackground(new java.awt.Color(0x99, 0x66, 0x33));
    
    add(theTrunk);
    add(theLeaf); }
  
  /**
   * Constructor for objects of class MyTree.
   * this constructor creates a tree with selcted position and color
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   * @param color color of the tree
   */ 
    public MyTree (int x, int y, Color color){
    super(x,y,80,180);
    
    // Create the objects
    theLeaf = new NsccEllipse(0, 0, 60, 90);
    theTrunk = new NsccRectangle(23, 85, 15, 45);
    
    // add characteristics
    theLeaf.setFilled(true);
    theTrunk.setFilled(true);
    
    theLeaf.setBackground(color);
    theTrunk.setBackground(new java.awt.Color(0x99, 0x66, 0x33));
    
    // Place in the MyTree object
    add(theTrunk);
    add(theLeaf); }
    
  /**
   * Change the color of the tree
   * 
   * @param c The color for the walls of the house
   */  
  public void setColor(java.awt.Color c) {
    theLeaf.setBackground(c);
    repaint(); }
  
  /**
   * Retrieve the color of the house
   * 
   * @return The color of the walls of the house
   */  
  public java.awt.Color getColor() {
    return theLeaf.getBackground(); }
} 