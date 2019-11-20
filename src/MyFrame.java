import javax.swing.*;

public class MyFrame extends JFrame {
    Component1 component6;
    public MyFrame() {
        super("Fraction by RAJ ver 0.0.0.0.0.0.0.0.0000.00000.000001");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 620, 460);
        JPanel panel = new JPanel();
        JButton bResult = new JButton();
        panel.setLayout(null);
        panel.setBounds(10, 10, 125, 100);
        add(panel);
        Component1 component = new Component1(panel, 10);
        this.component6 = component;
        Component1 component1 = new Component1(panel, 150);
        Component1 result = new Component1(panel, 350);
        setVisible(true);
//        Fraction fraction = new Fraction(2, 2);
//        component.setFraction(fraction);
        //panel.repaint();

    }

    public void setComponent6(Fraction fraction) {
        component6.setFraction(fraction);
    }



}
