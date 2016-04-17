package Hillel;

/**
 * Найти все счастливые билеты от 100000 до 999999
 */
public class LuckyTickets {
    public static void main(String[] args) {
        System.out.println("Lucky tickets list:");
        for (int ticket = 100000; ticket <= 999999; ticket++) {
            int firstHalf = ticket / 100000 + ticket / 10000 % 10 + ticket / 1000 % 10;
            int secondHalf = ticket / 100 % 1000 % 100 % 10 + ticket / 10 % 1000 % 10 + ticket % 10;
            if (firstHalf == secondHalf)
                System.out.println(ticket);
        }
    }
}
