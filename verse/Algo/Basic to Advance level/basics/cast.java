public class cast
{
    //comments in Java
    // is used for single line comments

    //MultiLine comments /*    */
    /*
     * write anything in this it will be multiline comment ignored by compiler
     */

  
     //documentation comments /*    */
     /**
      * @author hk

      * @param args
      @since 2001

      */   
    public static void main(String[] args)
     

    //public is Access modifier(Access modifier controls the visibility of class members )
    //static invokes method without object creation
    //void implies return type(i.e void means nothing)
    //main indicates main method 
    //String is type of arguments need to be stored,here args[] is the array of instances of the class String(implies stores Strings in it[])
    // instead of "args" we can use our desired name

    /*
     * In simple words lets define psvm
     * public implies it accesible throughout the whole program
     * static implies main method can be invoked vthout obj creation
     * void indicates main returns nothing
     * main is the main method such that every program should have a main method
     * String is the type
     * [] stores the array of instances of the type
     * args is just a name you can use even you desired name ,better use only args

     */

    {
        /* 

        //lets practically see how args work
       //System.out.println("Take instances of type String(array of string) declarion" +args[1]);
       // System.out.println("args[0] is " +args[0]);

        // System.out.println("Take instances of type String(array of string) declarion" +args[2]);
       // System.out.println("args[1] is " +args[1]);

        System.out.println("Conversion in java");
        int a=10;  System.out.println("int value a is : "+a);
        byte b=120; System.out.println("byte value b is"+b);
        int c=10+120; System.out.println("a and b are added and the value is stored in int c");
        System.out.println(c);
                
        
        //Type casting 
        System.out.println("LETS START TYPECASTING");
        int d=130;
        byte e=(byte)d;
        System.out.println(e);
        System.out.println("stored 130 in byte above but user cannot understand exact value");
       
        System.out.println("Casting back to int");
        int f=(int)e;
        System.out.println("No change is observed");
        System.out.println(f);

        int g=32769;
        short h=(short)g;
        System.out.println(h);



        //do not brainStrom for out of capacity limit castings

        float num=99.99f;
        int num1=(int)num;
        System.out.println(num1);

        byte numb=(byte)num;
        System.out.println(numb);

        double dnum=99.01002000;
        float fnum=(float)dnum;
        System.out.println(fnum);

        float mm=99.002003000000000000000009f;
        System.out.println(mm);


        int marks=32;
        int sub=3;
        float avg=(float)marks/sub;
        System.out.println(avg);
    */

    //operator and operand
    //opertor implies operation that is done and operand means for which(variables) the operation is done
    //Arthimetic operators (+,-,*,/,%)
    //Urnary operators(+,-,++,--)

    //POST,PRE Increments and Decrements

    // int c=20;
    // c++; //c=c+1
    // System.out.println(c);
    // c++; //c=c-1
    // System.out.println(c);
    // int b=++c;
    // System.out.println(c);
    // System.out.println(b);
    // int d=--c;
    // System.out.println(c);
    // System.out.println(d);

    System.out.println("INCREMENT");
    int y=10;
    System.out.println(y);
    int f=y++; //f=y and y=y+1
    System.out.println(y);
    System.out.println(f);
    int g=++y; //g=y+1
     System.out.println(y);
    System.out.println(g);

    System.out.println("DECREMENT");
    int l=20;
    System.out.println(l);
    int m=l--;
    System.out.println(l); //19
    System.out.println(m); //20
    int n=--l;
    System.out.println(l);//18
    System.out.println(n);//18

    









        


        

    }
    
}
