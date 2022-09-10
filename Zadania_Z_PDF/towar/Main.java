public class Main{
    public static void main(String args[]){
        Towar tow[] = new Towar[10];
        int Ceny[] = new int[10];
        for(int i=0; i<10;i++){
            Ceny[i] = (i+5) * 10;
            tow[i] = new Towar(Ceny[i]);
        }
        for(int g=0;g<10;g++){
            System.out.println("Cena: "+ tow[g].jakaCena());
        }
        for(int q=0;q<10;q++){
            if(tow[q].jakaCena()>100){
                tow[q].ustawCene(tow[q].jakaCena()-10);
            }
        }
        System.out.println("po promocji");
        for(int p=0;p<10;p++){
            System.out.println("Cena: "+ tow[p].jakaCena());
        }
    }
}