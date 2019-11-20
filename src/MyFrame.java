import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        super("Fraction by RAJ ver 0.0.0.0.0.0.0.0.0000.00000.000001");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);
        setLocation(50,50);
        setLayout(new FlowLayout());
        add(new JButton("First"));
        add(new JButton("sec"));
        add(new JButton("third"));
        setVisible(true);

    }

}
