public class Silnik {
    String nazwa;
    int pojemnosc;

    public Silnik(String nazwa, int pojemnosc){
        this.nazwa = nazwa;
        this.pojemnosc = pojemnosc;
    }

    // @Override
    public String toString() {
        // return super.toString();
        return nazwa+ " " + pojemnosc;
    }
}
