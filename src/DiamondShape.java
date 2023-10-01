import java.util.Scanner;
public class DiamondShape {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        int sayi;
        System.out.println("Lütfen bir sayı yazınız.");
        sayi = scan.nextInt();
        int x=sayi;
        int sayac=0;
        int sayac2=0;
        int y= (2*(sayi-1)-1);

        for (int i=1; i<=sayi; i++) {
            for (int j=x-1; j>=1; j--){
                System.out.print(" ");
            }
            x--;
            sayac++;
            for (int n=1; n<=(sayac*2-1); n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=sayi-1; i++){
            sayac2++;
            for (int j=1; j<=sayac2; j++) {
                System.out.print(" ");
            }
            for (int n=y; n>=1; n--) {
                System.out.print("*");
            }
            y=y-2;
            System.out.println();
        }

    }
}
