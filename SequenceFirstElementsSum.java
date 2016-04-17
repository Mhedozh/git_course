package Hillel;

/**
 * Найти сумму первых n элементов массива
 */
public class SequenceFirstElementsSum {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 10, 6};
        int sum = 0;
        for (int i = 0; i <= 4; i++)
            sum = sum + array[i];
            System.out.print(sum);
    }
}

