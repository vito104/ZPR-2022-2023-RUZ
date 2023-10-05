
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
            
            if(body > 91){
                znamka = 1;
            }
            else if(body < 91){
                znamka = 2;
            }
            else if (body < 81){
                znamka = 3;
            }
            else if(body < 61){
                znamka = 4;
            }
            else if(body < 51){
                znamka = 5;
            }
            System.out.println("Výsledná známka: " + znamka);
        }
    }

}
