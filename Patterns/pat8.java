package Patterns;


class pat8{
    public static void main(String[] args) 
    {
        int num=5;
        
        for(int i=0;i<5;i++)
        {
            //spaces

            // 0 0 9
            // 1 1 7
            // 2 2 5
            // 3 3 3
            // 4 4 1
            //stars

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");

            }
           // System.out.println();

            for(int k=num*2-1;k>0;k--)
            {
                System.out.print("*");
                
            }
            num--;
            System.out.println();


        }
        
    }
}