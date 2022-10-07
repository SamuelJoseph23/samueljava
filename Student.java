import java.util.*;
public class Student
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter your first marks - ");
    double m1 = ob.nextDouble();
    System.out.println("Enter your second marks - ");
    double m2 = ob.nextDouble();
    System.out.println("Enter the third marks - ");
    double m3 = ob.nextDouble();
    double average = (m1+m2+m3)/3;
    System.out.println("  ");
    System.out.println("The average marks is "+average);
    }
}