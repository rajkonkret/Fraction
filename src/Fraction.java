public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction add(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (second.denominator == first.denominator) {
            numerator = first.numerator + second.numerator;
            denominator = first.denominator;
        }
        Fraction add = new Fraction(numerator, denominator);
        return add;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}

