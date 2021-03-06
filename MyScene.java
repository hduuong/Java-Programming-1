// Allow short name access to java.awt.Color
import java.awt.Color;

/**
 * This is the shell for programming assignment 3.
 * This program draws a simple scene using additional
 * classes that the student creates.
 * 
 * @author Dan Jinguji 
 * @version Assignment 4: MyScene
 */
public class MyScene extends NsccWindow {

  // instance variables
  private MyHouse house;
  private MyHouse house1;
  private MyHouse house2;
  
  private MyTree tree;
  private MyTree tree1;
  private MyTree tree2;
  
  /**
   * Constructor for objects of class MyScene
   */
  public MyScene() {
    // Specify the constructor for the superclass
    super(10, 10, 400, 300);
    // set characteristics for the object
    setTitle("My Scene");
    
    // Draw the sky
    getContentPane().setBackground(new Color(0x00, 0xCC, 0xFF));
    
    // Draw some grass
    NsccRectangle grass = new NsccRectangle(0, 100, 400, 200);
    grass.setBackground(new Color(0x00, 0x99, 0x00));
    grass.setFilled(true);
    add(grass);
    
    // Draw houses
    house = new MyHouse(100, 50);
    house1 = new MyHouse(120,130,Color.yellow);
    house2 = new MyHouse(0,150,Color.pink); 
    add(house);
    add(house1);
    add(house2);
    
    // Draw Trees
    tree = new MyTree(210,30);
    tree1 = new MyTree(260,80,Color.red);
    tree2 = new MyTree(310,130,Color.orange);
    add(tree);
    add(tree1);
    add(tree2);
  }
  
  /**
   * Alter the scene, by changing color
   */
  public void change1() {
    // change the color of the house
    house.setColor(Color.red);
    house1.setColor(Color.green);
    house2.setColor(Color.white);
    
    tree1.setColor(Color.red);
    tree1.setColor(Color.green);
    tree1.setColor(Color.white);
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing location
   */
  public void change2() {
    // change the location of the house
    house.setLocation(50, 125);
    house1.setLocation(90,210);
    house2.setLocation(130,170);
    
    tree.setLocation(200, 125);
    tree1.setLocation(185, 30);
    tree2.setLocation(60, 190);
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing size
   */
  public void change3() {
    // change the size of the house and tree
    house.setSize(80, 60);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, restoring original settings
   */
  public void reset() {
    // reset the initial values for the house
    house.setLocation(100, 50);
    house.setColor(Color.blue);
    house.setSize(120, 90);
    
    house1.setLocation(120,130);
    house1.setColor(Color.yellow);
    house1.setSize(120,90);
    
    house2.setLocation(0,150);
    house2.setColor(Color.pink);
    house2.setSize(120,90);
    
    tree.setLocation(210, 30);
    tree.setColor(Color.green);
    tree.setSize(80, 180);
    
    tree1.setLocation(260, 80);
    tree1.setColor(Color.red);
    tree1.setSize(80, 180);
    
    tree2.setLocation(310, 130);
    tree2.setColor(Color.orange);
    tree2.setSize(80, 180);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * The application method, to test your code
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {

     // declare a MyScene reference
     MyScene aScene;
     // instantiate MyScene
     aScene = new MyScene();
     // pause
     javax.swing.JOptionPane.showMessageDialog(aScene, "Hi");

     // test setColor
     aScene.change1();
     javax.swing.JOptionPane.showMessageDialog(aScene, "Hi");

     // test setLocation
     aScene.change2();
     javax.swing.JOptionPane.showMessageDialog(aScene, "Hi");

     // test setSize
     aScene.change3();
     javax.swing.JOptionPane.showMessageDialog(aScene, "Hi");

     // reset initial values
     aScene.reset();
  }
  
}
