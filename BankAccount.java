import java.util.Scanner;

public class BankAccount {
    private String AccountNo;
    private String AccountName;
    private double AccountBalance;

   public BankAccount(String AccNo, String AccName, double AccBal)
    {
        AccountNo=AccNo;
        AccountName=AccName;
        AccountBalance=AccBal;
    }
    public void deposit()
    {
        System.out.println("Enter the amount you want to deposit");
        Scanner s=new Scanner(System.in);
        float bal=s.nextFloat();
        AccountBalance=AccountBalance+bal;
        System.out.println("Your amount has been deposited successfully!");
        System.out.println("Your updated balance is: "+AccountBalance);
    }
    public void withdrawal()
    {
        System.out.println("Enter the amount you want to withdraw");
        Scanner s=new Scanner(System.in);
        float bal=s.nextFloat();
        if(bal<AccountBalance)
        {
            AccountBalance=AccountBalance-bal;
            System.out.println("Your amount has been withdrawn successfully!");
        }
        else
            System.out.println("Invalid Amount!");
    }
    public void display()
    {
        System.out.println("Account Name: "+AccountName);
        System.out.println("Account Number: "+AccountNo);
        System.out.println("Account Balance: "+AccountBalance);
    }
    public static void main(String[] args)
    {
        BankAccount b1=new BankAccount("123456","Zunaira",15478.645);
        Scanner s=new Scanner(System.in);
        int c=0;
       while(true)
       {
           System.out.println("Enter 1 to deposit amount\nEnter 2 to withdraw amount\nEnter 3 to display account information\nEnter 4 to exit");

           c=s.nextInt();
           if(c==1)
               b1.deposit();
           if(c==2)
               b1.withdrawal();
           if(c==3)
               b1.display();
           if(c==4)
               break;
       }
       }

}
