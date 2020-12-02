package BasicsOfProgramming.practice.arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        System.out.println("\n\tArrays Practice\n");

        int[] values;
        values = new int[100];

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        for (int i : values) {
            System.out.println(i);
        }

        // exercise
        // create a search method that takes in an array and a given value that will
        // return the index of the target inside the array

        values[69] = 6969;

        System.out.println("\nSearch");
        System.out.println(search(values, 6969));

        System.out.println("\nSearch");
        System.out.println(search(values, 10));

    }

    public static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
