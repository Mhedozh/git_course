package Hillel;

/**
 * Created by Танк on 25.03.2016.
 */
public class MinThreeNum {
    public static void main(String[] args) {
        int a = 5, b = 4, c = 3;
        if (a < b && a < c)
        System.out.println(a);
        else if (b < a && b < c)
            System.out.println(b);
        else if (c < a && c < b)
            System.out.println(c);
    }
}
