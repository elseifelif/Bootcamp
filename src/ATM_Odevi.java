import java.util.Scanner;

public class ATM_Odevi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName;
        int password;
        int tercih = 0;
        int bakiye = 1000;
        int miktar = 0;
        int hataliIslem=3;

        while ((hataliIslem>0) && (tercih<4)) {
            System.out.println("Kullanıcı adınızı yazınız.");
            userName = scan.next();

            System.out.println("Şifrenizi yazınız.");
            password = scan.nextInt();

            if (userName.equals("patika") && (password == 123)) {
                System.out.println("Hoşgeldiniz");
                do {
                    System.out.println("Tercih ettiğiniz işlemi seçiniz:");
                    System.out.println("1- Para yatırma");
                    System.out.println("2- Para çekme");
                    System.out.println("3- Bakiye sorgulama");
                    System.out.println("4- Çıkış");
                    tercih = scan.nextInt();

                    switch (tercih) {
                        case 1:
                            System.out.println("Para miktarı:");
                            miktar = scan.nextInt();
                            bakiye += miktar;
                            break;
                        case 2:
                            System.out.println("Para miktarı:");
                            miktar = scan.nextInt();
                            bakiye -= miktar;
                            break;
                        case 3:
                            System.out.println("Bakiye bilgisi: " + bakiye);
                            break;
                        default:
                            break;

                    }
                } while (tercih != 4);
                System.out.println("İyi günler, tekrar görüşmek üzere.");
            } else {
                hataliIslem = hataliIslem-1;
                if (hataliIslem==0) {
                    System.out.println("Hesabınız bloke oldu.");
                } else {
                    System.out.println("Kullanıcı adı veya şifre bilgisi hatalıdır. Lütfen tekrar deneyiniz.");
                }
            }
        }
    }
}
