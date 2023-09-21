/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikace;

/**
 *
 * @author ruzickavi
 */
public class Aplikace {


     public static void prohod(int jedna, int dva){
        jedna = jedna + dva;
        dva = jedna - dva;
        jedna = jedna - dva;
        
        System.out.println("jedna je: " + jedna   + " " + "druha je: " + dva);
     }
    public static void main(String[] args) {
        int jedna = 5;
        int dva = 1;
        
        System.out.println("Původní hodnota proměnné jedna je: " + jedna + " a původní hodnota proměnné dva je: " + dva);
        prohod(jedna, dva);
    }
    
}
