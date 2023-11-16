import java.security.KeyRep;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final float KURZ = (float) 24.40;
        float k = sc.nextInt();
        float e = k/KURZ;
        System.out.println(e);
    }
}
