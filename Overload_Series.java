
public class Overload_Series
{
   public static void series(double n)
   {
    double count = n;
    double sum = 0;
    for(double i=n;i<n;i++)
    {
      sum = (Math.pow(i,2) - 1) + sum;
      }
    System.out.println(sum);
  }
}