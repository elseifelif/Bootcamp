import java.util.Scanner;

public class TekSayi {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        do {
            System.out.println("Bir sayı yazınız.");
            sayi = scan.nextInt();
            if (sayi%4==0) {
                toplam += sayi;
            }


        } while (sayi%2!=1);

        System.out.println("Tek sayı yazılana kadar giriş yapılan sayılardan " +
                "4 ile bölünebilenlerin toplamı: "+ toplam);

    }

}
