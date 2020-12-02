package BasicsOfProgramming.practice.conditionals;

public class ConditionalsProgramFlow {
    public static void main(String[] args) {
        System.out.println("\n\tConditionals and Program Flow\n");

        boolean hungry = true;

        if (getValue()) {
            System.out.println("pigout!");
        } else if (hungry == false) {
            System.out.println("i'm already full!");
        } else {
            System.out.println("I'm sleeping I don't are about hunger");
        }
        System.out.println();
    }

    public static boolean getValue() {
        return (1 > 3) && ((5 > 3) || (7 < 1)); // current condition will skip to the last if-else conditional
    }
}
