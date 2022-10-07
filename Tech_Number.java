import java.util.*;
public class Tech_Number
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    for(int num = 1000;num<=9999;num++)
    {
      int temp = num;
      int dig1 = temp%10;
      int dig2 = temp%100;
      int dig3 = temp%1000;
      int dig4 = temp%10000;
      double tech = (dig2+dig4)*(dig2+dig4);
      System.out.println(tech);
    }
  }
}