import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        double arr[];
        arr = new double[d];
        for (int i = 0; i < d; i++) {
            arr[i] = 365 + (5891 - 365 + 1) * Math.random();
            System.out.print(arr[i] + " ");
        }
        double max = arr[0];
        double min = arr[0];
        double sou = arr[0];
        for(int i = 1; i < d; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sou += arr[i];

        }
        System.out.println("maximum: " + max);
        System.out.println("Minumum: " + min);
        System.out.println("Součet prvků:" + sou);
    }
}