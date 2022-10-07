import java.util.Scanner;
public class Upper_Case
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter any letter - ");
    char s = ob.next().charAt(0);
    char a = Character.toUpperCase(s);
    System.out.println(a);
    }
}