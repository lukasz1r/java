public class Konto{

    private int klucz;
    String nazwa;
    
    public Konto(String nazwa, int klucz){
        this.nazwa = nazwa;
        this.klucz = klucz;
    }

    public void zmienKlucz(int nowyKlucz){
        this.klucz = nowyKlucz;
    }

    public int jakiKlucz(){
        return this.klucz;
    }
}