import java.util.Scanner;
public class gcd {
    static void GreatestCommonDivisor(int num1,int num2)
    {
        int HigherValue=0;
        int LowerValue=0;
        if(num1>num2)
        {
            HigherValue=num1;
            LowerValue=num2;
        }
        else
        {
            HigherValue=num2;
            LowerValue=num1;
        }
        int commonfactor=1;
        for(int i=1;i*i<HigherValue;i++)
        {
            if(HigherValue%i==0 && LowerValue%i==0)
            {
                if(commonfactor<i)
                { commonfactor=i;}
               
                if(HigherValue/i!=0 && LowerValue/i!=0)
                {
                    if(HigherValue/i>=LowerValue/i)
                    {commonfactor=HigherValue/i;}
                    else
                    {commonfactor=LowerValue/i;}

                
                }

            }

        }
        System.out.println(commonfactor);
    }
    public static void main(String[] args) 
    {

        GreatestCommonDivisor(20, 40);
        
    }
}
