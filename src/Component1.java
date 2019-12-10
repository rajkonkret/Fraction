
import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Component1 implements PropertyChangeListener {
    private int numerous;
    private int denumerator;
    private JTextField numerous1;
    private JTextField denumerator1;
    private Fraction fraction;

    Component1(JPanel panel, int x) {
        this.numerous = 1;
        this.denumerator = 1;
        JTextField numerous11 = new JTextField("licznik");
        JTextField denumerator = new JTextField("mianownik");
        this.numerous1 = numerous11;
        this.denumerator1 = denumerator;
        numerous11.setHorizontalAlignment(0);
        denumerator.setHorizontalAlignment(0);
        JLabel labelOfMinus = new JLabel("------------------------");

        numerous11.setText(String.valueOf(this.numerous));
        denumerator.setText(String.valueOf(this.denumerator));

        this.fraction = new Fraction(this.numerous, this.denumerator);

        numerous11.setBounds(x, 10, 100, 25);
        this.numerous1.addPropertyChangeListener(this);
        //numerous11.addPropertyChangeListener(this);
        panel.add(numerous11);
        labelOfMinus.setBounds(x, 25, 100, 25);
        panel.add(labelOfMinus);
        denumerator.setBounds(x, 45, 100, 25);
        panel.add(denumerator);
    }

    int getNumerous() {
        return numerous;
    }

    int getDenumerator() {
        return denumerator;
    }

    Fraction getFraction() {
        return new Fraction(Integer.parseInt(numerous1.getText()), Integer.parseInt(denumerator1.getText()));
    }

    void setFraction(Fraction fraction) {
        this.denumerator = fraction.getDenominator();
        this.numerous = fraction.getNumerator();
        this.numerous1.setText(String.valueOf(this.numerous));
        this.denumerator1.setText(String.valueOf(this.denumerator));

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    }
}



