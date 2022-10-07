public class Buzz
{
  public static void main()
  {
    System.out.println("BUZZ NUMBERS from 5 to 90 are:-");
    for(int i=1;i<=90;i++)
    {
      if(i%7 == 0 || i%10 == 7)
      System.out.println(i+" ");
    }
  }
}