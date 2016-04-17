package Hillel;

import java.util.Scanner;

/**
 * Created by Танк on 27.03.2016.
 */
public class BezOstatka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a%b > 0)
        System.out.println("Ne delitsa");
        else
            System.out.println("Delitsa");
    }
}
