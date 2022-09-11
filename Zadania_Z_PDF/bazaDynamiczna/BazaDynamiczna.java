public class BazaDynamiczna {
    Baza baza;
    int rozmiar;

    public BazaDynamiczna(int rozmiar){
        this.rozmiar = rozmiar;
        this.baza = new Baza(rozmiar);
    }

    public void wstaw(int pozycja, int towar){
        if(baza.rozmiar>=pozycja){
            baza.wstaw(pozycja, towar);
        }
        else{
            Baza temp = new Baza(pozycja);
            for(int i=0;i<baza.rozmiar;i++){
                temp.wstaw(i, baza.czytaj(i)); 
            }
            temp.wstaw(pozycja-1, towar);
            baza = temp;
        }
    }

    public int czytaj(int pozycja){
        return baza.czytaj(pozycja-1);
    }
    
}
