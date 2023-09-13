import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main (String[] args) {
        double armut, elma, domates, muz, patlican, toplamTutar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Aşağıdaki ürünlerin kg bilgisni yazınız.");

        System.out.print("Armut: ");
        armut=scan.nextDouble();

        System.out.print("Elma: ");
        elma=scan.nextDouble();

        System.out.print("Domates: ");
        domates=scan.nextDouble();

        System.out.print("Muz: ");
        muz=scan.nextDouble();

        System.out.print("Patlıcan: ");
        patlican=scan.nextDouble();

        toplamTutar= (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
        System.out.println("Toplam Tutar: " + toplamTutar);


    }
}
