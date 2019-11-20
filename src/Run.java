public class Run {

    public static void main(String[] args) {
        //    Zdefiniuj klasę Fraction , która odpowiada za reprezentacje ułamków.
        //    Zdefiniuj klasę Calculator i metody odpowiedzialne za dodawanie,odejmowanie
        //    ułamków.
        MyFrame window = new MyFrame();
        Fraction sumFraction = new Fraction(1, 1);
        Fraction fraction = new Fraction(2, 8);
        Fraction fraction1 = new Fraction(1, 8);
        sumFraction = Fraction.add(fraction, fraction1);
        System.out.println(fraction.getNumerator() + "   " + fraction1.getNumerator() + "   " + sumFraction.getNumerator());
        System.out.println("- + - = -");
        System.out.println(fraction.getDenominator() + "   " + fraction1.getDenominator() + "   " + sumFraction.getDenominator());
        Fraction fraction3 = new Fraction(4, 8);
        window.setComponent(fraction3);
        window.setComponent1(fraction);
        sumFraction = Fraction.add(fraction3, fraction);
        window.setResult(sumFraction);

        //window.component6.setFraction(fraction3);
    }
}