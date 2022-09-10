public class Kalkulator{
    public static void main(String[] args) {
        
        Kalkulator_z_pamiecia kalkPam = new Kalkulator_z_pamiecia();   
            kalkPam.logarytm10(100);
            kalkPam.potegowanie(2, 3);
            kalkPam.logarytm10(1000);
            kalkPam.potegowanie(2, 4);
            kalkPam.logarytm10(10000);
            kalkPam.potegowanie(2, 5);
            kalkPam.logarytm10(100000);
            kalkPam.potegowanie(2, 6);
            kalkPam.logarytm10(1000000);
            kalkPam.potegowanie(2, 3);
            //11
            kalkPam.potegowanie(9, 2);
        System.out.println(kalkPam.pamiec);
        kalkPam.posprzataj();
        System.out.println(kalkPam.pamiec);

        
    }
}