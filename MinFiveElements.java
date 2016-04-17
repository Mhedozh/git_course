package Hillel;

/**
 * Вывести первые 5 минимальных элементов массива
 */
public class MinFiveElements {
    public static void main(String[] args) {
        int[] array = {1, 12, 3, 14, 25, 6, 7, 8, 9};
        int[] sortedArray = sort(array);
        for (int i = 0; i <= 4; i++)
            System.out.print(array[i] + " ");
    }

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}


