import java.util.*;
public class TheString
{
  String str;
  int len;
  int wordcount;
  int cons;
  TheString()
  {
    str = " ";
    len=0;
    wordcount=0;
    cons = 0;
  }
  TheString(String ds)
  {
    str = ds;
  }
  void countFreq()
  {
    char c;
    str=str.toUpperCase();
    str=str+' ';
    len = str.length();
    for(int i=0;i<len;i++)
    {
      c=str.charAt(i);
      if(c==' ')
      wordcount++;
      else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
      {
        continue;
      }
      else
      cons++;
    }
  }
  void display()
  {
    System.out.println(str);
    System.out.println(wordcount);
    System.out.println(cons);
  }
  public static void main()
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String s = in.nextLine();
    TheString ob = new TheString();
    ob.countFreq();
    ob.display();
  }
}