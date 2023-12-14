import java.util.Scanner;
import java.util.Arrays;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] pp;
        pp = new int[10];
        System.out.println(pp[7]);

        for(int i = 0; i < 10; i++){
            pp[i] = (int) (50 + (100 - 50) * Math.random()); 
        }
        for (int i = 0; i < pp.length; i++) {
            System.out.print(pp[i] + " ");
        }
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] array;
        array = new boolean[n];
        array[0] = true;
        System.out.println(array.length);
        for(int i = 0; i < array.length; i+=2){
            array[i] = true;
        }
        for(int i = 1; i < array.length; i+=2){
            array[i] = false;
        }
         System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
        }


    } 
    }

