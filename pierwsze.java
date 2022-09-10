import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pierwsze{
    public static void main(String[] args) throws FileNotFoundException {
        
        // Samochod car;
        // car = new Samochod("Volvo", 2020, 330, "czarny");
        // System.out.println("Dane samochodu to = >  rocznik: " + car.rocznik);
        // System.out.println(car.toString());
        
        String rzeka = "Wisla";
        String translation = switch (rzeka) {
            case "Bialka" -> "mala";
            case "Wisla" ->  "sranie";
            case "Odra" -> "retec";
            case "narew" -> "pijany rybak";
            default -> "nieznany";
        };
        File tekst = new File("tekst.txt");
        Scanner odczyt = new Scanner(tekst);
        String napis = odczyt.nextLine();
        System.out.println(napis);


    }    
}