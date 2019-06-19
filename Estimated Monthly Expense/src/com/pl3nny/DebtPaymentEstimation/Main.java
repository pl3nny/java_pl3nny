package com.pl3nny.DebtPaymentEstimation;
import  java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Debt Payment Estimation with APR (Annual Percent Rate)");
        System.out.println();

        double debt, apr, payment;
        int months = 0;
        System.out.print("Enter current debt amount: $");
        debt = scan.nextDouble();
        System.out.print("Enter Annual Percent Rate (APR): ");
        apr = scan.nextDouble();
        System.out.println();

        Debt myDebt = new Debt((debt), apr);

        System.out.println("Debt: $" + myDebt.getDebtAmount() + " APR: " + (myDebt.getApr()*100) + "%");
        System.out.println();
        System.out.println("Interest Charge for $" + myDebt.getDebtAmount() + " is $" + myDebt.getInterest());
        System.out.print("Enter estimated monthly payments: $");
        payment = scan.nextDouble();


        while(myDebt.getDebtAmount() > 0)
        {

            if(months == 1)
            {
                System.out.println("Next Months current debt: $" + myDebt.getDebtAmount());
                System.out.println("Next Months interest charge: $" + myDebt.getInterest());
                System.out.println();
            }

            if(months == 5)
            {
                System.out.println();
                System.out.println("Debt " + months + " months from now $" + myDebt.getDebtAmount());
                System.out.println("Interest charge for that debt $" + myDebt.getInterest());
                System.out.println();
            }

            if(months == 11)
            {
                System.out.println();
                System.out.println("Debt " + months + " months from now $" + myDebt.getDebtAmount());
                System.out.println("Interest charge for that debt $" + myDebt.getInterest());
                System.out.println();
            }

            myDebt.setPayment(payment);
            myDebt.updateDebtWithInterest();
            months++;
        }

        System.out.println("Estimating " + months + " months to pay of your debt");
    }
}
