import java.io.FileNotFoundException;

public class main{
    public static void main(String[] args) throws FileNotFoundException{


    WriteBufferFile zapisZPamiecia = new WriteBufferFile("tekst.txt", 3);
    zapisZPamiecia.writeZBufforem((byte)2);
    zapisZPamiecia.writeZBufforem((byte)3);
    zapisZPamiecia.writeZBufforem((byte)4);
    zapisZPamiecia.kontrolnyZapisBuffora();
    
    
        

    }
}