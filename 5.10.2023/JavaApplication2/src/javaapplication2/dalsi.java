
package javaapplication2;

import java.util.Scanner;

public class dalsi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte body: \n");
        int body = scanner.nextInt();
        int znamka = 0;
        if(body > 100){
            System.out.println("Maximum je 100 bodů");
        } else{
            
            if(body > 90){
                znamka = 1;
            }
            else if(body > 80){
                znamka = 2;
            }
            else if (body > 60){
                znamka = 3;
            }
            else if(body > 50){
                znamka = 4;
            }
            else if(body <= 50){
                znamka = 5;
            }
            System.out.println("Výsledná známka: " + znamka);
        }
    }

}
