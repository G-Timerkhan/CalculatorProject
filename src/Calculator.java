import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double operand2 = scanner.nextDouble();

        double result = 0;
        boolean isOperationValid = true;

        switch (operation) {
            case '+':
                result = add(operand1, operand2);
                break;
            case '-':
                result = subtract(operand1, operand2);
                break;
            case '*':
                result = multiply(operand1, operand2);
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    isOperationValid = false;
                } else {
                    result = divide(operand1, operand2);
                }
                break;
            default:
                System.out.println("Ошибка: неподдерживаемая операция!");
                isOperationValid = false;
                break;
        }

        if (isOperationValid) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}