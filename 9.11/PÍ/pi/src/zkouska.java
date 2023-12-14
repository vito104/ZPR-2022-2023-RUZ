public class zkouska {
    public static void main(String[] args) {
                String bin = " ";
                int zaklad = 19;
                int soust = 3;

                do{
                    int zbytek = zaklad % soust;
                    bin = zbytek + bin;
                    zaklad = zaklad / soust;
                } while(zaklad != 0);

                System.out.println(bin);
            }
        }
