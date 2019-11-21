public class Calculator {
    public Calculator() {
    }

    public Fraction add(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (second.getDenominator() == first.getDenominator()) {
            numerator = first.getNumerator() + second.getNumerator();
            denominator = first.getDenominator();
        }
        Fraction add = new Fraction(numerator, denominator);
        return add;
    }

    public Fraction mul(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (first.getDenominator() != 0 && second.getDenominator() != 0) {
            numerator = first.getNumerator() * second.getNumerator();
            denominator = first.getDenominator() * second.getDenominator();
        }
        Fraction add = new Fraction(numerator, denominator);
        return add;
    }
}
