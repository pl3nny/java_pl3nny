package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //acount number, balance, customer name, customer email, customer phone number
        Account johnsAccount = new Account("987654321", 0.00,
                "John doe", "johnDoe@example.com"
                , "123456789");
        VipCustomer aliceVip = new VipCustomer(15000, "Alice", "alice@email.com");

        System.out.println("\tVip Customer\n");
        System.out.println();
        System.out.println("Name: " + aliceVip.getCustomerName());
        System.out.println("Email: " + aliceVip.getCustomerEmail());
        System.out.printf("Credit LImit: " + "%.2f", aliceVip.getCreditLimit());
        System.out.println("\n");

        boolean cont = true;
        int selection;
        double amount;
        while(cont)
        {
            System.out.println("1.\tWithdraw\n2.\tDeposit\n3.\tBalance\n4.\tExit");
            System.out.print("--> ");
            while(!scan.hasNextInt())
            {
                System.out.println("Enter a valid option...");
                System.out.println();
                System.out.println("1.\tWithdraw\n2.\tDeposit\n3.\tBalance\n4.\tExit");
                System.out.print("--> ");
                scan.nextLine();
            }
            selection = scan.nextInt();
            switch(selection)
            {
                case 1:
                    System.out.print("Enter amouut to withdraw: ");
                    amount = scan.nextDouble();
                    johnsAccount.withdraw(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = scan.nextDouble();
                    johnsAccount.deposit(amount);
                    break;
                case 3:
                    System.out.println("Balance: " + johnsAccount.getBalance());
                    break;
                case 4:
                    cont = false;
                    System.out.println();
                    System.out.println("Thank you for baking with us " + johnsAccount.getCustomerName());
                    System.out.println("Your Reciept has been emailed to " + johnsAccount.getCustomerEmail());
                    System.out.println();
                    System.out.println("Name: " + johnsAccount.getCustomerName());
                    System.out.println("Account: " + johnsAccount.getAccountNumber());
                    System.out.println("Phone number: " + johnsAccount.getPhoneNumber());
                    System.out.println("Balance: " + johnsAccount.getBalance());
                    break;
                default:
                    System.out.println("Enter a valid option...");
                    break;
            }
            scan.nextLine();
        }

    }
}
