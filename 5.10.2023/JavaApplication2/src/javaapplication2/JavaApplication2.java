package javaapplication2;

import java.util.Scanner;


/**
 *
 * @author ruzickavi
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte prvni hodntu: ");
        int a = sc.nextInt();
        System.out.println("Zadejte druhou hodnotu: ");
        int b = sc.nextInt();
        System.out.println("Hledám:  A = " + a + "B = " + b);
    }

    
}
