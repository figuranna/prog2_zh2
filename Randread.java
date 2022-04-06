package f9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/*
Készítsen programot, amely a main metódus segítségével sorokat olvas be a billentyűzetről (tetszőleges  végjelig),  
majd  meghatározza  a  sorok  hosszát  (a  sorokban  lévő  karakterek számát), 
egy metódus segítségével kiírja a sorokat a sorok hosszával együtt egy random állományba (a metódus paraméterei: 
fájlobjektum, a sort tartalmazó szting és a sorhossz). A fájl tartalmát visszafelé olvassa ki és írja azt a képernyőre. 
*/

public class Randread {
    public static void main(String[] args) throws IOException {

        // random fájl megnyitása
        RandomAccessFile raf = new RandomAccessFile("random.bin", "rw");

        // scanner inicializálása
        Scanner sc = new Scanner(System.in);
        String currentLine;

        do {
            System.out.print("Kérek egy sort (kilépéshez írjon be egy üressort): ");
            // sor beolvasása
            currentLine = sc.nextLine();
            if (!currentLine.equals("")) {
                // sor + sor hosszzának kiírása egy fájlba
                randWrite(raf, currentLine, currentLine.length());
            }
        }
        while (!currentLine.equals(""));

        System.out.println();


        /*

        Három karaktert írunk ki: abc
        byte-ok:
        00 97 00 98 00 99
        getFilePointer -> 6
         */
        while (raf.getFilePointer() != 0) {
            // visszamegyünk 2 byte-ot
            raf.seek(raf.getFilePointer() - 2);
            // kiolvasunk 2 byte-ot char típusba (1 char = 2 byte)
            System.out.print(raf.readChar());
            // visszamegyünk 2 byte-ot
            raf.seek(raf.getFilePointer() - 2);
        }
        /*
        nagyobb mint 6 > 0? igen ->
        visszamegy 2 byte-ot: getFilePointer = 4
        kiolvas egy char-t: c -> getFilePointer = 6
        visszamegy 2 byte-ot: getFilePointer = 4

        nagyobb mint 4 > 0? igen ->
        visszamegy 2 byte-ot: getFilePointer = 2
        kiolvas egy char-t: c -> getFilePointer = 4
        visszamegy 2 byte-ot: getFilePointer = 2

        nagyobb mint 2 > 0? igen ->
        visszamegy 2 byte-ot: getFilePointer = 0
        kiolvas egy char-t: c -> getFilePointer = 2
        visszamegy 2 byte-ot: getFilePointer = 0

        nagyobb mint 0 > 0? nem -> close stuff
         */
        raf.close();
    }
    private static void randWrite(RandomAccessFile raf, String line, int length) throws IOException {
        // kiír karakterenként 2 byte-ot
        // a számot karakterlánccá konvertáljuk, hogy könnyebben ki tudjuk olvasni visszafelé
        // csak karaktereket kell így olvasnunk, nem kell számokra és karakterekre vizsgálnunk
        raf.writeChars(line + length);
    }
}