import java.util.Scanner;

public class treti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int suma = 0;

        for(int i = 4; i < n; i+=7){
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
