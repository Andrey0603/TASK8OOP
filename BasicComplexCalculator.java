package Task8OOP;


import java.util.ArrayList;
import java.util.List;

public class BasicComplexCalculator implements ComplexCalculator {
    private List<CalculatorObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(CalculatorObserver observer) {
        observers.add(observer);
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double real = a.getRealPart() + b.getRealPart();
        double imaginary = a.getImaginaryPart() + b.getImaginaryPart();
        return new BasicComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imaginary = a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart();
        return new BasicComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double divisor = b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart();
        double real = (a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart()) / divisor;
        double imaginary = (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart()) / divisor;
        return new BasicComplexNumber(real, imaginary);
    }
}