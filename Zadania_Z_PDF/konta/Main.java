public class Main{
    public static void main(String[] args){
        Konto[] konto = new Konto[20];
    
        for(int i=0; i<20; i++){
            konto[i] = new Konto("Nazwa", i*10);
        }
        for(int y=0; y<20;y++){
            if(konto[y].jakiKlucz()%2==0){
                konto[y].zmienKlucz(konto[y].jakiKlucz()+1);
            }
        }

        for(int zebra=0; zebra<20; zebra++){
            System.out.println("Nazwa: " + konto[zebra].nazwa + ";  Klucz: " + konto[zebra].jakiKlucz());
        }
    }
}