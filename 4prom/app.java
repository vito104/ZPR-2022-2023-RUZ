public class app {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        if(a[0] < a[1]){
            System.out.println(a[1] + "je největší");
        } else if(a[0]< a[2]){
            System.out.println(a[2] + "je největší");
        }else if(a[0] < a[3]){
            System.out.println(a[3] + "je největší");
        }else{
            System.out.println(a[0] + "je největší");
        }
        
    }
}
