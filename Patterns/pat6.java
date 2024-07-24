package Patterns;

public class pat6 
{

    public static void main(String[] args) {
      
        for(int i=0;i<5;i++)
        {
            int cc=1;
            for(int j=5;j>i;j--)
            {
                System.out.print(cc);
                cc++;
            }
            System.out.println();
        }
    }
    
}
