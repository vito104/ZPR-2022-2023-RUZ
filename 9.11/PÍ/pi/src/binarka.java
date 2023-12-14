import java.util.Scanner;

public class binarka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // načti proměnnou
        /*
         * int delitel = sc.nextInt();
         * int mod;
         * int c = sc.nextInt();
         * 
         * System.out.println("Převádím číslo: " + c);
         * while (c > 0) {
         * if(c % delitel > 0){
         * mod = 1;
         * System.out.print(mod);
         * }
         * else{
         * mod = 0;
         * System.out.print(mod);
         * }
         * c = c /2;
         */
        int co = 46;
        int cim = 5;

        while(co > 0){
            int mod = co % cim;
            co = co / cim;

            System.out.print(mod);
        }
    }
}
