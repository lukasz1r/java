import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class plik{
    Scanner odczyt;
    PrintWriter zapis;
    byte b;
    File plik;
    String nazwaPliku;

    public plik(String nazwaPliku) throws FileNotFoundException{
        this.nazwaPliku = nazwaPliku;
        this.plik = new File("tekst.txt");
    }

    public void write(byte b)throws FileNotFoundException{
        this.b = b;
        this.zapis = new PrintWriter(nazwaPliku);
        zapis.println(b); 
    }

    public byte read() throws FileNotFoundException{
        this.odczyt = new Scanner(plik);
        return odczyt.nextByte();
    }

    public void close(){
        zapis.close();
    }
}
