import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        double arr[];
        arr = new double[d];
        for (int i = 0; i < d; i++) {
            arr[i] = 365 + (5891 - 365 + 1) * Math.random();
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
       /*  for(int i = 0; i < d; i++){
            System.out.println(arr[i]);
        }*/
            double pom;
            int dim = d;
            for(int i = 0; i < Math.floor((arr.length/2) + 1); i++){
                pom = arr[i];
                arr[i] = arr[dim-1];
                arr[dim-1] = arr[i];
                dim--;
            }
            for(int i =0; i < d; i++){
                System.out.println(arr[i]);
            }

        }
    }
