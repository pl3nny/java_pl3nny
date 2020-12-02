package assignments;

public class PrintingCategories {
    public static void main(String[] args) {
        String str = "We have a large inventory of things in our warehouse falling in "
                + "the category:apperal and the slightly "
                + "more in demand category:makeup along with the category:funiture and ...";

        printCategories(str);

    }

    /*
     * extract all categories from the strin argument
     * 
     * @param str
     */

    public static void printCategories(String str) {
        String keyString = "category:";
        int indexPosition = 0;

        System.out.println();

        indexPosition = str.indexOf(keyString);

        while (true) {

            System.out.println(str.substring(indexPosition + keyString.length(), str.indexOf(" ", indexPosition)));

            indexPosition = str.indexOf(keyString, indexPosition + 1);

            if(indexPosition ==  -1)
                break;
        }

        System.out.println();
    }
}
