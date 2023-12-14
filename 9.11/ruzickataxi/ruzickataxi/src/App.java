import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double taxa = 30;
        int limit = 30;
        int chtic = 1;
        int nastup = 100;
        System.out.println("TAXI Ružička, zvolená taxa: " + taxa);

        Scanner sc = new Scanner(System.in);
        while(chtic == 1){
            System.out.println("Kolik chce zákazník jet km? zadej: ");
            double km = sc.nextDouble();
            System.out.println("Jedeš pro zákazníka, délky trasy: " + km);
            if(km >= limit){
                System.out.println("Zákazník jede více než je limit, zadej slevu z taxy v % : ");
                double sleva = sc.nextInt();
                sleva = sleva / 100;
                taxa = taxa * (1  - sleva);
                System.out.println("Nová taxa: " + taxa);
            }
            double suma = taxa * km + nastup;
            System.out.println("Vezeš zákazníka. Za jízdu bez nástupu zaplatí: " + taxa * km);
            System.out.println("Dojel jsi. Zákazník zaplatí: " + suma);
            System.out.println("Chceš pokračovat? pokud ano napiš 1, pokud ne napiš 0");
            chtic = sc.nextInt();
        }
        System.out.println("Konec Služby");
    }
}
