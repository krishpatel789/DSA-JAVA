public class recuName 
{
    static  String s="Hari";
    public static String name(int n)
    {
        if(n<=0)
        {  
           return "";
        }
        return s +"\n"+name(n-1);
    }  
    
    public static void name1(int n)
    {
        if(n>0)
        {
            System.out.println("Hey Raj.....!");
            n--;
        }
    }  

    public static void main(String[] args) 
    {
        //System.out.println(name(5));
        int n=5;
        String result=name(n);
        if(n>0)
        {
            System.out.println(result);
        }
        
    }

 

}

