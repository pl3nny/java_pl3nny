package BasicsOfProgramming.practice.loops;

public class LoopsPractice {
    public static void main(String[] args) {
        System.out.println("\n\tLoops Practice\n");

        int count = 0;

        // while loop

        while (count <= 100) {
            System.out.println("name " + count);
            count++;

            if (count == 30)
                break;
        }

        // ************************************************
        // for loops

        String str = "a;lsdkfalkdsfasdlkfjasdlk;f";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println("charAt: " + str.charAt(i));
        }

        // print numbers from 0 - 100 that are even*

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        // nested loops

        for (int idx = 0; idx < 100; idx++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(idx);
            }
        }
    }
}
