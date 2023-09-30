import java.util.Scanner;

public class BasamakSayilari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı yazınız.");
        int sayi = scan.nextInt();
        int kalan;
        int toplam = 0;

        while (sayi != 0) {
            kalan = sayi % 10;
            toplam = toplam + kalan;
            sayi = sayi / 10;

        }

        System.out.println("Sayının basamakları toplamı: " + toplam);

    }
}
