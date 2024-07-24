public class a
{
    int a=0;
    void nums()
    {
        if(a==10)
        {
            return;
        }
        else
        {
            System.out.println("Hari Krishna");
        a++;
        nums();

        }
        
    }
    public static void main(String[] args) 
    {
        a obj=new a();
        obj.nums();

        
    }
    
}
