import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= c; i++){
            System.out.println("Testuji dělení číslem " + i);
            if(c % i == 0){
                System.out.println("Je dělitelné číslem " + i);
                count++;
                System.out.println("Počet průchodů: " + count);
            }
            else{
                System.out.println("Není dělitelné číslem " + i);
                System.out.println("Počet průchodů " + count);
            }
            if(count > 2){

                System.out.println("Není prvočíslo");
                break;
            }
            if(count == 2){
                System.out.println("Je to prvočíslo");
            }
            System.out.println("Algoritmus byl ukončen");


        }
    } 
}

