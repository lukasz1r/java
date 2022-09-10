import java.util.ArrayList;

public class Kalkulator_z_pamiecia extends Kalkulator_zwykly {
    
    double wynik;
    ArrayList<Double> pamiec = new ArrayList<Double>();

    public double logarytm10(double arg){
        wynik = log10(arg);
        pamiec.add(wynik);
        if(pamiec.size()>10){
            pamiec.remove(0);
        }
        return wynik;
    }
    // public double logarytm10(double arg){
    //     pom = "log10_" + arg;
    //     licznik = 0;
    //     for(String i : dzialania){
    //         if(i.equals(pom)){
    //             wynik = pamiec.get(licznik);
    //             break;
    //         }
    //         else{
    //             dzialania.add(pom);
    //             wynik = log10(arg);
    //             pamiec.add(wynik);             
    //         }
    //         licznik++;
    //     }

    //     dzialania.add("log10_" + arg);
    //     wynik = log10(arg);
    //     pamiec.add(wynik);
    //     if(pamiec.size()>10){
    //         pamiec.remove(0);
    //     }
    //     return wynik;
    // }

    public double potegowanie(double arg1, double arg2){
        wynik = potega(arg1, arg2);
        pamiec.add(wynik);
        if(pamiec.size()>10){
            pamiec.remove(0);
        }
        return wynik;
    }

    public void posprzataj(){
        pamiec.clear();
    }
}
