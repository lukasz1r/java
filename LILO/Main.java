public class Main{
    public static void main(String[] args) throws Exception {
        kolejka_LiLO kolejka = new kolejka_LiLO(4);
    
        kolejka.String();
        kolejka.czyPusta();
        kolejka.wstawNaPoczatek(4);
        kolejka.wstawNaPoczatek(3);
        kolejka.wstawNaPoczatek(2);
        kolejka.wstawNaPoczatek(1);
        kolejka.String();
        kolejka.czyPusta();
        kolejka.odczytLast();
        kolejka.wstawNaPoczatek(88);
        kolejka.String();
        kolejka.usunLast();
        kolejka.String();
    }
}