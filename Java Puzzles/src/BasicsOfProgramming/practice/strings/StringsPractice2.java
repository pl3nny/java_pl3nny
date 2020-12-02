package BasicsOfProgramming.practice.strings;

public class StringsPractice2 {
    public static void main(String[] args) {
        System.out.println();
        String str = "Hello there yogi there";

        System.out.println("searching from 0 left to right");
        int indexPosition = str.indexOf("there");
        System.out.println(indexPosition);

        System.out.println();
        System.out.println("searching after the first \"there\" after position " + indexPosition + 1);
        indexPosition = str.indexOf("there", indexPosition + 1);
        System.out.println(indexPosition);

        System.out.println("\nusing lastIndexOf");

        System.out.println("searching from right to left");
        indexPosition = str.lastIndexOf("there");
        System.out.println(indexPosition);
    }
}
