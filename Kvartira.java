package Hillel;

import java.util.Scanner;

/**
 * Created by Танк on 25.03.2016.
 */
public class Kvartira {
    public static void main(String[] args) {
        System.out.println("Enter days of rent: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 40;
        int b = x*n;
        if (x > 4)
            b = b - 20;
        if (x > 7)
            b = b - 30;
        System.out.println("To pay: " + b);
    }
}
