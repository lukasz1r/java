public class PodwojneOkno {
    int x, y, szer, wys;
    Okno oknoLewe;
    Okno oknoPrawe;
    public PodwojneOkno(int x, int y, int szer, int wys) throws Exception{
        this.x=x;
        this.y=y;
        this.szer=szer;
        this.wys=wys;

        oknoLewe = new Okno(x, y, szer/2, wys);
        oknoPrawe = new Okno(x+(szer/2), y, szer/2, wys);
    }

    public void wyswietl()throws Exception{
        oknoLewe.wyswietl();
        oknoPrawe.wyswietl();
    }

    public void przesun(int dx, int dy) throws Exception{
        oknoLewe.przesun(dx, dy);
        oknoPrawe.przesun(dx, dy);
    }

    public boolean zawiera(int x, int y)throws Exception{
        return (oknoLewe.zawiera(x, y) && oknoPrawe.zawiera(x, y));
    }

    public void punkt(int x, int y, int kolor) throws Exception{
        if(oknoLewe.zawiera(x, y)){
            oknoLewe.punkt(x, y, kolor);
        }
        if(oknoPrawe.zawiera(x, y)){
            oknoPrawe.punkt(x, y, kolor);
        }
    }
}
