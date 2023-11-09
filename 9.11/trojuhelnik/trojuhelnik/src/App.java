import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int rows = 5;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* "); // Print *
            }
            System.out.println(); // New line[[[]]]
        }

        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
