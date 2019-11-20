import org.omg.CORBA.portable.IDLEntity;

import javax.swing.*;

public class Component1 {
    private int numerous;
    private int denumerator;
    private JTextField numerous1;
    private JTextField denumerator1;

    public Component1(JPanel panel, int x) {
        this.numerous = 1;
        this.denumerator = 1;
        JTextField numerous1 = new JTextField("licznik");
        JTextField denumerator = new JTextField("mianownik");
        this.numerous1 = numerous1;
        this.denumerator1 = denumerator;
        JLabel labelOfMinus = new JLabel("------------------------");
        numerous1.setText(String.valueOf(this.numerous));
        denumerator.setText(String.valueOf(this.denumerator));
        numerous1.setBounds(x, 10, 100, 25);
        panel.add(numerous1);
        labelOfMinus.setBounds(x, 25, 100, 25);
        panel.add(labelOfMinus);
        denumerator.setBounds(x, 45, 100, 25);
        panel.add(denumerator);
    }

    public int getNumerous() {
        return numerous;
    }

    public int getDenumerator() {
        return denumerator;
    }

    public void setFraction(Fraction fraction) {
        this.denumerator = fraction.getDenominator();
        this.numerous = fraction.getNumerator();
        this.numerous1.setText(String.valueOf(this.numerous));
        this.denumerator1.setText(String.valueOf(this.denumerator));
    }
}



