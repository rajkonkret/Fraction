import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private Component1 component;
    private Component1 component1;
    private Component1 result;
    private Component1 resultShort;
    private String operation;
    private JButton bOperation;

    MyFrame() {
        super("Fraction by RAJ ver 0.0.0.0.0.0.0.0.0000.00000.000001");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 620, 240);
        int bOperationsOffset = 30;

        JPanel panel = new JPanel();
        JButton bResult = new JButton("=");
        JButton bOperation = new JButton();
        JButton bPlus = new JButton();
        JButton bMinus = new JButton();
        JButton bDiv = new JButton();
        JButton bMuls = new JButton();

        panel.setLayout(null);
        panel.setBounds(10, 10, 125, 100);
        add(panel);

        this.component = new Component1(panel, 10);

        this.component1 = new Component1(panel, 175);

        this.result = new Component1(panel, 350);

        this.resultShort = new Component1(panel, 460);

        bOperation.setBounds(120, 25, 45, 25);
        bOperation.setText("-");
        this.operation = bOperation.getText();
        this.bOperation = bOperation;
        panel.add(bOperation);

        bResult.setBounds(285, 25, 50, 25);
        bResult.setText(" = ");
        bResult.setName("result");
        bResult.setActionCommand("result");
        bResult.addActionListener(this);
        panel.add(bResult);

        bPlus.setBounds(105 + bOperationsOffset, 75, 45, 25);
        bPlus.setText("+");
//        bPlus.setActionCommand("+");
//        bPlus.addActionListener(this);
        bPlus.addActionListener(action -> {
                operation = "+";
                bOperation.setText("+");
        });
        panel.add(bPlus);

        bMinus.setBounds(150 + bOperationsOffset, 75, 45, 25);
        bMinus.setText("-");
        bMinus.setActionCommand("-");
        bMinus.addActionListener(this);
        panel.add(bMinus);

        bDiv.setBounds(195 + bOperationsOffset, 75, 45, 25);
        bDiv.setText(":");
        bDiv.setActionCommand(":");
        bDiv.addActionListener(this);
        panel.add(bDiv);

        bMuls.setBounds(240 + bOperationsOffset, 75, 45, 25);
        bMuls.setText("*");
        bMuls.setActionCommand("*");
        bMuls.addActionListener(this);
        panel.add(bMuls);

        setVisible(true);


    }

    void setComponent(Fraction fraction) {

        component.setFraction(fraction);
    }

    void setComponent1(Fraction fraction) {

        component1.setFraction(fraction);
    }

    void setResult(Fraction fraction) {

        result.setFraction(fraction);
    }

    private Fraction shorter(Fraction result) {
        Calculator calculator = new Calculator();
        int resultShorter = calculator.nwd(result.getNumerator(), result.getDenominator());
        Fraction fractionResultShort = new Fraction(result.getNumerator() / resultShorter, result.getDenominator() / resultShorter);
        return fractionResultShort;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(e.getActionCommand());
        Calculator calculator = new Calculator();

//        if ("+".equals((e.getActionCommand()))) {
//            this.operation = "+";
//            this.bOperation.setText("+");
//        }

        if ("-".equals((e.getActionCommand()))) {
            this.operation = "-";
            this.bOperation.setText("-");
        }

        if (":".equals((e.getActionCommand()))) {
            this.operation = ":";
            this.bOperation.setText(":");

        }
        if ("*".equals((e.getActionCommand()))) {
            this.operation = "*";
            this.bOperation.setText("*");
        }

        if ("result".equals(e.getActionCommand())) {
            switch (this.bOperation.getText()) {

                case "+": {
                    Fraction fractionResult = calculator.addFraction(component.getFraction(), component1.getFraction());
                    result.setFraction(fractionResult);
                    resultShort.setFraction(shorter(fractionResult));
                    break;
                }
                case "-": {
                    Fraction fractionResult = calculator.subFraction(component.getFraction(), component1.getFraction());
                    result.setFraction(fractionResult);
                    resultShort.setFraction(shorter(fractionResult));
                    break;
                }
                case "*": {
                    Fraction fractionResult = calculator.mulFraction(component.getFraction(), component1.getFraction());
                    result.setFraction(fractionResult);
                    resultShort.setFraction(shorter(fractionResult));
                    break;
                }
                case ":": {
                    Fraction fractionResult = calculator.divFraction(component.getFraction(), component1.getFraction());
                    result.setFraction(fractionResult);
                    resultShort.setFraction(shorter(fractionResult));
                    break;
                }
            }
        }
    }
}
