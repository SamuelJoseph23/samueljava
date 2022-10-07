import java.util.*;
public class Count_Words
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a sentence - ");
    String s = ob.nextLine();
    String arr[] = s.split(" ");
    String temp;
    int count = 0;
    for(int i=0;i<51;i++)
    {
      if(arr[i] == " ")
      continue;
      else
      temp = arr[i];
      for(int j=0;j<49;j++)
      {
        if(arr[j] == " ")
          continue;
        else if(arr[j] == temp)
        {
          ++count;
          arr[j] = " ";
        }
      }
      System.out.println("Occurence of "+temp+" is - "+count);
      count = 0;
    }
  }
}