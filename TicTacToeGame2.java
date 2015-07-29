import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
/**
 * This is Tic Tac Toe Game. 
 * 
 * @author Fadi Jamil 
 * @version Assignment 10: Tic-Tac-Toe Game 
 */
public class TicTacToeGame2 implements ActionListener {
  //instantiate nine buttons 
 // private JButton[] num = new JButton[9];
 // private ArrayList<JButton> y= new ArrayList<JButton>(); 
  private JLabel a;
  private int turn;
  private JButton btn;  
  /**
   * Constructor for objects of class TicTacToeGame
   * This creates a Tic Tac Toe board with nine buttons at the 
   * specified location.
   */
  public TicTacToeGame2() {
    //turn = 1;
    // create the window
    NsccWindow win = new NsccWindow(10, 10, 238, 280);
    win.setTitle("Tic-Tac-Toe");
    // make the black lines between buttons
    NsccRectangle rect = new NsccRectangle(30, 30, 160, 160); 
    rect.setFilled(true);
    rect.setBackground(java.awt.Color.BLACK);
    win.add(rect);
    // instantiate JLabel
    a = new JLabel();
    a.setText("X's turn");
    a.setSize(160, 20);
    a.setLocation(30, 200);
    //set JLabel
    a.setHorizontalAlignment(JLabel.CENTER);
    win.add(a);
    // repaint the window 
    win.repaint(); 
    // set a nested loop
    for(int i=30;i<=140;i+=55){
      for(int j=30;j<=140;j+=55){
        JButton btn = new JButton();
        btn.setSize(50, 50);
        btn.setLocation(i, j);
        btn.addActionListener(this);
        win.add(btn);
        win.repaint();        
      } 
    }
  } 
  /**
   * inherited abstract method with implemenation
   */ 
  public void actionPerformed(ActionEvent e){
    btn = (JButton) e.getSource();
    if(!(btn.getText().equals("X") || btn.getText().equals("O"))){     
      if(turn % 2 == 1){
        btn.setText("X");
        a.setText("O's turn");
        btn.setEnabled(false);
        turn++;
      }else{
        btn.setText("O");
        a.setText("X's turn");
        btn.setEnabled(false);
        turn++;      
      } 
    }
  }   
  /**
   * This is the application method.
   * 
   * @param args The command-line arguments. 
   */ 
  public static void main(String[] args){
    TicTacToeGame2 game = new TicTacToeGame2();
  }    
}
