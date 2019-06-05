package composition.com.pl3nny;

public class PC
{
    private Case compCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case compCase, Monitor monitor, Motherboard motherboard)
    {
        this.compCase = compCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp()
    {
        compCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        //start up logo
        monitor.drawPixelAt(1200, 50, "yellow");
        System.out.println("start up logo");
    }
}
