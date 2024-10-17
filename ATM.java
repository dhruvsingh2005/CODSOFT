

import java.util.Scanner;
class ATM
{
    float balance=1000000;
    int PIN=2005;
    public void checkpin() {
        System.out.println("Enter Your Pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin;
        enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else System.out.println("Enter a valid pin");
    }
    void menu()
    {
        System.out.println("Enter your choice");
        System.out.println("1.A/C Balance");
        System.out.println("2. Withdrawal Money ");
        System.out.println("3. Deposit money");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1)
        {
            checkbalance();
        }
        else if(opt==2)
        {
            withdrawalmoney();
        }
        else if(opt==3)
        {
            depositmoney();
        }
        else if(opt==4)
        {
            return;
        }
        else
        {
            System.out.println("Enter a valid choice");
        }}
    public void checkbalance()
    {
        System.out.println("Balance:"+balance);
        menu();
    }
    public void withdrawalmoney()
    {
        System.out.println("Enter amount to be withdrawal");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance=balance-amount;
            System.out.println("Amount withdrawal successfully");
            System.out.println("Your current balance:"+balance);
        }menu();
    }
    void depositmoney()
    {
        System.out.println("Enter amount to be deposit");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Amount deposit successfully");
        menu();
    }

    public   static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkpin();
    }
}



