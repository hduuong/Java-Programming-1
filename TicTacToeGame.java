import javax.swing.*;
import java.awt.event.*;
/**
 * this class makes a tic tac toe game
 * 
 * @author Duong H Chau
 * @version Assignment 10
 */ 
public class TicTacToeGame implements ActionListener {
  
  //declares the fields
  private JLabel label;
  private JButton[] button;
  private NsccWindow window;
  private int xoturn;
  
  /**
   * this is a constructor that instantiates the fields
   */ 
  public TicTacToeGame() {
    
    // creates the window
    window = new NsccWindow(10,10,235,280);
    window.setTitle("Tic-Tac-Toe");
    
    // makes the black lines
    NsccRectangle thelines = new NsccRectangle(30, 30, 160, 160); 
    thelines.setBackground(java.awt.Color.BLACK);
    thelines.setFilled(true);
    window.add(thelines);
    
    // making buttons
    button = new JButton[9];
    int x = 30;
    int y = 30;
    for (int i = 0; i < button.length; i++){
      
      if(i%3 == 0) x = 30;
      else{
        x += 55;
      }
      if(i%3 == 0 && i != 0) y += 55;
      
      button[i] = new JButton();
      button[i].setSize(50,50);
      button[i].setLocation(x,y);
      button[i].addActionListener(this);
      window.add(button[i]);
    }
    
    
    // properties for JLabel
    label = new JLabel("X's turn", JLabel.CENTER);
    label.setSize(160,20);
    label.setLocation(30,200);
    window.add(label);
    
    window.repaint();
    
    xoturn = 0;
  }
  
  /**
   * this is an implement method of Action Performed
   * 
   * @param a ActionEvent
   */ 
  public void actionPerformed(ActionEvent a){
    
    JButton click = (JButton) a.getSource();
    
    if(!(click.getText().equals("X") || click.getText().equals("O"))){
      if(xoturn % 2 == 0){
        click.setText("X");
        label.setText("O's turn");
        xoturn ++;
      } else {
        click.setText("O");
        label.setText("X's turn");
        xoturn ++;
      }
    }
  }
  /**
   * This is the application method.
   * 
   * @param args The command-line arguments. 
   */ 
  public static void main(String[] arg){
    new TicTacToeGame();
  }
}