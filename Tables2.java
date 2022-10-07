import java.util.*;
public class Tables2
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Which tables do you want cacoon????");
    int n = ob.nextInt();
    int product = 0;
    for(int i = 1;i<=10;i++)
    {
      product = n*i;
      System.out.println(n+" x "+i+" = "+product);
    }
  }  
}