package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Author: pl3nny\n");

        SimpleCalculator calc = new SimpleCalculator();

        calc.set_firstNumber(5.0);
        calc.set_secondNumber(4);

        System.out.println("add = " + +calc.get_addition_result());
        System.out.println("subtraction = " + calc.get_subtraction_result());

    }
}