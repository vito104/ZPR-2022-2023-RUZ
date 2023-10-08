// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// / then press Enter. You can now see whitespace characters in your code.
package body_znamka;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int znamka;
        System.out.println("Zadejte počet bodů: \n");
        int body = sc.nextInt();

            if(body >= 91){
                znamka = 1;
            } else if(body >= 81){
                znamka = 2;
            } else if(body >= 61){
                znamka = 3;
            } else if(body >= 51){
              znamka = 4;
            } else {
                znamka = 5;
            }
        System.out.println("Výsledná známka: " + znamka);

        }
    }
