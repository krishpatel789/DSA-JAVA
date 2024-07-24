import java.util.Scanner;
public class checkcharacter {
class solution
{   
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
/*To take an character input we should use char variable=sc.next().charAt(0)

To read a character in Java, we use next() method followed by charAt(0). The next() method returns the next token/ word in the input as a string and chatAt() method returns the first character in that string.

 /*
      char ch=sc.next().charAt(0);
      if(Character.isUpperCase(ch))
      {
          System.out.println("1");
      }
      else if(Character.isLowerCase(ch))
      {
          System.out.println("0");
      }
      else
      {
          System.out.println("-1");
      }

    }
}

