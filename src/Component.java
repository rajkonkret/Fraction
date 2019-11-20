import org.omg.CORBA.portable.IDLEntity;

import javax.swing.*;

public class Component {
    private int numerous;
    private int denumerator;

    public Component(JPanel panel, int x) {
        this.numerous = 1;
        this.denumerator = 1;
        JTextField numerous = new JTextField("licznik");
        JTextField denumerator = new JTextField("mianownik");
        JLabel labelOfMinus = new JLabel("------------------------");
        numerous.setText(String.valueOf(this.numerous));
        denumerator.setText(String.valueOf(this.denumerator));
        numerous.setBounds(x, 10, 100, 25);
        panel.add(numerous);
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
        denumerator = fraction.getDenominator();
        numerous = fraction.getNumerator();
    }
}



