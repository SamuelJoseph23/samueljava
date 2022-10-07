public class Reverse_Number
{
  public static void main(int number)
  {
    int temp = number;
    int reverse = 0;
    while(temp>0)
    {
      int digit = temp%10;
      reverse = reverse*10+digit;
      temp = temp/10;
    }
    System.out.println(reverse);
  }
}