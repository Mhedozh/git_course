package Hillel;

import java.util.Scanner;

/**
 * Created by Танк on 27.03.2016.
 */
public class ChetnoeNechetnoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 > 0)
            System.out.println("Nechetnoe.");
        else
            System.out.println("Chetnoe.");
    }
}
