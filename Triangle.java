import java.util.Scanner;
public class Triangle
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    double side,side2,side3;
    int option;
    do
    {
    System.out.println("Enter the first side -");
    side = ob.nextDouble();
    System.out.println("Enter the second side -");
    side2 = ob.nextDouble();
    System.out.println("Enter the third side -");
    side3 = ob.nextDouble();
    {
      if(side == side2 && side2 == side3)
      System.out.println("It is an equilateral triangle");
      else if(side != side2 && side2 != side3)
      System.out.println("It is a scalene triangle");
      else
      System.out.println("It is isosceles triangle");
    }
    System.out.println("Enter 1 to do it again!");
    option = ob.nextInt();
  }while(option ==1);
}
}