import java.util.Scanner;

public class druhy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soucet = 0;

        for(int i = 0; i <= n; i++){
            soucet = soucet + i;
        }
        System.out.println("vysledek je:" + soucet);
    }
}
