public class App {
    public static void main(String[] args) throws Exception {
        int radekmaticea = 7, sloupecmaticea = 5;
        int radekmaticeb = 7, sloupecmaticeb = 5;

        int[][] maticea;

        maticea = new int[radekmaticea][sloupecmaticea];
        int[][] maticeb = new int[radekmaticeb][sloupecmaticeb];

        for (int i = 0; i < radekmaticea; i++) {
            for (int j = 0; j < sloupecmaticea; j++) {
                maticea[i][j] = (int) (21 * Math.random());
            }
        }

        for(int i = 0; i < radekmaticea; i++){
            System.out.print("řádek " + (i+1) + ": ");
            for(int j = 0; j < sloupecmaticea; j++){
                System.out.print(maticea[i][j] + " ");
                ///System.out.format("Cislo: %d", maticea[i][j] );
            }
            System.out.println();

        }

        for (int i = 0; i < radekmaticea; i++) {
            for (int j = 0; j < sloupecmaticea; j++) {
                maticeb[i][j] = (int) (21 * Math.random());
            }
        }

        System.out.println("MATICE B");

        for(int i = 0; i < radekmaticeb; i++){
            System.out.print("řádek " + (i+1) + ": ");
            for(int j = 0; j < sloupecmaticeb; j++){
                System.out.print(maticeb[i][j] + " ");
                ///System.out.format("Cislo: %d", maticea[i][j] );
            }
            System.out.println();

        }

        System.out.println("MATICE A+B");

        for(int i = 0; i < radekmaticea; i++){
            for(int j = 0; j < sloupecmaticeb; j++){
                System.out.print(maticea[i][j] + maticeb[i][j] + " ");
            }
            System.out.println();
        }
    }

}
