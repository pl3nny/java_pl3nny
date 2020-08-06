package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void set_firstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double get_firstNumber() {
        return firstNumber;
    }

    public void set_secondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double get_secondNumber() {
        return secondNumber;
    }

    public double get_addition_result() {
        return firstNumber + secondNumber;
    }

    public double get_subtraction_result() {
        return firstNumber - secondNumber;
    }

    public double get_multiplication_result() {
        return firstNumber * secondNumber;
    }

    public double get_division_result() {
        return firstNumber / secondNumber;
    }

}