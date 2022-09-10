public class Obiekt {
    int liczba;

    public Obiekt(int liczba){
        this.liczba = liczba;
    }

    @Override
    public String toString() {
        return "Obiekt nr: "+ String.valueOf(liczba);
    }
}
