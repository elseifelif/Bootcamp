import java.util.Scanner;
public class UcgeninAlani {

    public static void main (String[] args) {
        int a,b,c;
        double ucgeninAlani;

        Scanner scan = new Scanner (System.in);
        System.out.println("Üçgenin 1. kenar uzunluğunu yazınız.");
        a=scan.nextInt();
        System.out.println("Üçgenin 2. kenar uzunluğunu yazınız.");
        b=scan.nextInt();
        System.out.println("Üçgenin 3. kenar uzunluğunu yazınız.");
        c=scan.nextInt();
        double u = (a+b+c)/2;
        ucgeninAlani = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı: "+ ucgeninAlani);

    }
}
