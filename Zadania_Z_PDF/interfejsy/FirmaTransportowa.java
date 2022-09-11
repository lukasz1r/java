public class FirmaTransportowa {

    Auto auto;
    Samolot samolot;

    public FirmaTransportowa(Auto auto, Samolot samolot){
        this.auto = new Auto();
        this.samolot = new Samolot();
    }

    public void czyMozliwy(int masa, String miasto){
        if(auto.ladownosc>=masa && auto.miasto.equals(miasto)){
            System.out.println("mozliwy");
            System.out.println("Koszt kursu to: " + auto.kosztKursuDo());

        }else{
            System.out.println("niemozliwy");
        }
    }
}
