public class Main{
    public static void main(String[] args) throws Exception {
        Car mazda = new Car("Mazda", 2007, new Silnik("Szybki", 5));
        System.out.println(mazda.toString());
        System.out.println(mazda.silnik.nazwa);

        mazda.setKonie((double) -10);
        System.out.println(mazda.konie);
    }
}