
package Task8OOP;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BasicComplexCalculator calculator = new BasicComplexCalculator();
        ConsoleLogger logger = new ConsoleLogger();
        calculator.addObserver(logger);

        
        System.out.println("Введите действительную часть первого комплексного числа:");
        double real1 = scanner.nextDouble();

        System.out.println("Введите мнимую часть первого комплексного числа:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Введите действительную часть второго комплексного числа:");
        double real2 = scanner.nextDouble();

        System.out.println("Введите мнимую часть второго комплексного числа:");
        double imaginary2 = scanner.nextDouble();

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");
        int operationChoice = scanner.nextInt();

        ComplexNumber number1 = new BasicComplexNumber(real1, imaginary1);
        ComplexNumber number2 = new BasicComplexNumber(real2, imaginary2);

        ComplexNumber result = null;
        switch (operationChoice) {
            case 1:
                result = calculator.add(number1, number2);
                break;
            case 2:
                result = calculator.multiply(number1, number2);
                break;
            case 3:
                result = calculator.divide(number1, number2);
                break;
            default:
                System.out.println("Некорректный выбор операции.");
                break;
        }

        if (result != null) {
            System.out.println("Результат: " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
        }

        scanner.close();
    }
}