package BasicsOfProgramming.practice.strings;

public class StringsPractice {
    public static void main(String[] args) {
        System.out.println("\n\tStrings Practice\n");

        String str = "ABCDEFG";
        String extractedString = str.substring(2);

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(extractedString);
        System.out.println(extractedString.length());

        System.out.println();

        // substring with two parameters

        extractedString = str.substring(2, 5);
        System.out.println(extractedString);

        
    }
}
