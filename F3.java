/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */

/*
Írjon programot: a main beolvassa e program forrásállományát soronként, egy
metódus segítségével megszámolja az egy sorban lévő karakterek számát. A metódus
paramétere a sort tartalmazó sztring, az értéke a karakterek száma! Az eredményeket,
a main írja ki.
*/
public class F3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
         PrintStream ki = new PrintStream("Adatok.txt");
        kiir(ki);
        Scanner be = new Scanner(new File("Adatok.txt")); 
        out.println("sorok karakterszámai: " + nagy(be));
    }
     private static void kiir(PrintStream f) { 
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        String város;
        int lakó;
        out.print("Kérek egy sort: ");
        város = sc.nextLine();
        while(város.length() != 0){ 
            f.println(város);
            out.print("Kérek egy sort: ");
            város = sc.nextLine();
        } 
        f.close(); 
    }
     private static ArrayList<Integer> nagy(Scanner f) { 
        ArrayList<Integer> szám = new ArrayList<>();
        String sor;
        while(f.hasNext()){ 
            sor = f.nextLine();
            szám.add(sor.length());
        } 
        f.close();
        return szám;
     }
}