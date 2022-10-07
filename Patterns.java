import java.util.Scanner;
public class Patterns
{
    public static void printFormat()
    {
    Scanner ob = new Scanner(System.in);
    String a;
    System.out.println("Which pattern do you want?(Enter a  set of symbols or letters etc:-)");
    a = ob.nextLine();
      for(int i = 1;i <= 24; i++)
      {
        for(int j = 1;j <= i; j++)
        {
        System.out.print(a+" ");
        } 
        System.out.println( );
    }
  }
}