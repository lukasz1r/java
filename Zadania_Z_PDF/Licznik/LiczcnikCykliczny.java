import java.text.BreakIterator;
import java.util.Arrays;

public class LiczcnikCykliczny extends Licznik{

    int[] max;
    public LiczcnikCykliczny(int cyfry) {
        super(cyfry);
        max = new int[cyfry];
        for(int i=0; i<max.length;i++){
            max[i] = 3;
        }
    }

    public void impuls() throws Exception{
        if(Arrays.equals(max, licz)){
            super.ustaw(999);
        }
        else{
            super.impuls();
        }
    }

    
    
}
