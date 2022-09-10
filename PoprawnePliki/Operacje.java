import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Operacje{
    
    String nazwa = "tekst.txt";
    File plik = new File(nazwa);
    PrintWriter writer;
    Scanner reader;

    public void zapis()throws IOException{
        this.writer = new PrintWriter(new FileOutputStream(plik, true));//append = true
        for(int i=1;i<10;i++){
            writer.println(i);
        }
        writer.close();
    }

    public void odczyt() throws IOException{
        this.reader = new Scanner(plik);
        try{
            do{
                System.out.println(reader.nextInt());
            }while(reader.nextLine()!=null);
            reader.close();
        }catch (Exception e) {
            System.out.println("koniec pliku");
        }
    }
}
