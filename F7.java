/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author admin
 */

/*
Írjon programot: a main beolvas a billentyűzetről valós számokat (nulla végjelig), és
azokat egy szöveges fájlban tárolja. Majd egy metódus segítségével visszaolvassa a
fájl tartalmát és kiszámítja a tárolt értékek átlagát. A metódus paramétere a
fájlobjektum, értéke az átlag. Az eredményt a main írja ki.
*/

public class F7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        PrintWriter ki = new PrintWriter("adatok.txt");
        BufferedReader be = new BufferedReader(new FileReader("adatok.txt"));
        
        Scanner bill = new Scanner(System.in,"UTF-8");
        float magasság = 0;
        out.print("Szám: ");
        magasság=bill.nextFloat();
        while (magasság!=0) {
            System.out.print("Szám: ");
            magasság=bill.nextFloat();
            ki.printf("%s\n", magasság);
        }
         ki.close();
        
        out.printf("Az átlag= %5.2f\n", kiir(be));
       
    }
private static float kiir(BufferedReader be) throws IOException {
    String sor;
    float magas, átlag=0;
    int db=0;
    StringTokenizer token;
    while((sor = be.readLine()) != null){
    token = new StringTokenizer(sor, ";");
    magas = Float.valueOf(token.nextToken());
    átlag += magas;
    db++;
    }
    be.close();
    return átlag/db;
}
}