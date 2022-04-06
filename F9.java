/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f9;

import java.io.File;
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
majd meghatározza a sorok hosszát (a sorokban lévő karakterek számát). Metódus
segítségével kiírja a sorokat a hosszukkal együtt egy szöveges állományba (a metódus
paraméterei: fájlobjektum, a sort tartalmazó sztring és a sorhossz). Az adatmegadás
végét szabadon választhatja meg.
*/

public class F9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        PrintStream ki = new PrintStream("Adatok.txt");
        
        
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        String város;
        int sorhossz;
        out.print("Kérek egy sort: ");
        város = sc.nextLine();
        sorhossz = város.length();
        kiir(ki, város, sorhossz);
        while(város.length() != 0){ 
            //ki.println(város);
            out.print("Kérek egy sort: ");
            város = sc.nextLine();
            sorhossz = város.length();
            kiir(ki, város, sorhossz);
        } 
        ki.close(); 
        
        
        
        
    }

     private static void kiir(PrintStream ki, String város, int sorhossz) { 
        ki.println(város + ": " + sorhossz);
        //ki.close();

     }
}

