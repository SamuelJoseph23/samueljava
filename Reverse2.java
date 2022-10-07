public class Reverse2
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
    if(number == reverse)
    System.out.println("It is a Palindrome number!");
    else
    System.out.println("It is not a Palindrome number!");
    }
}