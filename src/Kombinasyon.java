import java.util.Scanner;
public class Kombinasyon {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int nFaktoriyel=1, rFaktoriyel=1, faktoriyel=1;
        System.out.println("Kümenin eleman sayısını yazınız.");
        int n= scan.nextInt();

        System.out.println("Kombinasyonun eleman sayısını yazınız.");
        int r=scan.nextInt();

        for (int i=1; i<=n; i++) {
            nFaktoriyel *= i;
        }

        for (int j=1; j<=r; j++) {
            rFaktoriyel *=j;
        }

        for (int x=1; x<=n-r; x++) {

            faktoriyel *= x;
        }

        System.out.println(n+" elemanlı bir kümenin "+r+" elemanlı kombinasyon sayısı:");

        System.out.println("C(" +n+ "," +r+ ")="+ nFaktoriyel/((rFaktoriyel)*faktoriyel));
    }
}
