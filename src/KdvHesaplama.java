import java.util.Scanner;

public class KdvHesaplama {

    public static void main (String[] args) {
        int kdvsizFiyat;
        double kdvTutari, kdvliFiyat;
        Scanner scan = new Scanner (System.in);

        System.out.println("Ürün fiyatını yazınız.");
        kdvsizFiyat= scan.nextInt();

        if (kdvsizFiyat<1000 && kdvsizFiyat>=0) {
            kdvTutari = kdvsizFiyat * 0.18;
        } else if (kdvsizFiyat>=1000)

        {
            kdvTutari = kdvsizFiyat*0.08;
        } else
        {
            System.out.println("Lütfen 0'dan büyük bir değer yazınız.");
            kdvTutari=0;
        }

        kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("Ürünün KDV tutarı: "+ kdvTutari);
        System.out.println("Ürünün KDV'li fiyatı: "+kdvliFiyat);

    }
}
