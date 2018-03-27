import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Fenster extends JFrame
{
    private int width;
    private int height;
    private Random rnd;
    private double circle = 0;
    private double total = 0;


    public Fenster(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.rnd = new Random();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.width, this.height);
        this.setLayout(null);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setTitle("Pi");

    }

    public void paint(Graphics g) {
            g.translate(width / 2, height / 2);

            int x = rnd.nextInt(width * 2) - width;
            int y = rnd.nextInt(height * 2) - height;

            total++;

            double dist = x * x + y * y;

            double rad = width;
            if (dist <= rad * rad) {
                circle++;
            }

            rad /= 2;
            if (dist <= rad * rad) {
                g.setColor(Color.green);
            } else {
                g.setColor(Color.red);
            }
            g.fillOval(x, y, 5, 5);
    }


    public void run()
    {
        this.setVisible(true);
    }

    public double calc()
    {
        if(total == 0)
                return 0;

        double pi = 4 * ( circle /  total);
        return pi;

    }

}
