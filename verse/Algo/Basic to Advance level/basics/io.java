import java.util.Scanner;
class io
{
	public static void main(String args[])
 	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		System.out.println("Enter a string ");
		sc.next();
        String name=sc.nextLine();
		System.out.println(number);
		System.out.println(name);
		sc.close();
	}
}
		