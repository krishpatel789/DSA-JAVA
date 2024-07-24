package Interface;
//interface is declared is interface keyword

/* 
1)Interface acts as the blue print for the classes to implement 
certain behaviour without specifying how the behaviours are implemented

2)It contains method signatures but it  doesnot contain any method body

3)All interface method signatures must implemented by the all inherited classes
*/
interface car{
    void carcost();
   // void carcolorr();

   String color="White"; 
   /* by default it is public(accessible),static(called without instance creation),
   final(cannot be changed anywhere) */
}
class Suzki implements car{
    public void carcost()          // method should be public or abstract
    {
        System.out.println("Cost is 10 lakhs");
       // color="red";
        System.out.println(color);
    }
}
class Creta implements car{  //implements keyword is used to declare interfaces
    public void carcost()
    {
        System.out.println("Cost is 50 lakhs");
    }
    public void carcolor()
    {
        System.out.println("Color is red");
    }
    
}
abstract class Swift implements car{
    public void carcost()
    {
        System.out.println("INSIDE ABSTRACT METHOD");
    }

}

/*
  public static void carcost()
  methods should not be static because,static method cannot hide the instance method 
  from interface class(ie interface car)
 */
class Audi implements car{
    public  void carcost()
    {
        System.out.println("Cost is 100 lakhs");
    }
}
class Bmw implements car{
    public void carcost()
    {
        System.out.println("Cost is 150 lakhs");
    }
}

class interfacee{
    @SuppressWarnings("static-access") 
    /*
    Indicates that the named compiler warnings should be suppressed in the annotated element 
    (and in all program elements contained in the annotated element).
    */
    public static void main(String[] args) {
        Suzki suzki=new Suzki();
        Creta creta=new Creta();
        Audi audi=new Audi();
        Bmw bmw=new Bmw();

        suzki.carcost();
        creta.carcost();
        audi.carcost();
        bmw.carcost();
        creta.carcolor();

      //  Swift swift=new Swift();
      System.out.println(car.color);
      System.out.println(audi.color);
  
    }
}