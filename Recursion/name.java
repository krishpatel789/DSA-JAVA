public class name
{
    static String nameis="Chatrapati Shivaji Maharaj";
    public static String name1(int n)
    {
        if(n<=0)
        {
            namee(n);
           // return "";
           name1(n-1);
        }
        return nameis;
    }
    static void namee(int n) 
    {
        if(n>1)
        {
            System.out.println(nameis);
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(name1(5));
    }

}
