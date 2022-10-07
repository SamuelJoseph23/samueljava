public class Exam
{
  public static void main()
  {
    int a=7;
    switch(a)
    {
      case 2:
      System.out.println("a=2");
      break;
      case 4:
      System.out.println("a=4");
      break;
      default:
      System.out.println("a is not equal to 2 or 4");
    }
    System.out.println((a==5)?"a=5":((a==7)?"a=7":"a is not equal to 2 or 4"));
    }
}