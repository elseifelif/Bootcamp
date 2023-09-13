import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args){
        double alan;
        final double PI=3.14;
        int r, aciDegeri;
        Scanner scan = new Scanner (System.in);
        System.out.println("Yarıçap değerini yazınız.");
        r=scan.nextInt();
        System.out.println("Açı ölçüsünü yazınız.");
        aciDegeri = scan.nextInt();
        alan = PI*r*r;
        System.out.println("Merkez açısı "+ aciDegeri+ " derece olan " +r+
                " birim yarıçaplı daire diliminin alanı: " + ((alan*aciDegeri)/360));

    }
}