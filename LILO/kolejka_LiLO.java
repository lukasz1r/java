import javax.xml.catalog.CatalogException;



///////////////////te throws exceprions to wjebalem byleby bylo///////////////////////
public class kolejka_LiLO {

    int pom;
    int[] tab;
    int[] tabPom;
    
    public kolejka_LiLO(int ilosc)throws Exception{
        this.pom = ilosc;
        this.tab = new int[ilosc];
        this.tabPom = new int[ilosc];
    }
    
    public void wstawNaPoczatek(int arg)throws Exception{
        int temp = pom-1;
        for(int i=temp; i>0; i--){
            tab[i] = tab[i-1];
        }
        tab[0] = arg;
        System.out.println("Wstawione");

        try {
            
        } catch (Exception e) {
            System.out.println("Cos sie ryplo");
        }
    }

    public void String()throws Exception{
        for(int i=0; i<pom;i++){
            System.out.print("["+i+"]" + tab[i]+"; ");
        }
        System.out.println("\n");
    }

    public void usunLast()throws Exception{
        tab[pom-1] = 0;
    }

        //nie wiem czemu nie działa XDDDDDDDDD
    // public int odczytLast(){
    //   return(tab[pom-1]);
    // }

    public void odczytLast()throws Exception{
        System.out.println(tab[pom-1]);
    }

        //Tak samo nie działało jak dałem typ String i return XDDD idkdikdikd
    public void czyPusta() throws Exception{
        int kontrola=0;
        for(int i=0;i<pom;i++){
            if(tab[i] == 0){
                kontrola=0;
            }
            else{
                kontrola =1;
                break;
            }
        }
        if(kontrola==0){
            System.out.println("Kolejka jest pusta");
        }
        else{
            System.out.println("Kolejka NIE jest pusta");
        }
    }

    
    

}
