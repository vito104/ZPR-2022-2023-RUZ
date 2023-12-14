import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            double pi, i, t;
            pi = 0;
            i = 1;
            t = 0.000004;
            int sign = 1;
            while((4/i) >= t){
                pi = pi + sign * (4/i);
                i = i + 2;
                sign = (-1) * sign;
            }
            System.out.println(pi);
    }
}
