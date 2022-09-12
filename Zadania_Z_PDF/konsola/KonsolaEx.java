public class KonsolaEx extends Konsola{

    char[] znaki;
    int kontrolka=0;

    public KonsolaEx(){
        this.znaki = new char[4];
    }

    public void put(char c){
        if(kontrolka<znaki.length){
            znaki[kontrolka] = c;
            kontrolka++;
        }
        else{
            for(int i =0; i<znaki.length; i++){
                super.put(znaki[i]);
                this.kontrolka = 0;
                znaki[kontrolka] = c;
                kontrolka++;
            }
            System.out.println("_________");
        }
    }


}
