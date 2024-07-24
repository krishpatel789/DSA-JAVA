import java.util.Scanner;
public class prime 
{
    boolean primee(int number)
    {
        boolean isprimee=true;
        int count=0;
        for(int i=1;i*i<=number;i++)
        {
            if(number%i==0)
            {
                count++;
            
            if(number/i!=i)
            {
                count++;
            }
        }
        }
        if(count==2)
        {isprimee=true;}
        else
        {isprimee=false;}
        return isprimee;
    }
    
    
    public static void main(String[] args) 
    {
        prime obj=new prime();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(obj.primee(num));
        sc.close();
        
    }
}
