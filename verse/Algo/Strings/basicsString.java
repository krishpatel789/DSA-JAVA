public class basicsString{

     public static void main(String []args){
          
     char ch='a';
     System.out.print(ch);

     char[] chars={'a','b','c','d'};
     String s=new String(chars);
     //String is an object that represents a sequence of characters in java
     System.out.println(s);
     System.out.println(chars);
     
     String name="Hari";
     String name2=name.concat("Krishna");
     System.out.println(name2);
     
     System.out.println(name==name2);
     int a=10;
     int b=20;
     System.out.println(a +" "+b);

     //formatter(from c language)
     System.out.printf("%d%d",a,b);
    String s1="HARI";
    String s2="hari";
    //returns boolean values
    System.out.println(s1.equals(s2));
    //Ignores the CASE SENSITIVE NATURE(UPPER/LOWERCASE)
    System.out.println(s1.equalsIgnoreCase(s2));
     
     //EQUAL OPERATOR COMPARES REFERENCES SAME/NOT
     System.out.println(s1==s2);
     //compareTo method compares two Strings lexicographically
     //positive (greater ),negative(less than),equal(0)
     System.out.println(s1.compareTo(s2));
     //Stirng.format()  method in java
     String m="rama";
     String n="krishna";
     String m1=String.format("%s%s",m,n);
     System.out.println(m1);

     

     
     }
}