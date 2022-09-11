public class PlikSzyfrowany extends Plik {
    String nazString;
    public PlikSzyfrowany(String nazwaString) throws PlikNieznany{
        super(nazwaString);
        this.nazString = nazwaString;
    }

        public void zamknij() throws BladPliku{
            super.zamknij();
        }

        public void zapisz() throws BladZapisu{
            super.zapisz();
        }

        public int odczytaj() throws BladOdczytu{         
            try {
                //Otwieranie pliku
                throw new TymczasowyBladOdczytu();//niepowodzenia owatracia pliku
                
            } catch (TymczasowyBladOdczytu e) {//zlapanie informacji o niepowodzeniu otwarcia pliku
                try {
                    //Ponowna proba otwarcia pliku
                    throw new PermanentnyBladOdczytu();//Niepowodzenie otwrarcia pliku
                } catch (PermanentnyBladOdczytu x) { //zlapanie bledu o niepowodzeniu otwarcia pliku kolejny raz
                    //wyrzucenie informac+ji iz pliku nie da sie otworzyc permamentnie 
                }
            }
            return 0;
        }

        public boolean eof() throws BladPliku{
            
            return super.eof();
        }

}

    

