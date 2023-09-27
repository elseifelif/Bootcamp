import java.util.Scanner;
public class KullaniciGirisi {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String kullanici, sifre, yeniSifre;
        int tercih;
        System.out.println("Kullanıcı adını yazınız.");
        kullanici = scan.nextLine();

        System.out.println("Şifreyi yazınız.");
        sifre = scan.nextLine();

        if ((kullanici.equals("patika")) && (sifre.equals("java123"))) {
            System.out.println("Sisteme giriş yaptınız.");
        } else {
            System.out.println("Kullanıcı adı veya şifre bilgisi hatalı.");
            System.out.println("Şifreyi değiştirecek misiniz? " +
                    "1 (evet) veya 0 (hayır) şeklinde cevabınızı yazınız.");
            tercih = scan.nextInt();

            if (tercih==0) {
                System.out.println("Şifre değişikliği tercih edilmedi.");
            }
            else if (tercih==1) {
                System.out.println("Yeni şifrenizi yazınız.");
                yeniSifre = scan.next();
                if (yeniSifre.equals("java123")) {
                    System.out.println("Şifre değiştirilemedi, lütfen farklı bir şifre yazınız.");
                } else {
                    System.out.println("Şifre değiştirildi.");
                }
            } else {
                    System.out.println("Hatalı seçim yapıldı.");
                }
            }
        }
    }


