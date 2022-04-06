/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f5;

import java.io.PrintStream;
import java.io.IOException;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author admin
 */

/*
Készítsen programot, amely egy metódus segítségével sorokat olvas be a
billentyűzetről (a metódus paramétere a sort tartalmazó sztring), majd egy másik
metódus segítségével kiírja a sorokat egy szöveges állományba (paraméterek:
fájlobjektum és a sort tartalmazó sztring). Az adatmegadás végét szabadon
választhatja meg.
*/

public class F5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // NEM LYÓ TELJESEN
        
        PrintStream ki = new PrintStream("Adatok.txt");
        beolvas be = new beolvas();
        
        String város = null;
        be.beolvas(város);
        be.kiir(ki, város);
        
    }
    /*private static void beolvas(String város) { 
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        out.print("Kérek egy sort: ");
        város = sc.nextLine();
        while(város.length() != 0){ 
            out.print("Kérek egy sort: ");
            város = sc.nextLine();
        } 
     }
    private static void kiir(PrintStream ki, String város) { 
        ki.println(város);
        //ki.close();

     }*/
}
class beolvas{
    public void beolvas(String város){
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        out.print("Kérek egy sort: ");
        város = sc.nextLine();
        while(város.length() != 0){ 
            out.print("Kérek egy sort: ");
            város = sc.nextLine();
        } 
    }
    public void kiir(PrintStream ki, String város){
        ki.println(város);
    }
}