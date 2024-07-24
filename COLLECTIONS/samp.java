package COLLECTIONS;
//post increment,decrement .PreIncrement,Decrement

public class samp {
    public static void main(String[] args) {
        
        // int a=5;
        // a+=10;
        // System.out.println(a);

        // int c=1;
        // int y=++c; //2
        // System.out.println(y);//2
        // System.out.println(c);//2
        // y=c++;
        // System.out.println(y);//2
        // System.out.println(c);//3

        // y=c--;
        // System.out.println(y);//3
        // System.out.println(c);//2

        // y=--c;
        // System.out.println(y);//1
        // System.out.println(c);//1

        // y+=1;//2
        // System.out.println(y);

        // y-=1;
        // System.out.println(y);//1


        // int a=5;
        // int b=3;
        // int result;
        
        // result=++a/-b;
        // System.out.println(result);

        int a = 5;
        int b = 3;
        int c = 10;
        int result;

        // Parentheses have the highest precedence
        result = (a + b) * c; // (5 + 3) * 10 = 80
        System.out.println("(a + b) * c = " + result);

        // Postfix operators (++ and --) have second highest precedence
        result = a++ * b; // 5 * 3 = 15, then a becomes 6
        System.out.println("a++ * b = " + result + ", a = " + a);

        // Prefix operators (++ and --), Unary + and -, Logical ! have third highest precedence
        result = ++a / -b; // (++6) / -3 = -2
        System.out.println("++a / -b = " + result + ", a = " + a);


    }
}
