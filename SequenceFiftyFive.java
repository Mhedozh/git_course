package Hillel;

/**
 * Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class SequenceFiftyFive {
    public static void main(String[] args) {
        int[] array = new int[55];
        for (int i = 1; i <= array.length; i=i+2)
            System.out.print(i + " ");
    }
}
