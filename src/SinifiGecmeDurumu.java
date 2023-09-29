import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main (String[] args) {

        int  sayac =0;
        int  toplam =0;
        Scanner scan = new Scanner (System.in);

        int matematik, turkce, fizik, kimya, muzik;

        System.out.println("Matematik notunuzu yazınız.");
        matematik = scan.nextInt();

        System.out.println("Türkçe notunuzu yazınız.");
        turkce = scan.nextInt();

        System.out.println("Fizik notunuzu yazınız.");
        fizik = scan.nextInt();

        System.out.println("Kimya notunuzu yazınız.");
        kimya = scan.nextInt();

        System.out.println("Müzik notunuzu yazınız.");
        muzik = scan.nextInt();

        /*Kullanıcının yazdığı sayı 0'dan küçükse veya 100'den büyükse
         ilgili ders notu ortalamaya katılmıyor. */

        if (matematik>100 || matematik<0) {
            sayac++;
        } else
        {
            toplam = toplam + matematik;
        }

        if (turkce>100 || turkce<0) {
            sayac++;
        } else {
            toplam = toplam + turkce;
        }

        if (fizik>100 || fizik<0) {
            sayac++;
        } else {
            toplam = toplam + fizik;
        }

        if (kimya>100 || kimya<0) {
            sayac++;
        } else {
            toplam = toplam + kimya;
        }

        if (muzik>100 || muzik<0) {
            sayac++;
        } else {
            toplam = toplam + muzik;
        }

        double average = toplam /(5-sayac);

        System.out.println("Ortalama: " + average);

        if (average >=55) {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        } else {
            System.out.println("Malesef sınıfta kaldınız.");
        }

    }
}
