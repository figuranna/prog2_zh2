/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f4;

import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author admin
 */

/*
Készítsen programot, amely a main segítségével sorokat olvas be a billentyűzetről,
majd egy metódus segítségével kiírja azokat a sorszámokkal együtt egy szöveges
állományba (a metódus paraméterei: fájlobjektum, sorszám és a sort tartalmazó
sztring). Az adatmegadás végét szabadon választhatja meg.
*/

public class F4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
         PrintStream ki = new PrintStream("Adatok.txt");
        
        
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        String város;
        int index = 0;
        out.print("Kérek egy sort: ");
        város = sc.nextLine();
        index++;
        kiir(ki, város, index);
        while(város.length() != 0){ 
            //ki.println(város);
            out.print("Kérek egy sort: ");
            város = sc.nextLine();
            index++;
            kiir(ki, város, index);
        } 
        ki.close(); 
    }
    private static void kiir(PrintStream ki, String város, int index) { 
        ki.println(index + ". " + város);
        //ki.close();

     }
}
