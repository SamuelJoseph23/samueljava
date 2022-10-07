import java.util.*;
public class Words
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number - ");
    int number = ob.nextInt();
    int temp = number;
    String a ="One";
    String b ="Two";
    String c ="Three";
    String d ="Four";
    String e ="Five";
    String f ="Six";
    String g ="Seven";
    String h ="Eight";
    String i ="Nine";
    String j ="Zero";
    while(temp>0)
    {
      int digit = temp%10;
      if(digit == 1)
      System.out.print(a+" ");
      else if(digit == 2)
      System.out.print(b+" ");
      else if(digit == 3)
      System.out.print(c+" ");
      else if(digit == 4)
      System.out.print(d+" ");
      else if(digit == 5)
      System.out.print(e+" ");
      else if(digit == 6)
      System.out.print(f+" ");
      else if(digit == 7)
      System.out.print(g+" ");
      else if(digit == 8)
      System.out.print(h+" ");
      else if(digit == 9)
      System.out.print(i+" ");
      else if(digit == 0)
      System.out.print(j+" ");
      temp = temp/10;
    }
  }
}