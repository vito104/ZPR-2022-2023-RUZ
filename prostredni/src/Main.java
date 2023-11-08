import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a, b, c, prostredni;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        prostredni = 0;

        if (a < b) {
            if (b < c) {
                prostredni = b;
            } else if (c < a) {
                prostredni = a;
            }
        }
    }
}