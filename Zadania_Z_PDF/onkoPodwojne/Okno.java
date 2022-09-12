public class Okno {
    int x, y, szer, wys;
    public Okno(int x, int y, int szer, int wys) throws Exception{
        this.x=x;
        this.y=y;
        this.szer=szer;
        this.wys=wys;
    }

    public void wyswietl()throws Exception{

    }

    public void przesun(int dx, int dy)throws Exception{
        this.x = dx;
        this.y = dy;
    }

    public boolean zawiera(int x, int y){
        return false;
    }

    public void punkt(int x, int y, int kolor)throws Exception{
        
    }

}
