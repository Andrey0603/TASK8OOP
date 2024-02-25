package Task8OOP;

public interface ComplexCalculator {
    void addObserver(CalculatorObserver observer);
    ComplexNumber add(ComplexNumber a, ComplexNumber b);
    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);
    ComplexNumber divide(ComplexNumber a, ComplexNumber b);
}