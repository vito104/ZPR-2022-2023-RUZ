import java.util.Scanner;

public class dalsi {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for(int i = 0; i <= d; i++){
            double arr[];
            arr = new double[d];
            arr[i] = (double) (50 + (100 - 50) * Math.random());
            System.out.println(arr[i]); 
        }
    }
}
