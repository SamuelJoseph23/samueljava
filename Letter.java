import java.util.*;
public class Letter
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    char a;
    System.out.println("Enter your letter ");
    a = ob.next().charAt(0);
    System.out.println(Character.toUpperCase(a));
    System.out.println((int)a);
    }
}