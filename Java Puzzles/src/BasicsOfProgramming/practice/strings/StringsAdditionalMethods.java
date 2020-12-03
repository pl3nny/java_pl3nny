package BasicsOfProgramming.practice.strings;

public class StringsAdditionalMethods {
    public static void main(String[] args) {
        String sentence = "There is a small boat by the dock";
        String sentence2 = "There were several people at the party";

        // startsWith - method checks if string start witha particular string
        // endsWith - sane concept as above

        System.out.println(sentence.startsWith("There"));
        System.out.println(sentence2.endsWith("party"));

        // String.valueOf(datatype) - gets the type and coverts it into string
        int age = 10;

        String ageStr = String.valueOf(age);
        System.out.println("int age to string " + ageStr);
    }
}
