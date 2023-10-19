package prvni;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * int[] a = {1,2,3,4};
         * int max;
         * if(a[0] < a[1]){
         * max = a[1];
         * } if(a[0]< a[2]){
         * max = a[2];
         * } if(a[0] < a[3]){
         * max = a[3];
         * }else{
         * max = a[0];
         * }
         * System.out.println(max + " je největší");
         */


        Scanner sc = new Scanner(System.in);
        int a = 0;
        int max = a;
        int pocethodnot;
        for (pocethodnot = 1; pocethodnot < 5; pocethodnot++) {
            System.out.println("zadejte hodnotu " + pocethodnot);
            a = sc.nextInt();
            if (a > max) {
                max = a;
            }
        }
        System.out.println("maximum je: " + max);

    }
}
