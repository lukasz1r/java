public class OknoPodwojne extends OknoGraficzne{

    int x1, x2;
    int y1, y2;
    int wektorX, wektorY;

    public OknoPodwojne(int szerokosc, int wysokosc, int wektorX, int wektorY){
        super(szerokosc, wysokosc);
    }   

    public void rysujLinie(int x1, int y1, int x2, int y2){
        super.rysujLinie(x1, y1, x2, y2);
        super.rysujLinie(x1+wektorX, y1+wektorY, x2+wektorX, y2+wektorY);
    }

    public void rysujKolo(int x, int y, int r){
        super.rysujKolo(x, y, r);
        super.rysujKolo(x+wektorX, y+wektorY, r);
    }
}   