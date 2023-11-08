import  java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();
        int vysledek = 0;
        while (cislo > 0){
            vysledek += cislo%10;
            cislo /= 10;
        }
        System.out.println("součet je: " + vysledek);
    }
}