package Hillel;

/**
 * Created by Танк on 27.03.2016.
 */
public class MinThreeNumbers {
    public static void main(String[] args) {
        int a = 1, b = 6, c = 1;
        if (a <= b && a <= c)
            System.out.println("a");
        if (b <= a && b <= c)
            System.out.println("b");
        if (c <= a && c <= b)
            System.out.println("c");
    }
}
