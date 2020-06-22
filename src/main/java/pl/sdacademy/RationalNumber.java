package pl.sdacademy;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
}
