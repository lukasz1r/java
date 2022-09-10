public class Samochod {
    String nazwa;
    int rocznik;
    int konie;
    String kolor;

    public Samochod(String nazwa, int rocznik, int konie, String kolor){
        this.nazwa = nazwa;
        this.rocznik = rocznik;
        this.konie = konie;
        this.kolor = kolor;
    }

    public String toString() {
        return "Marka: " + nazwa + " Rocznik: " + rocznik + " Konie: " + konie + " Kolor: "+ kolor;
    }
}
