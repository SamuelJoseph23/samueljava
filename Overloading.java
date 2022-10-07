import java.util.*;
public class Overloading
{
  void triangle(int side1, int side2, int side3)
  {
    int perimeter = side1 + side2 + side3;
    System.out.println("Perimeter is "+perimeter);
  }
  void square(int side)
  {
    int perimeter = side * 4;
    System.out.println("Perimeter is "+perimeter);
  }
  void rectangle(int length, int breadth)
  {
    int perimeter = 2*(length+breadth);
    System.out.println("Perimeter is "+perimeter);
  }
}