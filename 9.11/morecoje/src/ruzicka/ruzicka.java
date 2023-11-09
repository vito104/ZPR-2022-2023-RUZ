package ruzicka;

import  java.util.Scanner;
import java.util.Arrays;


public class ruzicka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       /*  int a2 = 0;
        int zb = 0;
        while (a > 0){
            zb = a % 10;
            a = a / 10;
            a2 = (a2 * 10) + zb; 
        }
        System.out.println(a2);*/
        char[] cisla = String.valueOf(a).toCharArray();
        int max = cisla.length;
        System.out.println(max);
        int i;
        for(i = (max -1); i >= 0; i--){
            System.out.println(cisla[i]);
        }
    }
}
