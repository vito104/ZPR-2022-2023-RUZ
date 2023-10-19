import java.util.Scanner;

import javax.swing.text.Style;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Zvolená hodnota: " + n);
        int count = 0;
        int suma = 0;
        for(int pruchod = 0; pruchod < n; pruchod++){
            suma += n;
        }
        System.out.println(suma);

    }
}
