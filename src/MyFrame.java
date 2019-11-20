import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("Fraction by RAJ ver 0.0.0.0.0.0.0.0.0000.00000.000001");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 620, 460);
        JPanel panel = new JPanel();
        JButton bResult = new JButton();
        panel.setLayout(null);
        panel.setBounds(10, 10, 125, 100);
        add(panel);
        Component component = new Component(panel, 10);
        Component component1 = new Component(panel, 150);
        Component result = new Component(panel, 350);
        setVisible(true);


    }


}
