public class Dziedziczenie extends Plik{

    String nazwa;
    int tryb;
    int rozmiar;
    int[] buforZapisu, buforOdczytu;
    int indeks = 0;
    int indeksOdczytu;

    public Dziedziczenie(String nazwa, int tryb, int rozmiar) throws Exception {
        super(nazwa, tryb);
            this.nazwa = nazwa;
            this.tryb = tryb;
            this.rozmiar = rozmiar;
            this.buforZapisu = new int[rozmiar];
            this.buforOdczytu = new int[rozmiar];
            this.indeksOdczytu = rozmiar;
            
    }

    public void pisz(int i) throws Exception{
        if(indeks == rozmiar){
            for(int x=0;x<rozmiar;x++){
                super.pisz(i);
            }
            indeks = 0;
            buforZapisu[indeks] = i;
            indeks++;
        }else{
            buforZapisu[indeks] = i;
            indeks++;
        }
    }

    public int czytaj() throws Exception{

        if(tryb != 0 ){
            if(indeksOdczytu == rozmiar){
                for(int i=0;i<rozmiar;i++){
                    buforOdczytu[i] = super.czytaj();
                }
                indeksOdczytu = 0;
                indeksOdczytu++;
                return buforOdczytu[indeksOdczytu-1];
            }else{
                indeksOdczytu++;
                return buforOdczytu[indeksOdczytu-1];
            }
        }else{
            throw new Exception("Zly tryb");
        }
            
    }
    
    
}
