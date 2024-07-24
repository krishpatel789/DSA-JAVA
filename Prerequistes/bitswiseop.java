public class bitswiseop 
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        
        int a=10;
        int b=a<<2;
        System.out.println(b);
        System.out.println(a);

        int c=10;
        int d=~c;
        System.out.println(d);
        System.out.println(c);

        // (a+1)<<2
        // (a+1)>>2
        // ~(a+1)

        int e=10;
        int n=10 &2;
        int f=(e+1)<<2;
        int g=(e+1)>>2;
        int h=~(e+1);
        System.out.println(f +" \n "+g+" \n "+h);




        int m=2;
        int t=7;
      
        System.out.println(2 && 7);
        
    }
    
}
