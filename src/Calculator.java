public class Calculator {

    public Calculator() {
    }

    public Fraction add(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (second.getDenominator() == first.getDenominator()) {
            numerator = first.getNumerator() + second.getNumerator();
            denominator = first.getDenominator();
        } else {
            denominator = first.getDenominator() * second.getDenominator();
            numerator = denominator / first.getDenominator() * first.getNumerator() + denominator / second.getDenominator() * second.getNumerator();
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
        } else {
            denominator = first.getDenominator() * second.getDenominator();
            numerator = denominator / first.getDenominator() * first.getNumerator() - denominator / second.getDenominator() * second.getNumerator();
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
        return div;
    }

    public int nwd(int firstN, int secondN) {

        while (firstN != secondN) {
            if (firstN > secondN) {
                firstN -= secondN;
                //System.out.println(firstN);
            } else {
                secondN -= firstN;
                //System.out.println(secondN);
            }
        }
        System.out.println("wynosi: " + firstN);
        return firstN;
    }
}
