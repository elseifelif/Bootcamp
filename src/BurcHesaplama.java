import java.util.Scanner;

public class BurcHesaplama {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean hataliSayi = true;

            System.out.println("Ay ve gün bilgisini yazınız.");
            System.out.println("Ay: ");
            int ay = scan.nextInt();
            System.out.println("Gün: ");
            int gun = scan.nextInt();


            if (ay == 1 && gun <= 31 && gun >= 1) {
                if (gun <= 21) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
                hataliSayi = false;
            }

            if (ay == 2 && gun <= 28 && gun >= 1) {
                if (gun <= 19) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }
                hataliSayi = false;
            }

            if (ay == 3 && gun <= 31 && gun >= 1) {
                if (gun <= 20) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
                hataliSayi = false;
            }

            if (ay == 4 && gun <= 30 && gun >= 1) {
                if (gun <= 20) {
                    System.out.println("Koç Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
                hataliSayi = false;
            }

            if (ay == 5 && gun <= 31 && gun >= 1) {
                if (gun <= 21) {
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                }
                hataliSayi = false;
            }


            if (ay == 6 && gun <= 30 && gun >= 1) {
                if (gun <= 22) {
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
                hataliSayi = false;
            }


            if (ay == 7 && gun <= 31 && gun >= 1) {
                if (gun <= 22) {
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
                hataliSayi = false;
            }


            if (ay == 8 && gun <= 31 && gun >= 1) {
                if (gun <= 22) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
                hataliSayi = false;
            }


            if (ay == 9 && gun <= 30 && gun >= 1) {
                if (gun <= 22) {
                    System.out.println("Başak Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
                hataliSayi = false;
            }

            if (ay == 10 && gun <= 31 && gun >= 1) {
                if (gun <= 22) {
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
                hataliSayi = false;
            }

            if (ay == 11 && gun <= 30 && gun >= 1) {
                if (gun <= 21) {
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
                hataliSayi = false;
            }

            if (ay == 12 && gun <= 31 && gun >= 1) {
                if (gun <= 21) {
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Oğlak Burcu");
                }
                hataliSayi = false;
            }

            if (hataliSayi) {
                System.out.println("Sayı girişi hatalıdır, lütfen gün ve ay bilgisini tekrar yazınız.");
            }

        }
    }
