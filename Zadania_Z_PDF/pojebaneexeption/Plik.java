public class Plik {
        String nazwa;
        public Plik(String nazwa) throws PlikNieznany{
            this.nazwa = nazwa;
        }

        public void zamknij() throws BladPliku{

        }

        public void zapisz() throws BladZapisu{
            
        }

        public int odczytaj() throws BladOdczytu, TymczasowyBladOdczytu{
            return 0;
        }

        public boolean eof() throws BladPliku{

            return false;
        }

}
