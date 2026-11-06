import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void islemSecim() {
        System.out.println("\n1) Toplama\n2) Çıkarma\n3) Çarpma\n4) Bölme\n5) ÇIKIŞ");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                toplamHesaplama();
                break;
            case 2:
                farkHesaplama();
                break;
            case 3:
                carpımHesaplama();
                break;
            case 4:
                bolumHesaplama();
                break;
            case 5:
                son();
                break;
            default:
                System.out.println("Geçersiz Seçim!");
                son();
                break;
        }
    }

    public static void son() {
        System.out.println("======================================");
        System.out.println("işleminiz bitmiştir");
    }

    public static void baskaislem() {
        System.out.println("\nBaşka İşlem Yapmak İster misiniz? \n1) Evet \n2) Hayır");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                islemSecim();
                break;
            case 2:
                son();
                break;
            default:
                System.out.println("Geçersiz Seçim!");
                son();
        }
    }

    public static void toplamHesaplama() {
        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.println("Sonuç: " + (sayi1 + sayi2));
        baskaislem();
    }

    public static void farkHesaplama() {
        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.println("Sonuç: " + (sayi1 - sayi2));
        baskaislem();
    }

    public static void carpımHesaplama() {
        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.println("Sonuç: " + (sayi1 * sayi2));
        baskaislem();
    }

    public static void bolumHesaplama() {
        System.out.print("Bölünecek sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("Bölecek sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        double kusuratBolum = sayi1 / sayi2;
        System.out.println("Tam Sonuç: " + (sayi1 / sayi2));
        int bolum = (int) kusuratBolum;
        System.out.println("Küsüratsız Sonuç: " + bolum);
        double kalan = sayi1 % sayi2;
        System.out.println("Kalan: " + kalan);
        baskaislem();
    }

    public static void main(String[] args) {
        System.out.println("===HOŞGELDİNİZ===");
        islemSecim();
    }
}