/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */

/*
Készítsen programot, amely a main-ben, ciklus segítségével bekéri téglatestek három
méretét. Metódus segítségével számítsa ki a téglatestek térfogatát (a metódus
paraméterei a három méret, értéke a térfogat). A téglatestek méreteit és a térfogatát
egy metódus segítségével írja ki egy szöveges állományba (a metódus paraméterei: a
fájlobjektum, a téglatest méretei és a térfogata). Az adatmegadás végét szabadon
választhatja meg.
*/

public class F10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        PrintStream ki = new PrintStream("Adatok.txt");
        BufferedReader be = new BufferedReader(new FileReader("adatok.txt"));
        int a,b,c;
        
        Scanner bill = new Scanner(System.in,"UTF-8");
        System.out.print("a: ");
        a = bill.nextInt();
        System.out.print("b: ");
        b = bill.nextInt();
        System.out.print("c: ");
        c = bill.nextInt();
        
        ki.close();
        
        int terfogat = terfogat(a,b,c);
        kiir(be, a, b, c, terfogat);
        System.out.println("\nTérfogat: " + terfogat);
    }
private static int terfogat(int a, int b, int c) throws IOException {
    return a*b*c;
}
private static void kiir(BufferedReader be, int a, int b, int c, int terfogat) throws IOException {
    String sor;
    while ((sor = be.readLine()) != null){
        System.out.println(sor);
    }
}
}

