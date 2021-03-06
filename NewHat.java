/**
 * this creates a new hat
 * @author Duong H Chau
 * @version Lab 4
 */
public class NewHat extends NsccComponent {
 
  // The pieces of the top hat
  private NsccComponent brim;
  private NsccComponent body;
  private NsccComponent stripe;
  
  /**
   * A constructor for TopHat. This creates a black top hat
   * with a blue stripe of the 'standard' size, at the specified location.
   * 
   */
  public NewHat() {
    super(0, 0, 100, 45);
    // create the pieces of the hat
    brim = new NsccEllipse(0, 35, 70, 10);
    body = new NsccUpTriangle(15, 0, 40, 45);
    stripe = new NsccRectangle(21,30,28,5);
    
    body.setBackground(java.awt.Color.BLACK);
    brim.setBackground(java.awt.Color.BLACK);
    stripe.setBackground(java.awt.Color.BLUE);
    
    body.setFilled(true);
    brim.setFilled(true);
    stripe.setFilled(true);
    
    // add the pieces to the hat
    add(brim);
    add(body);
    add(stripe);
  }
}
