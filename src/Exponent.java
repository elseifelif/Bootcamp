import java.util.Scanner;

public class Exponent {
    public static void main (String [] args) {
        int base, exponent;
        double result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban değerini yazınız.");
        base = scan.nextInt();
        System.out.println("Üs değerini yazınız.");
        exponent = scan.nextInt();
        if (exponent>0) {
            for (int i = 1; i<=exponent; i++) {
                result = result*base;
            }
        } else if (exponent==0) {
            result=1;
        } else {
            for (int j=exponent; j<=-1; j++) {
                result = result*base;
            }
            result = 1/result;
        }
        System.out.println("Sonuç: " + result);
    }
}
