package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    int startingNum = 4;
	    int endingNum = 20;
	    int evenNumbersFound = 0;

	    while(startingNum <= endingNum)
        {
            if(!isEvenNumber(startingNum))
            {
                startingNum++;
                continue;
            }
            System.out.println("even number " + startingNum);
            startingNum++;
            evenNumbersFound++;

            if(evenNumbersFound > 5)
            {
                break;
            }
        }
    }

    public static boolean isEvenNumber(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        return false;
    }
}
