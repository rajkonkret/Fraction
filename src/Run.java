public class Run {

    public static void main(String[] args) {
        //    Zdefiniuj klasę Fraction , która odpowiada za reprezentacje ułamków.
        //    Zdefiniuj klasę Calculator i metody odpowiedzialne za dodawanie,odejmowanie
        //    ułamków.

        Fraction sumFraction = new Fraction(1, 1);
        Fraction fraction = new Fraction(1, 2);
        Fraction fraction1 = new Fraction(1, 2);
        sumFraction = Fraction.add(fraction, fraction1);
        System.out.println(sumFraction.getNumerator() + "/" + sumFraction.getDenominator());
    }
}