import java.util.ArrayList;

public class Baza {

    ArrayList<Integer> baza;
    String sciezka;
    int tryb;
    int stan;
    int liczba;
    

    public Baza(String sciezka) throws BladBazt{
        this.sciezka = sciezka;
        this.baza = new ArrayList<Integer>();
    }

    public void otworz(int tryb) throws BladOtwarcia{
        this.tryb = tryb;
        this.stan = 1;
    }

    public void zamknij() throws BladBazt{
        this.stan=0;
    }

    public void zapisz(int liczba) throws BlazdZapisu{
        this.liczba = liczba;
        baza.add(this.liczba);
    }

    public int czytaj() throws BladOdczytu{
        String temp="";
        for(int i : baza){
            temp+= String.valueOf(i);
        }
        int temp2 = Integer.parseInt(temp);
        return temp2;
    }

}
