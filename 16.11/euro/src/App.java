import java.security.KeyRep;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final float KURZ = (float) 24.54;
        float k = sc.nextInt();
        double kk = Math.round(KURZ);
        kk /= 100;
        
        System.out.println(kk);


        
    }
}
