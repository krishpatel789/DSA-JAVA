class mainpat
{
    static void pat1(int n)
    {
         int var=1;
        for(int i=1;i<=n;i++)
        {
             for(int j=1;j<=i;j++)
             {
                System.out.print(var + " ");
                //System.out.print(" ");
                var=var+1;
             }
             System.out.println(" ");
        }
    }

    static void pat2(int n)
    {
             char ch='A';
        for(int i=0;i<n;i++)
        {
        
             for(int j=0;j<=i;j++)
             {
                
                //System.out.print((char)('A'+i)+" ");
                int c=ch + i;
                System.out.print( (char)c + " ");
             }
           
             System.out.println(" ");
           // ch=ch++;
        }
        
    }
    static void pat3(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     static void pat4(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    static void pat5(int n)
    {
        for (int i=1;i<=n;i++)
        {
            //SPACES
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            //STARS
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");

            
        }
    } 
     static void pat6(int n)
    {
    
       for(int i=0;i<n;i++)
       {
        //space
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        //System.out.println(" ");
        //STARS
        
        for(int j=n;j>i;j--)
        {
            System.out.print("*");
        }
        System.out.println(" ");

       }
    } 
     static void pat7(int n)
     {
       
        for(int i=1;i<=n;i++)
         //char chhh='A';
       
        {
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                 
                System.out.print(ch);
                ch++;
               
            }
           
            System.out.println(" ");
        }

     }
     static void pat8(int n)
     {
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=n;j>=i;j--)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
     }
     static void pat9(int n)
     {
        for(int i=1;i<=n;i++)
        {


            //Space
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
               
            }

           //Digits
          // int breakpoint=(2*i-1)/2;
           char ch ='A';
           for(int j=1;j<=2*i-1;j++) //j=3 --
            {
                System.out.print(ch);
                if(j<2)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
                

               
            }
           
        //     if(i>=2)
           
        //     {
        //         char cha='A';
        //    for(int j=1;j<i;j++)
        //    {
        //         System.out.print(cha);
        //         cha++;
        //    }
        //    cha++;
          
        //     }
             System.out.println(" ");

           




           //spaces



        }
        









     }

     public static void main(String args[])
    {
    //mainpat.pat1(5);
   // mainpat.pat2(5);
   // mainpat.pat3(5);
    //mainpat.pat4(5);
    //mainpat.pat5(5);
     //mainpat.pat6(5);
     //mainpat.pat7(5);
     //mainpat.pat8(5);
     mainpat.pat9(5);

    }
}

