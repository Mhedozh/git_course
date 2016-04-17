package Hillel;

/**
 * Created by Танк on 09.04.2016.
 */
public class Utils {

    public static void printArray(int[] array) {

        System.out.println("The result array: ");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) // как не выводить запятую (один из способов)
                System.out.print(", ");
            System.out.print(array[i]);
        }
    }
}