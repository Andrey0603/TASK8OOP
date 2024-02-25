package Task8OOP;


public class ConsoleLogger implements CalculatorObserver {
    @Override
    public void update(String message) {
        System.out.println("Log: " + message);
    }
}