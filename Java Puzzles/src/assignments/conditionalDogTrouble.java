package assignments;

public class conditionalDogTrouble {
    public static void main(String[] args) {
        System.out.println("\n\tDog Trouble\n");

        System.out.println(dogTrouble(true, 6)); // true
        System.out.println(dogTrouble(true, 7)); // false
        System.out.println(dogTrouble(false, 6)); // false
        
    }

    public static boolean dogTrouble(boolean barking, int hour)
    {
        if((hour < 7 || hour > 20) && barking == true)
            return true;

        return false;
    }
}
