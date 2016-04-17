package Hillel;

/**
 * Найти сумму всех четных и сумму всех нечетных элементов массива
 */
public class SumOddEven {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int odd = 0;
        int even = 0;
        int sum_odd = 0;
        int sum_even = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                even = i;
                sum_even = sum_even + array[even];
                System.out.println(sum_even + " ");
            }
            if (i % 2 != 0) {
                odd = i;
                sum_odd = sum_odd + array[odd];
                System.out.println(sum_odd + " "); // нахожу четные и нечетные но не могу придумать как их сложить между собой
            }
        }
    }
}




