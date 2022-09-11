public class Main{
    public static void main(String[] args){
        BazaDynamiczna bazaD = new BazaDynamiczna(4);
        bazaD.wstaw(60, 99);
        System.out.println(bazaD.czytaj(60));

        // Baza b = new Baza(4);
        // b.wstaw(2, 99);
        // System.out.println(b.czytaj(2));

    }
}