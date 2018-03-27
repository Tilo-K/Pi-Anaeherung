public class Main
{
    public static void main(String[] args)
    {
        Fenster fenster = new Fenster(800,800);
        Ergebniss erg = new Ergebniss();


        fenster.run();

        while(true)
        {
            fenster.repaint();
            erg.change(fenster.calc());
        }
    }
}
