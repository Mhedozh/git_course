package Hillel;

/**
 * Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class SequenceTwentyRAM {
    public static void main(String[] args) {
        int[] array = new int[1048576];
        for (int i = 2; i <= array.length; i= i * 2)
            System.out.print(i + " ");
    }
}
