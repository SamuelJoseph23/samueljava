import java.util.*;
 class Marks
{
  public static void main()
  {
   int a,b,c,average;
   Scanner ob=new Scanner(System.in);
   System.out.println("Enter marks of first subject - ");
   a = ob.nextInt();
   System.out.println("Enter marks of second subject - ");
   b = ob.nextInt();
   System.out.println("Enter marks of third subject - ");
   c = ob.nextInt();
   average = (a+b+c)/3;
   if(average>=50)
   System.out.println("Grade is A");
   else
   System.out.println("Grade is B");
    }
}