public class Licznik {
    
    int poz;
    int[] licz;
    int stan;

    public Licznik(int cyfry){
        this.poz=cyfry;
        licz = new int[poz];
    }

    public void zero(){
        for(int i=0;i<poz;i++){
            licz[i] = 0;
        }
    }

    public int czytaj(){
        String test = "";
        for(int i=0; i<poz;i++){
            test += String.valueOf(licz[i]);
        }
        this.stan = Integer.parseInt(test); 
        return stan;
    }

    public void impuls() throws Exception{
        for(int i=poz-1; i>=0; i--){
            if(licz[i]<9){
                licz[i]+=1;
                break;
            }
            else{continue;}
        }
    }

    public void ujemnyImpuls(){
        for(int i=0; i<poz; i++){
            if(licz[i]>0){
                licz[i]-=1;
                break;
            }
            else{continue;}
        }
    }

    public void ustaw(int pozycja){
        String temp = Integer.toString(pozycja);
        for(int i=0;i<poz;i++){
            licz[i] = temp.charAt(i) - '0';
        }
    }
}
