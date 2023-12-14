import java.util.Scanner;

public class dalsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kurs = sc.nextFloat();
        float a = (float) (500 + 63 * Math.random());
        System.out.println(a);
        float penize = a / kurs;
        System.out.println(penize);
    }

}
