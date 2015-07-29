/**
 * this is a class where I make a Tic-Tac-Toe
 * @version : Assignment 3: Tic-Tac-Toe
 * @author: Duong H Chau
 */
import java.awt.Color;

public class TicTacToeBoards{
 //declare an instance variable, as private
  private NsccWindow win ;
  /**
   * this is a contructor that creates an NsccWindow instance
   * and calls the methods to draw tic tac toe boards
   */
  public TicTacToeBoards(){
    win = new NsccWindow (10,10,300,330);
    
    drawTicTacToeBoards(40,40);
    drawTicTacToeBoards(40,170,5);
    drawTicTacToeBoards(170,40,java.awt.Color.BLUE);
    drawTicTacToeBoards(170,170);
  }
  /**
   * this draws a Tic-Tac-Toe Board
   * @param x coorinates the position in horizontal direction
   * @param y coorinates the position in vertical direction
   */ 
  public void drawTicTacToeBoards(int x, int y) {
    NsccLine line1;
    line1 = new NsccLine(x,y+30,x+90,y+30);
    win.add(line1);
    NsccLine line2;
    line2 = new NsccLine(x,y+60,x+90,y+60);
    win.add(line2);
    NsccLine line3;
    line3 = new NsccLine(x+30,y,x+30,y+90);
    win.add(line3);
    NsccLine line4;
    line4 = new NsccLine(x+60,y,x+60,y+90);
    win.add(line4);
    //repaint to show the board
    win.repaint();
  }
  /**
   * This draw a Tic Tac Toe Board with Color
   * @param x coorinates the position in horizontal direction
   * @param y coorinates the position in vertical direction
   * @param Color: the color of the board
   */ 
  public void drawTicTacToeBoards(int x, int y, Color a) {
   NsccLine line1;
   NsccLine line2; 
   NsccLine line3; 
   NsccLine line4;
   
   line1 = new NsccLine(x,y+30,x+90,y+30);
   line2 = new NsccLine(x,y+60,x+90,y+60);
   line3 = new NsccLine(x+30,y,x+30,y+90);
   line4 = new NsccLine(x+60,y,x+60,y+90);
   
   line1.setForeground(a);
   line2.setForeground(a);
   line3.setForeground(a);
   line4.setForeground(a);
   
   win.add(line1);
   win.add(line2);
   win.add(line3);
   win.add(line4);
   
   //repaint to show the board
   win.repaint();
  }
  /**
   * this draw the board with thinkness
   * @param x coorinates the position in horizontal direction
   * @param y coorinates the position in vertical direction
   * @param b is refrence the thickness
   */ 
   public void drawTicTacToeBoards(int x, int y, int b) {
   NsccRectangle line1;
   NsccRectangle line2; 
   NsccRectangle line3; 
   NsccRectangle line4;
   
   line1 = new NsccRectangle(x,y+30,90,b);
   line2 = new NsccRectangle(x,y+60,90,b);
   line3 = new NsccRectangle(x+30,y,b,90);
   line4 = new NsccRectangle(x+60,y,b,90);
   
   line1.setBackground(java.awt.Color.black);
   line2.setBackground(java.awt.Color.black);
   line3.setBackground(java.awt.Color.black);
   line4.setBackground(java.awt.Color.black);
   
   line1.setFilled(true);
   line2.setFilled(true);
   line3.setFilled(true);
   line4.setFilled(true);
   
   win.add(line1);
   win.add(line2);
   win.add(line3);
   win.add(line4);
   
   //repaint to show the board
   win.repaint();
   }
   /**
    * this draw the board with rotation
    * @param x coorinates the position in horizontal direction
    * @param y coorinates the position in vertical direction
    * @param b is the angle of rotation
    */ 
   public void drawTicTacToeBoards(int x, int y, double b) {

   }
  /**
   * This runs the whole program
   * @papram args The command-line arguments
   */
  public static void main(String[] args) {
    TicTacToeBoards run;
    run = new TicTacToeBoards ();
    
  }
}