public class Towar {
    
    int cena;

    public Towar(int cena){
        this.cena = cena;
    }

    public int jakaCena(){
        return cena;
    }

    public void ustawCene(int nowaCena){
        cena = nowaCena;
    }
}
