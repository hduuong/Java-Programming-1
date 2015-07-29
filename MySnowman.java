/**
 * An example of using the NsccWindow classes.
 * ... now with color!!!
 * @author CSC 142, Spring 2012
 */
public class MySnowman {
  
  /**
   * This draws the snowman.
   */
  public void draw() {
    
    // make window
    NsccWindow win;
    win = new NsccWindow(50, 50, 450, 700);
    
    // make the basic snowman
    NsccEllipse head;
    NsccEllipse body;
    head = new NsccEllipse(125, 50, 200, 200);
    body = new NsccEllipse(50, 250, 350, 350);
    win.add(head);
    win.add(body);
    head.setFilled(true);
    body.setFilled(true);
    
    /**
     * make the eyes.
     */
    NsccUpTriangle eye1;
    NsccUpTriangle eye2;
    eye1 = new NsccUpTriangle();
    head.add(eye1);
    eye2 = new NsccUpTriangle();
    head.add(eye2);
    eye1.setLocation(75, 80);
    eye2.setLocation(125, 80);
    eye1.setForeground(java.awt.Color.RED);
    eye2.setForeground(java.awt.Color.RED);
    eye1.setBackground(java.awt.Color.yellow);
    eye2.setBackground(java.awt.Color.yellow);
    eye1.setFilled(true);
    eye2.setFilled(true);

    // add the nose
    NsccRectangle nose;
    nose = new NsccRectangle(105, 120, 20, 20);
    head.add(nose);
    nose.setBackground(java.awt.Color.cyan);
    nose.setFilled(true);
    
    // repaint the window to show everything
    win.repaint();
  }
  
  /**
   * This is the main method. It runs everything.
   * 
   * @param The command-line arguments
   */
  public static void main(String[] args) {
    MySnowman bob;
    bob = new MySnowman();
    bob.draw();
  }
  
}