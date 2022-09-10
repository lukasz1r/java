public class Main{
    public static void main(String[] args) throws BladBazt {

        Baza baza = new Baza("do_leszka");        

        try{
            baza.otworz(1);
        }catch (BladOtwarcia e){
            System.out.println("Blad bazy");
        }

        try {
            baza.zapisz(1);
            baza.zapisz(2);
            baza.zapisz(3);
        } catch (BlazdZapisu e) {
            //ignoruje
        }

        try {
            baza.zamknij();
        } catch (BladBazt e) {
            System.out.println("Blad bazy");
        }

        try {
            System.out.println(baza.czytaj());
        } catch (BladOdczytu e) {
            //ignoruje
        }
        
        
    }
}