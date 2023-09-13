import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main (String[] args) {
        double kilo, boy;

        Scanner scan = new Scanner (System.in);
        System.out.println("Kilo bilgisini kg cinsinden yazınız.");
        kilo=scan.nextDouble();

        System.out.println("Boy bilgisini m cinsinden yazınız.");
        boy=scan.nextDouble();

        System.out.println("Vücut kitle indeksi: "+ (kilo/(boy*boy) ));


    }
}
