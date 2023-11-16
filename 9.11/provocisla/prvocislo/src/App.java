import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int count = 0;
        int i = 1;
        while (i < c) {
            
        }
        while (count < 3) {
            System.out.println("Testuji dělení číslem " + i);
            if ((c % i) == 0) {
                count++;
                i++;
                System.out.println("Číslo je dělitelné číslem: " + i);
                System.out.println("Počet průchodů: " + i);
            }
            else{
                i++;
            }
            if (count > 2) {
                System.out.println("Není prvočíslo");
            } else {
                System.out.println("Je prvočíslo");
            }
        }

    }
}
