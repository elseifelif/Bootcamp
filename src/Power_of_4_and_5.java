import java.util.Scanner;

public class Power_of_4_and_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı yazınız.");
        int sayi = scan.nextInt();
        System.out.println("0 ile " + sayi + " arasında olan 4'ün kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) {
            if (i != 1) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

        System.out.println("0 ile " + sayi + " arasında olan 5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 5) {
            if (i != 1) {
                System.out.print(i + " ");
            }

        }

    }
}
