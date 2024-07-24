import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class Patterns 
    {
        public void pattern1(int num)
        {
            for(int i=0;i<num;i++)
            {
                for(int j=0;j<num;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public void pattern2(int num)
        {
            for(int i=0;i<num;i++)
            {

                for(int j=0;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
             }
        }

        public void pattern3(int num){
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j +" ");
                }
                System.out.println();
            }
        }

        public void pattern4(int num){
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(i +" ");
                }
                System.out.println();
            }
        }

        public void pattern5(int num){
            for(int i=0;i<num;i++)
            {
                for(int j=i;j<num;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public void pattern6(int num){
            for(int i=1;i<=num;i++)
            {
                int count=1;
                for(int j=i;j<=num;j++)
                {
                    
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
        }

        public void pattern7(int num){
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int stars=1;stars<=i*2-1;stars++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        }

        public void pattern8(int num){
            int counter=num;
            for(int i=0;i<num;i++)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print(" ");
                }
           
                for(int k=1;k<=counter*2-1;k++)
                {
                    System.out.print("*");
                }
                counter=counter-1;
                System.out.println();
            }
        }

        public void pattern9(int num)
        {
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=num-i;j++)
                {
                    System.out.print(" ");
                }
                for(int stars=1;stars<=i*2-1;stars++)
                {
                    System.out.print("*");
    
                }
                System.out.println();
            }

            int counter=num;
            for(int i=0;i<num;i++)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print(" ");
                }
           
                for(int k=1;k<=counter*2-1;k++)
                {
                    System.out.print("*");
                }
                counter=counter-1;
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            Patterns obj=new Patterns();

            System.out.println("Pattern 1");
            obj.pattern1(number);

            System.out.println("Pattern 2");
            obj.pattern2(number);

            System.out.println("Pattern 3");
            obj.pattern3(number);

            System.out.println("Pattern 4");
            obj.pattern4(number);

            System.out.println("Pattern 5");
            obj.pattern5(number);

            System.out.println("Pattern6");
            obj.pattern6(number);

            System.out.println("Pattern 7");
            obj.pattern7(number);

            System.out.println("Pattern 8");
            obj.pattern8(number);

            System.out.println("Pattern 9");
            obj.pattern9(number);



            
        }
    }
