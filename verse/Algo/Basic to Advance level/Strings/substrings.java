import java.util.Scanner;
public class substrings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String subb=s.substring(i,j);
               // System.out.println(subb);
                String temp="";
                for(int k=subb.length()-1;k>=0;k--)
                {
                    char ch=subb.charAt(k);
                    temp=temp+ch;
                    if(temp.equals(subb))
                    {
                        System.out.println(subb);
                        
                    }
                }

            }
        }
    }
    
}
