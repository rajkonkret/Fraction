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

    public Fraction sub(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (second.getDenominator() == first.getDenominator()) {
            numerator = first.getNumerator() - second.getNumerator();
            denominator = first.getDenominator();
        }
        Fraction sub = new Fraction(numerator, denominator);
        return sub;
    }

    public Fraction mul(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (first.getDenominator() != 0 && second.getDenominator() != 0) {
            numerator = first.getNumerator() * second.getNumerator();
            denominator = first.getDenominator() * second.getDenominator();
        }
        Fraction mul = new Fraction(numerator, denominator);
        return mul;
    }

    public Fraction div(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (first.getDenominator() != 0 && second.getDenominator() != 0) {
            numerator = first.getNumerator() * second.getDenominator();
            denominator = first.getDenominator() * second.getNumerator();
        }
        Fraction div = new Fraction(numerator, denominator);
        Nwd nwd = new Nwd();
        nwd.nwd(div.getNumerator(), div.getDenominator());
        return div;
    }
}
