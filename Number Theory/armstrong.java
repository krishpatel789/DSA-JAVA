import java.util.Scanner;
public class armstrong
{
    static boolean isarmstrong(int num)
    {
        int temp=num;
        int sum=0;
        while(num>0)
        {
            int lastdigit=num%10;
            sum=sum+lastdigit*lastdigit;
            num=num/10;
        }
        // if (temp==sum)
        // {
        //     return true;
        // }
        // else 
        //  return false;
        return temp==sum;
    }
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        //int number_check=sc.nextInt();
        //System.out.println(isarmstrong(number_check));
        //sc.close();
        int count=0;
        for(int i=10;i<100;i++)
        {
            if(isarmstrong(i)==true)
            System.out.print(i +" ");
        }
        if (count==0)
        {
            System.out.println("There exists no Two digit armstrong number :");
        }
    } 
}
