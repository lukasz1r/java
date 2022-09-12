import java.rmi.AccessException;

public class Kompozycja {
    String nazwa;
    int tryb, rozmiar;
    Plik plik;

    int[] BuforZapisu;
    int kontrolkaZapisu=0;

    int[] BuforOdczytu;
    int kontrolkaOdczytu;

    public Kompozycja(String nazwa, int tryb, int rozmiar) throws Exception{
        this.plik = new Plik(nazwa, tryb);
        this.BuforZapisu = new int[rozmiar];
        this.BuforOdczytu = new int[rozmiar];
        kontrolkaOdczytu = rozmiar;
        this.tryb = tryb;
    }

    public void pisz(int i) throws Exception{
        
        if(tryb==1){
            if(kontrolkaZapisu<rozmiar){
                BuforZapisu[kontrolkaZapisu] = i;
                kontrolkaZapisu++;
            }
            else{
                for(int j=0; j<rozmiar;j++){
                    plik.pisz(BuforZapisu[j]);
                }
                this.kontrolkaZapisu = 0;
                BuforZapisu[kontrolkaZapisu] = i;
                this.kontrolkaZapisu++;
            }
        }else{
            throw new AccessException("Zly tryb");
        }  
    }

    public int czytaj()throws Exception{
        if(tryb==1){
            if(kontrolkaOdczytu==rozmiar){
                for(int i=0; i<rozmiar; i++){
                    BuforOdczytu[i] = plik.czytaj();
                }
                kontrolkaOdczytu=0;
                kontrolkaOdczytu++;
                return BuforOdczytu[kontrolkaOdczytu-1];  
            }else{
                kontrolkaOdczytu++;
                return BuforOdczytu[kontrolkaOdczytu-1];
            }
        }else{
            throw new AccessException("Zly tryb");
        } 
    }

}
