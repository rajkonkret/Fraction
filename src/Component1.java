
import javax.swing.*;

class Component1 {
    private int numerous;
    private int denumerator;
    private JTextField numerous1;
    private JTextField denumerator1;

    Component1(JPanel panel, int x) {
        this.numerous = 1;
        this.denumerator = 1;
        JTextField numerous11 = new JTextField("licznik");
        JTextField denumerator = new JTextField("mianownik");
        this.numerous1 = numerous11;
        this.denumerator1 = denumerator;

        JLabel labelOfMinus = new JLabel("------------------------");

        numerous11.setHorizontalAlignment(0);
        numerous11.setText(String.valueOf(this.numerous));
        numerous11.setBounds(x, 10, 100, 25);
        panel.add(numerous11);

        denumerator.setHorizontalAlignment(0);
        labelOfMinus.setBounds(x, 25, 100, 25);
        panel.add(labelOfMinus);

        denumerator.setText(String.valueOf(this.denumerator));
        denumerator.setBounds(x, 45, 100, 25);
        panel.add(denumerator);
    }

    Fraction getFraction() {
        return new Fraction(Integer.parseInt(numerous1.getText()),
                Integer.parseInt(denumerator1.getText()));
    }

    void setFraction(Fraction fraction) {
        this.denumerator = fraction.getDenominator();
        this.numerous = fraction.getNumerator();
        this.numerous1.setText(String.valueOf(this.numerous));
        this.denumerator1.setText(String.valueOf(this.denumerator));

    }
}



