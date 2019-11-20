import javax.swing.*;

public class MyFrame extends JFrame {
    Component1 component;
    Component1 component1;
    Component1 result;

    public MyFrame() {
        super("Fraction by RAJ ver 0.0.0.0.0.0.0.0.0000.00000.000001");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(40, 40, 620, 460);
        JPanel panel = new JPanel();
        JButton bResult = new JButton();
        panel.setLayout(null);
        panel.setBounds(10, 10, 125, 100);
        add(panel);
        Component1 component = new Component1(panel, 10);
        this.component = component;
        Component1 component1 = new Component1(panel, 150);
        this.component1 = component1;
        Component1 result = new Component1(panel, 350);
        this.result = result;
        setVisible(true);


    }

    public void setComponent(Fraction fraction) {
        component.setFraction(fraction);
    }

    public void setComponent1(Fraction fraction) {
        component1.setFraction(fraction);
    }

    public void setResult(Fraction fraction) {
        result.setFraction(fraction);
    }


}
