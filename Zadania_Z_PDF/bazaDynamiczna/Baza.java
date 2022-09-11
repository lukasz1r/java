public class Baza {
    
    int[] baza;
    int pozycja, towar;
    int rozmiar;

    public Baza(int rozmiar){
        this.rozmiar = rozmiar;
        this.baza = new int[rozmiar];
    }

    public void wstaw(int pozycja, int towar){
        baza[pozycja] = towar;
    }

    public int czytaj(int pozycja){
        return baza[pozycja];
    }

    public int rozmiar(){
        return rozmiar;
    }
}
