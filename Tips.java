package Hillel;

import java.util.Scanner;

/**
 * Задача "Чаевые".
 входные данные: сумма, которую вы должны заплатить и уровень сервиса
 в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
 - terrible (0%)
 - poor (5%)
 - good (10%)
 */
public class Tips {
    public static void main(String[] args) {
        float a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your sum: ");
        a = scanner.nextInt();
        System.out.print("Please, estimate our service: ");
        String quality = scanner.next();
        switch (quality) {
            case "terrible":
                float resultTerrible = a + (a * 0 / 100);
                System.out.println("Your bill with tips will be: " + resultTerrible + " Sorry.");
                break;
            case "poor":
                float resultPore = a + (a * 5 / 100);
                System.out.println("Your bill with tips will be: " + resultPore);
                break;
            case "good":
                float resultGood = a + (a * 10 / 100);
                System.out.println("Your bill with tips will be: " + resultGood);
                break;
            case "great":
                float resultGreat = a + (a * 15 / 100);
                System.out.println("Your bill with tips will be: " + resultGreat + " Please, come again!");
                break;
            case "excellent":
                float resultExcellent = a + (a * 20 / 100);
                System.out.println("Your bill with tips will be: " + resultExcellent + " Please, recommend us to your friends!");
                break;
        }
    }
}

