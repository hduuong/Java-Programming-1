/**
 * This class represents a simply plane geometry triangle.
 * 
 * @author Duong H Chau
 * @version Assignment 5
 */
public class MyTriangle extends MyShape {
  /**
   * constructor of MyTriangle
   * @param h, height of the triangle
   * @param w, width of the triangle
   */ 
  public MyTriangle(int w, double c, double h) {
    super((int)(1 / (1/c + 1/h)), w, c, h);
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the area of the triangle
   */ 
  public double getArea() {
    // calculate the area
    return (height * width) / 2;
  }
  /**
   * An override. This replaces the getArea method inherited
   * from MyShape. This is a "real" implementation.
   * 
   * @return the perimeter of the triangle
   */ 
  public double getPerimeter(){
    return (side2 + width + side1);
  }
  /**
   * overide the getName method
   * @return the name of the shape
   */
  public String getName() {
    return "triangle";
  }
}