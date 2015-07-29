/**
 * This class represents a simply plane geometry right triangle.
 * 
 * @author Duong H Chau
 * @version Assignment 5 (challenge)
 */
public class MyRightTriangle extends MyShape {
  /**
   * constructor of MyRightTriangle
   * @param h, height of the right triangle
   * @param w, width of the right triangle
   */ 
  public MyRightTriangle(int h, int w) {
    super(h, w, 0, 0);
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the area of the right triangle
   */ 
  public double getArea() {
    // calculate the area
    return (height * width) / 2;
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the perimeter of the right triangle
   */ 
  public double getPerimeter(){
    double c = Math.sqrt(height*height + width*width);
    return (height + width + c);
  }
  /**
   * overide the getName method
   * @return the name of the shape
   */
  public String getName() {
    return "right triangle";
  }
}