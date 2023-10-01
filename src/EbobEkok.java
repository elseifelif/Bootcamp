import java.util.Scanner;
public class EbobEkok {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("1. sayıyı yazınız.");
        int sayi1 = scan.nextInt();
        System.out.println("2. sayıyı yazınız.");
        int sayi2 = scan.nextInt();
        int i=1, j=1, x=1;
        int ebob=1;
        int ekok=1;
        if (sayi1<=sayi2) {
            while (sayi1 >=i) {
                if (sayi1%i==0 && sayi2%i==0) {
                    ebob=i;
                }
                i++;
            }
        } else {
            while (sayi2>=j) {
                if(sayi1%j==0 && sayi2%j==0) {
                    ebob =j;
                }
                j++;
            }
        }
        System.out.println("Ebob: "+ebob);

       while (x<(sayi2*sayi1)) {
           if (x%sayi2==0 && x%sayi1==0) {
               ekok=x;
               break;
           }
           x++;
        }
        System.out.println("Ekok: "+ekok);
    }
}
