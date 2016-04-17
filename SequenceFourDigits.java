package Hillel;

/**
 * Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 */
public class SequenceFourDigits {
    public static void main(String[] args) {
        int fourDigits[] = new int[9999];
        for (int i = 1000; i <= fourDigits.length; i = i + 3)
            System.out.print(i + " , ");
    }
}
