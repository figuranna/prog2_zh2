/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.err;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author admin
 */

/*
Írjon programot, amely metódus segítségével beolvassa egy szöveges állományát és
közben megszámolja a sorokat. A fájl megnyitását a main-ben végezze el. A metódus
paramétere a fájlobjektum, a visszaadott érték a sorok száma legyen! Az eredményt, a
main írja ki.
*/
public class F2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        szamol szam = new szamol();
        
        String nev;
        Scanner billentyu = new Scanner (System.in, "ISO8859_2");
        try{ try (PrintStream file = new PrintStream("Fájl.txt")){
            out.print("Szöveg: ");
            nev = billentyu.nextLine();
            while(nev.length()!=0){
                file.println(nev);
                out.print("Szöveg: ");
                nev = billentyu.nextLine();
            }
        }
        }
        catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        }
        
        try { try (FileReader be = new FileReader("Fájl.txt")){ // Fájl megnyitás
                int tmp = szam.szamol("Fájl.txt");
                out.println("\nSorok száma: " + tmp);
                be.close(); //Fájl lezárás
            }
            }
            catch (IOException error){ //Általános I/O hiba
                err.println(error.getMessage()); //Hiba kiírása
            } 
        
    }
    
}
class szamol{
    public int szamol(String f) throws IOException{
        //String str = new String(Files.readAllBytes(Paths.get(f)));
        //int len = str.length();
        int i = 0;
        try (Scanner file = new Scanner(new File("Fájl.txt"))) {
            //int i = 0;
            while(file.hasNext()) { // Van még adat?
                out.println(file.nextLine());
                i++;
            }
            /*out.println("Sorok száma: " + i);
            file.close();*/
            
        }
        catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        }
        
        return i;
        
        /*int c, j = 0;
        while(j < len){
                        j++;
                }
        return j;*/
    }
}
