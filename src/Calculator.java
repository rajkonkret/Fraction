class Calculator {

    Calculator() {
    }

    Fraction addFraction(Fraction first, Fraction second) {
        int numerator;
        int denominator;
        if (second.getDenominator() == first.getDenominator()) {
            numerator = first.getNumerator() + second.getNumerator();
            denominator = first.getDenominator();
        } else {
            denominator = first.getDenominator() * second.getDenominator() / nwd(first.getDenominator(), second.getDenominator());
            numerator = denominator / first.getDenominator() * first.getNumerator() + denominator / second.getDenominator() * second.getNumerator();
        }
        return new Fraction(numerator, denominator);
    }

    Fraction subFraction(Fraction first, Fraction second) {
        int numerator;
        int denominator;
        if (second.getDenominator() == first.getDenominator()) {
            numerator = first.getNumerator() - second.getNumerator();
            denominator = first.getDenominator();
        } else {
            denominator = first.getDenominator() * second.getDenominator() / nwd(first.getDenominator(), second.getDenominator());
            numerator = denominator / first.getDenominator() * first.getNumerator() - denominator / second.getDenominator() * second.getNumerator();
        }
        return new Fraction(numerator, denominator);
    }

    Fraction mulFraction(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (first.getDenominator() != 0 && second.getDenominator() != 0) {
            numerator = first.getNumerator() * second.getNumerator();
            denominator = first.getDenominator() * second.getDenominator();
        }
        return new Fraction(numerator, denominator);
    }

    Fraction divFraction(Fraction first, Fraction second) {
        int numerator = 0;
        int denominator = 1;
        if (first.getDenominator() != 0 && second.getDenominator() != 0) {
            numerator = first.getNumerator() * second.getDenominator();
            denominator = first.getDenominator() * second.getNumerator();
        }
        return new Fraction(numerator, denominator);
    }

    int nwd(int firstN, int secondN) {

        if (firstN == 0) {
            firstN = 1;
        }

        if (firstN < 0) {
            firstN = Math.negateExact(firstN);
        }

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
