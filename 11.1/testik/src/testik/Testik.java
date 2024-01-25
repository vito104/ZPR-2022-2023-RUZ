/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package testik;
import java.util.Scanner;

/**
 *
 * @author ruzickavi
 */
public class Testik {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 0;
            while(i != 20){
                if(n % 6 == 5){
                    System.out.println("Číslo " + n + "dává zbytek po dělení 6");
                    System.out.println("Aktualni cislo: " + n);
                    
                    n++;
                }
                else{
                    i++;
                    System.out.println("Pocet pruchodu: " + i);
                }
            }


        }
    
}
