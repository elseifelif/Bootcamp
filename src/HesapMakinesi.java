import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, islem;

        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayıyı yazınız.");
        sayi1 = scan.nextInt();

        System.out.println("2. sayıyı yazınız.");
        sayi2 = scan.nextInt();

        System.out.println(" 1: Toplama \n 2: Çıkarma \n 3: Çarpma \n 4: Bölme");
        islem= scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplama işlemi sonucu: " + (sayi1 + sayi2));
                break;

            case 2:
                System.out.println("Çıkarma işlemi sonucu: " + (sayi1 - sayi2));
                break;

            case 3:
                System.out.println("Çarpma işlemi sonucu: " + (sayi1 * sayi2));
                break;

            case 4:
                if (sayi2!=0) {
                System.out.println("Bölme işlemi sonucu: " + (sayi1 / sayi2));
                break;
                } else {
                System.out.println("Sayı 0'a bölünemez.");
                break;
                }
            default:
                System.out.println("Hatalı seçim yapıldı.");

        }

    }
}
