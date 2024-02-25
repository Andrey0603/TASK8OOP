
package Task8OOP;


public class BasicComplexNumber implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public BasicComplexNumber(double real, double imaginary) {
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }
}