import java.util.Scanner;
public class armstrongnum 
{
    public boolean armstrong(int n)
    {
        //int digits count=0;
        int sum=0;
        int temp=n;
        //int digitcount=0;
        boolean armstrongg=true;

        while(n>0)
        {
            int ld=n%10;
            n=n/10;
            //digitcount++;
            sum=sum+(int)Math.pow(ld,3);
        }
       
        if(sum==temp)
        {
            armstrongg=true;
        }
        else 
        {
            armstrongg=false;
        }

        return armstrongg;

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        armstrongnum ob=new armstrongnum();
        int n=sc.nextInt();
        System.out.println(ob.armstrong(n));

    }
    
}
