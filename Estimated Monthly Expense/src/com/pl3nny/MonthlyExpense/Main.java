package com.pl3nny.MonthlyExpense;
import com.pl3nny.*;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Author: Alexander Hernandez\n");
        System.out.println("\tMonthly Expense Program\n");

        MyFinances myFinances = new MyFinances();

        myFinances.financialStatement();
    }
}
