/**
 * This is a class where I draw Flags
 * CSC 142
 * @author Duong H Chau
 * @version Assignment 2: Flags
 */
import java.awt.Color;
public class Flags {
 
 /**
  * This draw the Niger Flag
  * Ratio: 
  * 7:6 - 420:360
  * hoist (1:1:1)
  * Calculation:
  * 360/3 = 120
  * 360/3*2 = 240
  * 120*75/100 = 90
  * (120-90)/2 + 120 = 135
  * 420/2 - 90/2 = 165
  * 
  */
  public void drawNigerFlag() {
    
    //make window
    NsccWindow win1;
    win1 = new NsccWindow(10,10,600,500);
    
    //make Rectangles
    NsccRectangle rect1;
    rect1 = new NsccRectangle(60,60,420,360);
    win1.add(rect1);
    
    //top horizontal bar
    NsccRectangle rect2;
    rect2 = new NsccRectangle(0,0,420,120);
    rect2.setBackground(new Color(225,127,0));
    rect2.setFilled(true);
    
    //bottom horizontal bar
    NsccRectangle rect3;
    rect3 = new NsccRectangle(0,240,420,120);
    rect3.setBackground(new Color(0,204,0));
    rect3.setFilled(true);
    
    rect1.add(rect2);
    rect1.add(rect3);
    
    //make circle
    NsccEllipse circle;
    circle = new NsccEllipse(165,135,90,90);
    rect1.add(circle);
    circle.setBackground(new Color(225,127,0));
    circle.setFilled(true);
    
  }
  /** This draw the Flag of Sweden
    * Ratio 
    * 8:5 - 672:420
    * blue:yellow:blue
    * hoist (4:2:4)
    * fly (5:2:9)
    * calculation
    * 672/16*5 = 210
    * 420/10*4 = 168
    * 672/16*9 = 378
    * 672/16*7 = 294
    * 420/10*6 = 252
    */
  public void drawSwedenFlag () {
   
    //make window
    NsccWindow win2;
    win2 = new NsccWindow(610,10,700,500);
    
    //make Rectangles
    NsccRectangle rec1;
    rec1 = new NsccRectangle(10,10,672,420);
    rec1.setBackground(java.awt.Color.YELLOW);
    rec1.setFilled(true);
    win2.add(rec1);
    
    //top left rectangle
    NsccRectangle rec2;
    rec2 = new NsccRectangle(0,0,210,168);
    rec2.setBackground(java.awt.Color.BLUE);
    rec2.setFilled(true);
    
    //top right rectangle
    NsccRectangle rec3;
    rec3 = new NsccRectangle(294,0,378,168);
    rec3.setBackground(java.awt.Color.BLUE);
    rec3.setFilled(true);
    
    //bottom left rectangle
    NsccRectangle rec4;
    rec4 = new NsccRectangle(0,252,210,168);
    rec4.setBackground(java.awt.Color.BLUE);
    rec4.setFilled(true);
    
    //bottom right rectangle
    NsccRectangle rec5;
    rec5 = new NsccRectangle(294,252,378,168);
    rec5.setBackground(java.awt.Color.BLUE);
    rec5.setFilled(true);
    
    rec1.add(rec2);
    rec1.add(rec3);
    rec1.add(rec4);
    rec1.add(rec5);                  
  }
  /**
   * This draw the Flag of Norway
   * Ratio: 
   * 22:16 - 352:256
   * RED-WHITE-BLUE-WHITE-RED
   * hoist(6:1:2:1:6)
   * fly(6:1:2:1:12)
   * calculation:
   * 352/22 = 16
   * 256/16 = 16
   * 16*7 = 112
   * 16*6 = 96
   * 16*13 = 208
   * 16*12 = 192
   * 16*9 = 144
   */
  public void drawNorwayFlag () {
   
    //make window
    NsccWindow win3;
    win3 = new NsccWindow(10,360,400,350);
    
    //make Rectangles
    NsccRectangle rect;
    rect = new NsccRectangle(24,22,352,256);
    rect.setBackground(java.awt.Color.BLUE);
    rect.setFilled(true);
    win3.add(rect);
    
    //top left
    NsccRectangle recT1;
    recT1 = new NsccRectangle(0,0,112,112);
    recT1.setBackground(java.awt.Color.WHITE);
    recT1.setFilled(true);
    NsccRectangle rect1;
    rect1 = new NsccRectangle(0,0,96,96);
    rect1.setBackground(java.awt.Color.RED);
    rect1.setFilled(true);
    rect.add(recT1);
    recT1.add(rect1);
    
    //bottom left
    NsccRectangle recT2;
    recT2 = new NsccRectangle(0,144,112,112);
    recT2.setBackground(java.awt.Color.WHITE);
    recT2.setFilled(true);
    NsccRectangle rect2;
    rect2 = new NsccRectangle(0,16,96,96);
    rect2.setBackground(java.awt.Color.RED);
    rect2.setFilled(true);
    rect.add(recT2);
    recT2.add(rect2);
    
    //top right
    NsccRectangle recT3;
    recT3 = new NsccRectangle(144,0,208,112);
    recT3.setBackground(java.awt.Color.WHITE);
    recT3.setFilled(true);
    NsccRectangle rect3;
    rect3 = new NsccRectangle(16,0,192,96);
    rect3.setBackground(java.awt.Color.RED);
    rect3.setFilled(true);
    rect.add(recT3);
    recT3.add(rect3);
    
    //bottom right
    NsccRectangle recT4;
    recT4 = new NsccRectangle(144,144,208,112);
    recT4.setBackground(java.awt.Color.WHITE);
    recT4.setFilled(true);
    NsccRectangle rect4;
    rect4 = new NsccRectangle(16,16,192,96);
    rect4.setBackground(java.awt.Color.RED);
    rect4.setFilled(true);
    rect.add(recT4);
    recT4.add(rect4);  
  }
  /**
   * This draw the Flag of Seychelles
   * Ratio:
   * 2:1 - 444:222
   * hoist(1:1:1)
   * fly(1:1:1)
   * calculation
   * 444/3 = 148
   * 222/3 = 74
   * 148*2 = 296
   * 296*2 = 592
   * 74*2 = 148
   * 
   */
  public void drawSeychellesFlag () {
   
    //make window
    NsccWindow win4;
    win4 = new NsccWindow(410,360,500,350);
    
    
    //make Rectangle
    NsccRectangle rect;
    rect = new NsccRectangle (20,50,444,222);
    rect.setBackground(java.awt.Color.RED);
    rect.setFilled(true);
    win4.add(rect);
    
    //make Down Triangle
    NsccDownTriangle angle1;
    angle1 = new NsccDownTriangle (-296,0,592,222);
    angle1.setBackground(java.awt.Color.YELLOW);
    angle1.setFilled(true);
    rect.add(angle1);
    
    NsccDownTriangle angle2;
    angle2 = new NsccDownTriangle (-148,0,296,222);
    angle2.setBackground(java.awt.Color.BLUE);
    angle2.setFilled(true);
    rect.add(angle2);
    
    //make Left Triangle
    NsccLeftTriangle angle3;
    angle3 = new NsccLeftTriangle (0,74,444,296);
    angle3.setBackground(java.awt.Color.WHITE);
    angle3.setFilled(true);
    rect.add(angle3);
    
    NsccLeftTriangle angle4;
    angle4 = new NsccLeftTriangle (0,148,444,148);
    angle4.setBackground(java.awt.Color.GREEN);
    angle4.setFilled(true);
    rect.add(angle4);    
    
  }
  /**
   * This draw the flag of Alabama
   * Ratio:
   * 10:6 - 440:264
   * RED:WHITE:RED
   * hoist(1:9:1)
   * fly(1:9:1)
   * Calculation:
   * 440/11 = 40
   * 264/11 = 24
   * 40*9 = 360
   * 24*9 = 216
   * 264/2 - 24 = 108
   * 440/2 - 40 = 180
   * 264 - 108 = 156
   * 440/2 + 40 = 260
   */
  public void drawAlabamaFlag () {
    
    //make window
    NsccWindow win5;
    win5 = new NsccWindow (910,360,500,350);
    
    //make Rectangle
    NsccRectangle rect;
    rect = new NsccRectangle (0,30,440,264);
    rect.setBackground(java.awt.Color.RED);
    rect.setFilled(true);
    win5.add(rect);
    
    //make Triangle
    NsccDownTriangle down;
    down = new NsccDownTriangle(40,0,360,108);
    down.setBackground(java.awt.Color.WHITE);
    down.setFilled(true);
    
    NsccUpTriangle up;
    up = new NsccUpTriangle(40,156,360,108);
    up.setBackground(java.awt.Color.WHITE);
    up.setFilled(true);
    
    NsccRightTriangle right;
    right = new NsccRightTriangle(0,24,180,216);
    right.setBackground(java.awt.Color.WHITE);
    right.setFilled(true);
    
    NsccLeftTriangle left;
    left = new NsccLeftTriangle(260,24,180,216);
    left.setBackground(java.awt.Color.WHITE);
    left.setFilled(true);
    
    rect.add(down);
    rect.add(up);
    rect.add(right);
    rect.add(left);
    
  }
  /**
   * This runs the whole program
   * the method runs and calls the other methods to draw the Flags
   * 
   * @param args The command-line arguments.
   */
  public static void main(String[] args) {
   Flags test;
   test = new Flags();
   test.drawSwedenFlag();
   test.drawNigerFlag();
   test.drawNorwayFlag();
   test.drawSeychellesFlag();
   test.drawAlabamaFlag();
  
  }

}