import java.util.Scanner;
public class KucuktenBuyugeSiralama {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int a,b,c;
        System.out.println("a sayısını (1. sayı) yazınız.");
        a = scan.nextInt();

        System.out.println("b sayısını (2. sayı) yazınız.");
        b = scan.nextInt();

        System.out.println("c sayısını (3. sayı) yazınız.");
        c = scan.nextInt();

        System.out.print("Küçükten büyüğe sıralama: ");
        if (a<b && a<c) {
            if(b<c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        }

        else if (b<a && b<c) {
            if (a<c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        }
        else {
            if(b<a) {
                System.out.println("c<b<a");
            } else {
                System.out.println("c<a<b");
            }
        }
    }
}
