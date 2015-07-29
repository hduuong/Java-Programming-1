/**
 * This is a class where I draw a Traffic Light
 * CSC 142
 * @author Duong H Chau
 * @version Lab 2: Traffic Light
 */
import java.awt.Color;

public class TrafficLight {
  
   /**
    * This draw the Traffic Light
    */
   public void drawTheLight() {
     
     //make window
     NsccWindow win;
     win = new NsccWindow(10,10,140,330);
       
     //make Rectangle
     NsccRectangle rect;
     rect = new NsccRectangle(20,20,90,250);
     //add Rectangle to Window
     win.add(rect);
     
     //make Lights
     NsccEllipse light1;
     light1 = new NsccEllipse(10,10,70,70);
     light1.setBackground(java.awt.Color.RED);
     light1.setFilled(true);
     
     NsccEllipse light2;
     light2 = new NsccEllipse(10,90,70,70);
     light2.setBackground(java.awt.Color.YELLOW);
     light2.setFilled(true);
     
     NsccEllipse light3;
     light3 = new NsccEllipse(10,170,70,70);
     light3.setBackground(java.awt.Color.GREEN);
     light3.setFilled(true);
     
     //add Lights to Rectangle
     rect.add(light1);
     rect.add(light2);
     rect.add(light3);
     
     //repaint the window
     win.repaint(); 
   }
   /**
    * This is the main function that run the whole proram
    * @param The command-line arguments
    */
   public static void main(String[] args) {
     TrafficLight max;
     max = new TrafficLight();
     max.drawTheLight();
   }
}