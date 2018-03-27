import javax.swing.*;

public class Ergebniss extends JFrame {
    private JLabel label;
    public Ergebniss(){
        label = new JLabel("0.0");
        this.setSize(200, 100);
        label.setBounds(10,10, 180, 80);
        this.add(label);
        this.setVisible(true);
    }

    public void change(double pi)
    {
        label.setText(Double.toString(pi));
    }
}
