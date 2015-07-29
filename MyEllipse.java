/**
 * This class represents a simply plane geometry ellipse.
 * 
 * @author Duong H Chau
 * @version Assignment 5 (challenge)
 */
public class MyEllipse extends MyShape {
  /**
   * MyEllipse constructor
   * @param h , height of the ellipse
   * @param w , width of the ellipse
   */ 
  public MyEllipse(int h, int w) {
    super(h, w, 0, 0);
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the area of the ellipse
   */
  public double getArea() {
    // calculate the area
    return (Math.PI * height * width) / 4;
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the perimeter of the ellipse
   */
  public double getPerimeter(){
    return (Math.PI * Math.sqrt(0.5 * (height*height + width*width)));
  }
  /**
   * overide the getName method
   * @return the name of the shape
   */
  public String getName() {
    return "ellipse";
  }
    
}