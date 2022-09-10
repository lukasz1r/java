public class Main{
    public static void main(String[] args) throws Exception {
        Licznik licznik = new Licznik(3);

        // System.out.println("Stan: " + licznik.stan);

        // for(int i=0; i<24; i++){
        //     licznik.impuls();
        // }

        // System.out.println(licznik.czytaj());
        // licznik.ujemnyImpuls();
        // System.out.println(licznik.czytaj());
        // licznik.ustaw(998);
        // System.out.println(licznik.czytaj());

        // Licznik_odwrotny licznikOdwrotny = new Licznik_odwrotny(3);
        // licznikOdwrotny.ustaw(678);

        // for(int i=0; i<3; i++){
        //     licznikOdwrotny.impuls();
        // }
        // System.out.println("Stan: " + licznikOdwrotny.czytaj());

        LiczcnikCykliczny liczcnikCykliczny = new LiczcnikCykliczny(3);
        liczcnikCykliczny.ustaw(333);

        System.out.println(liczcnikCykliczny.czytaj());
        liczcnikCykliczny.impuls();
        System.out.println(liczcnikCykliczny.czytaj());






    }
}