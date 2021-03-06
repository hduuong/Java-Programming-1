/**
 * This class represents a simply plane geometry rhombus.
 * 
 * @author Duong H Chau
 * @version Assignment 5 (Challenge)
 */
public class MyRhombus extends MyRectangle {
  /**
   * Constructor of MyRhombus
   * @param d diameter of circle
   */ 
  public MyRhombus(int h, int w) {
    super(h, w);
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the area of the rhombus
   */
  public double getArea() {
    // calculate the area
    return 0.5 * (height * width);
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the perimeter of the rhombus
   */
  public double getPerimeter(){
    return 4 * (Math.sqrt(0.25*height*height + 0.25*width*width));
  }
  /**
   * overide the getName method
   * @return the name of the shape
   */
  public String getName() {
    return "rhombus";
  }
}