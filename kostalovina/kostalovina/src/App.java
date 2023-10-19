import java.util.Scanner;

import javax.swing.text.Style;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int suma = 0;
        while(count <= n){
            suma = count + n;
        }
        System.out.println(suma);

    }
}
