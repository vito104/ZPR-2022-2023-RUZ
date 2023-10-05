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
        System.out.println("Hledám větší ze dvou hodnot:  A = " + a + " B = " + b);
        try{
            if(a > b){
                System.out.println("A je větší");
             }
            else if(b > a){
                System.out.println("B je větší");
             }
             else{
                System.out.println("Čísla jsou si rovny");
             }
            }
        catch(Exception e){
            System.out.println("Nastala neošetřená vyjímka " + e);
        }


    }

    
}
