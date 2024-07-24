//StringBuffer class
public class stringMet
{
    public static void main(String args[])
    {
        //USING StringBuffer class
        StringBuffer str=new StringBuffer();
        str.append("Hari");
        str.append(" Krishna");
       // str.reverse();
        str.insert(5," is also ");
        str.replace(6,13,"is only");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());
        

    }
    
}
