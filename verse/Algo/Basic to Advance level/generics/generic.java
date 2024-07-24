
//generics allows program to take any type of data and work on it/store & process data of any type
//generic methods :
              // A method that can be refered to any datatype is called a generic method

public class generic 
{
    /*

    Syntax:

    <accessspecifier><ReturnType> mName(<TypeList>)
    {
        //Body of method
    }
     */

     //Defining a generic method to print any data type
     void genericPrint(T )
     {
        System.out.println(t);
     }

     public static void main(String[] args) 
     {
        // generic obj=new  generic();
        // obj.genericPrint<Integer>(150);
        // obj.genericPrint("This is a generic method");
        // obj.genericPrint(3.8555555555);

        generic obj = new generic();

obj.genericPrint<Integer>(150);
obj.genericPrint<String>("This is a generic method");
obj.genericPrint<Double>(3.8555555555);

        
     }
    
}
