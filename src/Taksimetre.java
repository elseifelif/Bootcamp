import java.util.Scanner;
public class Taksimetre {
    public static void main (String[] args) {
        int kilometre;
        double tutar;

        Scanner scan = new Scanner (System.in);
        System.out.println("Gidilen mesafe değerini km cinsinden yazınız.");

        kilometre=scan.nextInt();

        tutar = 10+(kilometre*2.2);
        boolean sonuc = tutar >= 20;

        String abc = String.valueOf(sonuc ? tutar : 20);
        System.out.println("Taksimetre Tutarı: "+abc);

    }
}
