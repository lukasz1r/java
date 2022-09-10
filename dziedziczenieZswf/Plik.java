import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Plik {
    String nazwa;
    File plik;
    int b;
    FileWriter write;
    FileReader reader;
    BufferedWriter buffer;
    BufferedReader bufred;
    

    public Plik(String nazwa) throws IOException{
        this.nazwa = nazwa;
        this.plik = new File(nazwa);
        this.write = new FileWriter(nazwa);
        this.buffer = new BufferedWriter(write);
        this.reader = new FileReader(nazwa);
        this.bufred = new BufferedReader(reader);
    
    }

    public void zamknij()throws IOException{
        write.close();
    }

    public void pisz(int b)throws IOException{
        this.b = b;
        buffer.close();
        
    }

    public int czytaj()throws IOException{
        b = bufred.read();
        return b;
    }
}
