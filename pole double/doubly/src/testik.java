import java.util.Scanner;

public class testik {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 0;
            while(i != 20){
                if(n % 6 != 5){
                    System.out.println("Aktualni cislo: " + n);
                    n++;
                }
                else{
                    i++;
                    System.out.println("Pocet nalezenych cisel: " + i);
                    n++;
                }
            }


        }
}
