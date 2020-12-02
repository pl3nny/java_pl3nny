package BasicsOfProgramming.practice.recursion;

public class RecursionPractice {
    public static void main(String[] args) {
        System.out.println("\n\tRecursion Practice\n");

        // printHello(5);
        // printNumbers(4);

        // recursion exercise
        System.out.println(allDollars("hello"));
        System.out.println(allDollars("james"));

        // String str = "hello";
        // String newStr = "";
        // for(int i = 0; i < str.length(); i++){
        // newStr += str.charAt(i) + "$";
        // }

        // System.out.println(str);
        // System.out.println(newStr);
    }

    public static void printHello(int count) {
        if (count > 0) {
            System.out.println("hello there");
            printHello(count - 1);
        }
    }

    public static int printNumbers(int num) {
        if (num == 0)
            return num;
        else {
            System.out.println(num);
            return printNumbers(num - 1);
        }
    }

    // exercise
    // create method that seperates that splits every character with '$'
    // zebra == z$e$b$r$a$

    public static String allDollars(String str) {

        if (str.length() == 1)
            return str;
        return str.charAt(0) + "$" + allDollars(str.substring(1));
    }
}
