package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        result = result + 1;
        System.out.println("Result is now "  + result);

        result++;
        System.out.println("Result is now "  + result);

        result --;
        System.out.println("Result is now "  + result);

        result += 2;
        System.out.println("Result is now "  + result);

        result *= 10;
        System.out.println("Result is now "  + result);

        result -= 10;
        System.out.println("Result is now "  + result);

        result /= 10;
        System.out.println("Result is now "  + result);

        boolean isAlien = false;
        if(isAlien == true)
        {
            System.out.println("it is not an alien");
        }

        int topScore = 80;

        if(topScore < 100)
        {
            System.out.println("you got the high score!");
        }

        // and operator

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100)
        {
            System.out.println("Greater than second top score and less then 100");
        }

        // or operator

        if((topScore > 90) ||(secondTopScore <= 90))
        {
            System.out.println("one of these tests is true");
        }

        // challege

        int newValue = 50;
        if(newValue == 50)
        {
            System.out.println("this is true");
        }

        boolean isCar = false;

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        {
            System.out.println("wasCar is true");
        }

        // 1. Create a double variable with the value of 20
        // 2. Create a second variable with a type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the reaminder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //      if the remaining total (#4) is equal to 20 or less.

        System.out.println("\n\tChallenge\n");
        double val1 = 20;
        double val2 = 80;

        double total = (val1 + val2) * 25;

        System.out.println(val1 + " + " + val2 + " = " + (val1 + val2) + " * 25" + " = " + total);

        double remainder = total % 40;

        if(remainder <= 20)
        {
            System.out.println("Total was over the limit");
            System.out.println(total + " % " + 40 + " = " + remainder);
        }
    }
}
