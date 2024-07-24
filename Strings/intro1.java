package Strings;

//CONTAINS BASIC METHODS OF A STRING AND STRING BUILDER


public class intro1
{
    public static void main(String args[])
    {
        String num="123";
        Class<?> type=num.getClass();
        System.out.println(num.getClass());
        Integer intobj=Integer.valueOf(num);
        System.out.println(intobj);
        Class<?> typee=intobj.getClass();
        System.out.println(typee);

        //same string
        int numm=120;
        int numb=Integer.parseUnsignedInt(numm);

        Integer wrappedInt=20;

        int unboxedInt = wrappedInt.intValue();








        String name="Hari Krishna";
        String name2=new String("Hari Krishna");
        System.out.println("same adress location: "+(name==name2)+"\n"+"equal to each other :"+(name.equals(name2)));
        String s="     CONCENTRATE ON YOURSELF      ";
        String s1=s.toLowerCase();
        System.out.println(s1);
        System.out.println(s.charAt(0));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.concat(" HARD : "));
        System.out.println(s.trim());//removes trailing spaces

        String companyname="Microsoft";
        System.out.println(companyname.trim());
        System.out.println(companyname.length());
        System.out.println(companyname.substring(0,5));

        //modifying
        System.out.println(companyname.concat(" is a good company"));
        System.out.println(companyname.replace("Microsoft","Google"));
        String newcompany=companyname.replace("Microsoft","Google");
        System.out.println(newcompany);
        System.out.println(companyname.toLowerCase());
        System.out.println(companyname.toUpperCase());

        //boolean checking
        System.out.println(companyname.startsWith("Micro"));
        System.out.println(companyname.endsWith("soft"));
        System.out.println(companyname.indexOf(0));//first occurence
        System.out.println(companyname.contains("cro"));
        // System.out.println(String.valueOf());


        // == returns true if memory address are same or not 
        // equals compares string contents

        

    }


    
}
