import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;
        System.out.println("0'dan büyük bir sayı yazınız.");
        int sayi = scan.nextInt();

        int sayac2 =0;

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac2++;
                if(sayac2==1) System.out.println ("0'dan " + sayi + " değerine kadar olan sayılardan " +
                        "3 ve 4 ile bölünenler:");
                sayac++;
                System.out.print(i+" ");
                toplam += i;
            }
        }
        System.out.println();
        if (sayi < 0) {
            System.out.println("Hatalı sayı girişi, lütfen 0'dan büyük bir sayı yazınız.");
        } else {
            if (sayac == 0) {
                System.out.println("12 ile tam bölünen sayı bulunamadı.");
            } else {
                int ortalama = toplam / sayac;
                System.out.println("Sayıların ortalaması: " + ortalama);

            }

        }
    }
}
