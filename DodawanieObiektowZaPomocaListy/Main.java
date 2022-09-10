import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Obiekt> obiekty = new ArrayList<Obiekt>();

        for(int i=0; i<10; i++){
            obiekty.add(new Obiekt(i));
        }
        for(Obiekt i : obiekty){
            System.out.println(i.toString());
        }
    }
}