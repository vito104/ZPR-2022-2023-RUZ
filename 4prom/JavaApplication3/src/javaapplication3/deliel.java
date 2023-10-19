package javaapplication3;

import java.util.Scanner;

public class deliel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Zadejte číslo a: ");
        a = sc.nextInt();
        System.out.println("Zadejte druhé číslo: ");
        b = sc.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Vysledek je: " + a);

    }
}
