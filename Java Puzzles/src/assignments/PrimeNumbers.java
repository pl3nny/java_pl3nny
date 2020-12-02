package assignments;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // for (int i : arr) {
        //     if (i % 10 == 0)
        //         System.out.println();

        //     System.out.print(i + " ");
        // }

        int count = 0;
        System.out.println("\nchecking if prime numbers in array...");
        for(int i : arr){
            if(isPrime(i)){
                System.out.print("isPrime: " + i + " ");
                count++;
                if(count == 10)
                    System.out.println();
            }
        }
    }

    public static boolean isPrime(int num) {

        if(num == 0 || num == 1)
            return false;

        for(int i = 2; i < num; i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }
}
