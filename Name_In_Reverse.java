import java.util.Scanner;
public class Name_In_Reverse
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    int option;
    do
    {
      System.out.println("Enter your name - ");
      String name = ob.nextLine();
      StringBuffer p = new StringBuffer(name);
      System.out.println("Your name in reverse is ");
      System.out.println(p.reverse());
      System.out.println("Type 0 to exit or anything else to restart");
      option = ob.nextInt();
    }while(option != 0);
  }
}