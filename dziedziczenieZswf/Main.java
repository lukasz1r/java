import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        Plik plik = new Plik("tekst.txt");

        // plik.pisz(3);
        System.out.println(plik.czytaj());
    }
}