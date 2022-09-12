public class test {
    int[] tab;
    int rozmiar, indeks = 0;

    public test(String nazwa, int rozmiar){
        this.tab = new int[rozmiar];
        this.rozmiar = rozmiar;
    }

    public void dodaj(int liczba){
        if(indeks<rozmiar){
            this.tab[indeks] = liczba; System.out.println("Indeks w add: " + indeks);   
        }else{
            System.out.println("Przepelnienie" + indeks);
            this.indeks=0;
            this.tab[indeks] = liczba; System.out.println("Indeks w add: " + indeks);
        }
        indeks++;
        
    }

    public void wypisz(){
        if(indeks==rozmiar){
            for(int i=0;i<rozmiar;i++){
                System.out.print(tab[i] + "|");
            }
            System.out.println("indeks w wypisz():  " + indeks);
            System.out.println("\n");
        }else{
            System.out.println("indeks w wypisz():  " + indeks);
        }
    }
}
