public class Main {
    public static void main(String[] args) throws PlikNieznany{
        PlikSzyfrowany plik = new PlikSzyfrowany("text.txt");
        System.out.println(plik.nazString);
    }
}
