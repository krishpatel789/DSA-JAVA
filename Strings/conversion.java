package Strings;

public class conversion
{
    public static void main(String[] args) {
        //converting only possible for there respective datatype only,If you try to convert characters to string 
        //at runtime it shows NumberFormatException
        // String s1=new String("123"); 
        // System.out.println(Integer.parseInt(s1));
        // String s=new String("dfasa"); 
        // System.out.println(Integer.parseInt(s));
        // String s2=new String("123"); 
        // System.out.println(Integer.parseInt(s2));

        StringBuilder sb=new StringBuilder("hk ");
        StringBuilder name=new StringBuilder("Hari");
        System.out.println(sb.toString() + name.toString());

        // StringBuilder section=new StringBuilder();
        // section.setLength(10);
        // section.append("Beta is my class");
        // System.out.println(section);
        // section.replace(0,4,"zeta");
        // System.out.println(section);
        // System.out.println(section.length());
        // System.out.println(section.toString().indexOf("class"));
        // section.insert(16," 2103");
        // System.out.println(section);
        // System.out.println(section.delete(0,5));
        // System.out.println(section.reverse());
        

        // insert()
        // append()
        // replace(  , , )
        // delete()
        // setLength()
        // StringBuilder naa=new StringBuilder(20);
        // naa.append("Hey hello");
        // System.out.println(naa);

        StringBuilder nam=new StringBuilder(2);
        nam.append("nammmmmmmmm");
        
        System.out.println(nam);




        

        
        
    }
}