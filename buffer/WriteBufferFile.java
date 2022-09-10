import java.io.FileNotFoundException;

public class WriteBufferFile extends plik {
    int dlugoscBuffora;
    byte[] tab;

    public WriteBufferFile(String nazwaPliku, int dlugoscBuffora) throws FileNotFoundException {
        super(nazwaPliku);
        this.dlugoscBuffora = dlugoscBuffora;
        this.tab = new byte[dlugoscBuffora];
    }

    public void writeZBufforem(byte b) throws FileNotFoundException{
        //sprawdzenie czy w bufforze jest miejsce -> jeżeli ostatni indeks jest pusty to oznacza że miejsce jest na pewno
        if(tab[dlugoscBuffora-1] == 0){
            for(int i=0; i<dlugoscBuffora;i++){
                if(tab[i]==0){
                    this.tab[i] = b;
                    break;
                }
                else{
                    continue;
                }
            }
            
            if(tab[dlugoscBuffora-1]!=0){
                System.out.println("Bufor zostal zapelniony, nastepuje zapis w pliku");
                for(int j=0; j<dlugoscBuffora;j++){
                    write(tab[j]);
                }
                close();
                //tutaj kombinowalem odnosnie proby wpisania kilku bajtow z bufora, nie dziala na razie -> "close() to metoda z klasy wyżej"
            }
        }else{
            System.out.println("Bufor pelen, nastepuje czyszczenie bufora i dopisanie nastepnych danych");
            for(int i=0; i<dlugoscBuffora;i++){
                tab[i] = 0;
            }
            tab[0] = b;            
        }
    }

    ///UZYC METODY DO WYPISANIA PLIKU{}

    //do sprawdzenia dla mnie czy poprawnie sie do tablicy czyli bufora zapisuje
    public void kontrolnyZapisBuffora(){
        for(int i=0;i<dlugoscBuffora; i++){
            System.out.println(tab[i]);
        }
    }
}
