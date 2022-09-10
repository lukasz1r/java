import java.util.Scanner;

public class Car {
    String marka;
    int rocznik;
    Silnik silnik;
    double konie;
    

    public Car(String marka, int rocznik, Silnik silnik){
        this.marka = marka;
        this.rocznik = rocznik;
        this.silnik = silnik;
    }

    public void setKonie(double konie) throws Exception{
        try {
            if(konie<=0){
                throw new Exception("Podano ujemne konie");
            }else{
                this.konie = konie;
            }
        } catch (Exception ela) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj poprawne konie");
            konie = scan.nextDouble();
            setKonie(konie);
        }
    }



    public String toString(){
        return "Samochod: " + marka + " Rocznik: "+ rocznik +  " Silnik: " + silnik;
    }

}
