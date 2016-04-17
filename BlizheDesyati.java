package Hillel;

import java.util.Scanner;

/**
 * Created by Танк on 27.03.2016.
 */
public class BlizheDesyati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), m, n;
        m = Math.abs(10-a);
        n = Math.abs(10-b);
        if (m > n)
        System.out.println(b);
        else
            System.out.println(a);
    }
}
