import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

public class MyFrame extends JFrame implements ActionListener {
    private Component1 component;
    private Component1 component1;
    private Component1 result;

    public MyFrame() {
        super("Fraction by RAJ ver 0.0.0.0.0.0.0.0.0000.00000.000001");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(40, 40, 620, 460);
        JPanel panel = new JPanel();
        JButton bResult = new JButton("=");
        JButton bOperation = new JButton();
        panel.setLayout(null);
        panel.setBounds(10, 10, 125, 100);
        add(panel);
        Component1 component = new Component1(panel, 10);
        this.component = component;
        Component1 component1 = new Component1(panel, 170);
        this.component1 = component1;
        Component1 result = new Component1(panel, 350);
        this.result = result;
        bOperation.setBounds(120, 23, 45, 25);
        bOperation.setText("+");
        panel.add(bOperation);
        bResult.setBounds(285, 25, 50, 25);
        bResult.setText(" = ");
        bResult.setName("result");
        bResult.setActionCommand("result");
        bResult.addActionListener(this);
        panel.add(bResult);

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


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        Calculator calculator = new Calculator();
        if ("result".equals(e.getActionCommand())) {
            Fraction fractionresult = calculator.add(component.getFraction(), component1.getFraction());
            result.setFraction(fractionresult);
        }
    }
}
