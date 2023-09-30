import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı yazınız.");
        int n = scan.nextInt();
        double toplam = 0;

        for (double i = 1; i <= n; i++) {
            toplam = toplam + (1.0 / i);
        }
        System.out.println("1'den " + n + " sayısına kadar olan harmonik serinin toplamı: " + toplam);

    }
}
