import java.util.Scanner;
public class Area
{
   public static void main()
   {
      Scanner ob = new Scanner(System.in);
      double option,option2,side,length,breadth,radius;
      do
      {
       System.out.println("1.Square  2.Rectangle  3.Circle");
       option = ob.nextInt();
        if(option == 1)
        {
        System.out.println("Enter the side");
        side = ob.nextDouble();
        System.out.println("Area ="+side*side);
        }
        else if(option == 2)
        {
        System.out.println("Enter the length");
        length = ob.nextDouble();
        System.out.println("Enter the breadth");
        breadth = ob.nextDouble();
        System.out.println("Area = "+length * breadth);
        }
        else if(option == 3)
        {
        System.out.println("Enter the radius");
        radius = ob.nextDouble();
        System.out.println("Area = "+3.14*(radius*radius));
      }
      System.out.println("Enter 1 to do it again!");
      option2 = ob.nextInt();
    }while(option2 == 1);
  }
}