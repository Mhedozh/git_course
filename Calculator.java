package Hillel;

import java.util.Scanner;

/**
 * Добавить к калькулятору возможность ввода операции и чисел из консоли.
 * В начале выводите сообщение "Введите операцию:", дальше пользователь вводит операцию,
 * далее "Введите первое число:" - вводит, "Введите второе число: " - пользователь вводит.
 */
public class Calculator {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operation: ");
        String operation = scanner.next();
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        switch (operation) {
            case "*":
                int resultMultiply = a * b;
                System.out.println("Your result: " + resultMultiply);
                break;
            case "/":
                int resultDivine = a / b;
                System.out.println("Your result: " + resultDivine);
                break;
            case "+":
                int resultAdd = a + b;
                System.out.println("Your result: " + resultAdd);
                break;
            case "-":
                int resultSub = a - b;
                System.out.println("Your result: " + resultSub);
                break;
        }
    }
}
