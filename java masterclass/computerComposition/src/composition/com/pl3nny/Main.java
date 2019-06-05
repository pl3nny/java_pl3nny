package composition.com.pl3nny;

public class Main
{
    public static void main(String[] args)
    {
	// write your code here
        System.out.println("pl3nny's Gaming PC");

        Monitor monitor = new Monitor("27in", "Acer", 27, new Resolution(1920, 1080));
        Dimensions dimensions = new Dimensions (9, 18, 6);
        Case compCase = new Case("R6","Fractal","EVGA",dimensions);
        Motherboard motherboard = new Motherboard("Gaming 5","MSI",8,4,"2.5");

        PC pc = new PC(compCase, monitor, motherboard);

        pc.powerUp();
    }
}
