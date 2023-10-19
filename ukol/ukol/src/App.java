import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int podil = 0;
        int zbytek = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte prvni cislo: ");
        int iCis1= sc.nextInt();

        System.out.println("Zadejte druhe cislo: ");
        int iCis2 = sc.nextInt();

        zbytek = iCis1;
        while(zbytek>= iCis2){
            zbytek = zbytek - iCis2;
            podil++;
        }
    }
}
