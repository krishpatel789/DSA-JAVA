package Interface;


//default methods in interface are  specified in java 8 .
interface Student{
    void name();
    default void attendance()
    {
        System.out.println("75%");
    }
}
class Suresh implements Student{
    public void name(){
        System.out.println("Student name is: Suresh");
    }
}

class demethods 
{
    public static void main(String[] args)
    {
        Suresh obj=new Suresh();
        obj.name();
        obj.attendance();
    }
}
