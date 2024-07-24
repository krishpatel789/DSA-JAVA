import java.util.Scanner;
// Task is to generate bil to customer 
 /*
   Customer name :
   amount to be paid  :
   amount :

  */

class bill
{
    public static void main(String a[])
    {
        boolean b=true;
        while(b)
        {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Customer Name : ");
        String Customername=scn.nextLine();
      

        int bill=0;
        boolean moreitems=true;
        while (moreitems) 
        {
            System.out.println("Enter quantity/No of items");
            int quantity=scn.nextInt();
            System.out.println("Enter Price of Single Item");
            int amount=scn.nextInt();
            int Totalamount=quantity*amount;
            bill+=Totalamount;
            System.out.println("Do you want to add more items YES/NO");
            String confrm=scn.next();
            confrm=confrm.toUpperCase();
            if(confrm.equals("NO"))
            {
                moreitems=false;
            }

         }

        System.out.println("bill is"+bill);
        System.out.println("CASH FROM CUSTOMER TAKEN : ");
        int Cashgiven=scn.nextInt();
        System.out.println("------------BILL----------------");
        System.out.println("   RADHIKA SHOPPING MALL,HYD");
        System.out.println("Customer Name : "+Customername);
        System.out.println("Total Bill : " +bill);
        System.out.println("Cash from customer : "+Cashgiven);
        System.out.println("Change returned : "+ (Cashgiven - bill));
        System.out.println("Thanks for visting,Have a Good Day....!");
        System.out.println("--------------------------------");
        System.out.println("Do you need to print for Other customer :YES/NO");
        String confirmation=scn.next();
        String s=confirmation.toUpperCase();
        String s1=new String(confirmation.toUpperCase());
        confirmation=confirmation.toUpperCase();
        if(confirmation.equals("NO")){
            b=false;
            
        }
        //scn.close();  
    }
}

}