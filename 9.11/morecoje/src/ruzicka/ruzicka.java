package ruzicka;

import  java.util.Scanner;

public class ruzicka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a2 = 0;
        int zb = 0;
        while (a > 0){
            zb = a % 10;
            a = a / 10;
            a2 = (a2 * 10) + zb; 
        }
        System.out.println(a2);
    }
}
