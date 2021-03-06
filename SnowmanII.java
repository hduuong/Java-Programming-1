/**
 * This is a sample class showing how to use the NSCC graphics components.
 * 
 * @author Dan Jinguji
 * @version 1.0
 */
public class SnowmanII {

  /*
   * Here are some member variables. They are shared by all of the
   * members of this class. They are called "fields" by the documentation.
   */
  
  // The window to display the snowman
  private NsccWindow win;
  
  // The parts of the snowman
  private NsccEllipse head;
  private NsccEllipse body;
  
  /**
   * This creates the window and places the snowman within it.
   */
  public void SnowmanII() {
    // create the window
    win = new NsccWindow(50, 50, 160, 250);
    win.setTitle("My Snowman");
   
    // create and place the head
    head = new NsccEllipse();
    head.setLocation(50, 40);
    head.setSize(50, 50);
    win.add(head);
    
    // create and place the body
    body = new NsccEllipse();
    body.setLocation(25, 90);
    body.setSize(100, 100);
    win.add(body);
    
    // request a repaint of the window
    win.repaint();
  }
  
  /**
   * This method colors the head and body of the snowman.
   */
  public void colorSnowman() {
    // make them "filled" shapes
    head.setFilled(true);
    body.setFilled(true);
  
    // change the background (fill) colors
    head.setBackground(java.awt.Color.white);
    body.setBackground(java.awt.Color.white);
    
    // request a repaint of the components
    head.repaint();
    body.repaint();
  }
  
  /**
   * This method adds some buttons to the snowman.
   */
  public void addButtons() {
    // declare the buttons
    NsccDiamond button1, button2, button3;
    
    // create the buttons
    button1 = new NsccDiamond();
    button1.setLocation(70, 105);
    button1.setSize(10, 14);
    button1.setForeground(java.awt.Color.red);
    win.add(button1);
    
    button2 = new NsccDiamond();
    button2.setLocation(70, 125);
    button2.setSize(10, 14);
    button2.setFilled(true);
    button2.setBackground(java.awt.Color.green);
    win.add(button2);
    
    button3 = new NsccDiamond();
    button3.setLocation(70, 145);
    button3.setSize(10, 14);
    button3.setFilled(true);
    java.awt.Color navy = new java.awt.Color(0, 0, 128);
    button3.setForeground(navy);
    button3.setBackground(new java.awt.Color(255, 255, 255));
    win.add(button3);
    
    // request a repaint of the window
    win.repaint();
  }
    
  /**
   * This method adds the face to the snowman.
   */
  public void addFace() {
    // declare the eyes
    NsccUpTriangle eye1, eye2;
    
    // create the eyes and add them
    eye1 = new NsccUpTriangle(16, 19, 6, 6);
    eye1.setFilled(true);
    eye1.setBackground(java.awt.Color.black);
    head.add(eye1);
    
    eye2 = new NsccUpTriangle(28, 19, 6, 6);
    eye2.setFilled(true);
    eye2.setBackground(java.awt.Color.black);
    head.add(eye2);

    // declare the mouth
    NsccRectangle smile;
    
    // create the mouth and add it
    smile = new NsccRectangle(13, 31, 4, 4);
    smile.setFilled(true);
    smile.setBackground(java.awt.Color.black);
    head.add(smile);
    
    smile = new NsccRectangle(18, 33, 4, 4);
    smile.setFilled(true);
    smile.setBackground(java.awt.Color.black);
    head.add(smile);
    
    smile = new NsccRectangle(23, 34, 4, 4);
    smile.setFilled(true);
    smile.setBackground(java.awt.Color.black);
    head.add(smile);
    
    smile = new NsccRectangle(28, 33, 4, 4);
    smile.setFilled(true);
    smile.setBackground(java.awt.Color.black);
    head.add(smile);
    
    smile = new NsccRectangle(33, 31, 4, 4);
    smile.setFilled(true);
    smile.setBackground(java.awt.Color.black);
    head.add(smile);
    
    // request a repaint of the window
    win.repaint();
  }
  public static void main (String[] args) {
   SnowmanII frosty;
   frosty = new SnowmanII();
   frosty.SnowmanII();
   frosty.colorSnowman();
   frosty.addButtons();
   frosty.addFace(); 
  }
}
