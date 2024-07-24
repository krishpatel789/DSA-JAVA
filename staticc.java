interface numoperations{
    int add(int a,int b);
    // int subtract(int a,int b);
    // int multipy(int a,int b);

    static int multipy(int a,int b)
    {
        return a*b;
    }

    
}

class sum implements numoperations{
    public  int add(int a,int b)
    {
        return a+b;
    }
}


class staticc
{
    public static void main(String[] args) {
       sum obj1=new sum();
       System.out.println(obj1.add(5,10));

    }
}
