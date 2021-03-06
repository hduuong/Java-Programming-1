/**
 * This class represents a simply plane geometry circle.
 * 
 * @author Duong H Chau
 * @version Assignment 5 (challenge)
 */
public class MyCircle extends MyEllipse {
  /**
   * Constructor of MyCircle
   * @param d diameter of circle
   */ 
  public MyCircle(int d) {
    super(d, d);
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the area of the circle
   */
  public double getArea() {
    // calculate the area
    return 0.25 * (Math.PI * height*height);
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the perimeter of the circle
   */
  public double getPerimeter(){
    return (Math.PI * height);
  }
  /**
   * overide the getName method
   * @return the name of the shape
   */
  public String getName() {
    return "circle";
  }
}