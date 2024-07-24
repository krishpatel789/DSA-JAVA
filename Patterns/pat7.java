package Patterns;

public class pat7 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            //spaces 4 3 2 1 0
            for(int j=4;j>i;j--)
            {
                System.out.print(" "); 
            }
             //4 1 5-i-1  0  i*2+1
            // 3 3        1 
            // 2 5        2
            // 1 7        3
            // 0 9        4

            //stars 1 3 5 7 9
            int num=1;
            for(int k=i*2+1;k>0;k--)
            {
                System.out.print("*");
                
            }
           
            System.out.println();
        }
    }
    
}
