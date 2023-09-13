import java.util.Scanner;

public class NotOrtalamasi {

    public static void main (String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;
        int toplam;
        double ortalama;


        Scanner scan = new Scanner (System.in);
        System.out.println("Matematik notunu yazınız.");
        matematik=scan.nextInt();

        System.out.println("Fizik notunu yazınız.");
        fizik=scan.nextInt();

        System.out.println("Kimya notunu yazınız.");
        kimya=scan.nextInt();

        System.out.println("Türkçe notunu yazınız.");
        turkce=scan.nextInt();

        System.out.println("Tarih notunu yazınız.");
        tarih=scan.nextInt();

        System.out.println("Müzik notunu yazınız.");
        muzik=scan.nextInt();

        toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        ortalama = toplam/6.0;

        System.out.println("Not Ortalaması " + ortalama);
        boolean sonuc = ortalama >60;

        String abc = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(abc);

    }
}