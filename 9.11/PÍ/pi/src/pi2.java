import java.lang.Math.*;
import java.util.Scanner;

public class pi2 {
    public static void main(String[] args) {
        double p = 0.0001;
        double a = 0;
        double b = Math.PI / 2;
        double c;
        while ((b - a) > p) {
            c = (a + b) / 2;
            double fc = Math.cos(c) - c;
            if (fc > 0) {
                a = c;
            } else {
                b = c;
            }
        }
        System.out.println(a);

    }
}
