import java.util.Scanner;

public class dalsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int p = 3;
        boolean vys = true;
        if (c % 2 == 0) {
            System.out.println((c != 2) ? "Není provčíslo" : "Je prvočíslo");
        } else {
           while (p <= Math.sqrt(c) && vys == true) {
                if(c % p == 0){
                    vys = false;
                }
                p++;
           } 
        }
        System.out.println(vys);
    }
}