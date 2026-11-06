import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static int sayi;

    public static void sayiAlma() {
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        System.out.println();
    }

    public static void isaretBulma() {
        if (sayi < 0) {
            System.out.println("Negatif");
        } else if (sayi == 0) {
            System.out.println("Sıfır");
        } else {
            System.out.println("Pozitif");
        }
    }

    public static void tekCift() {
        if ((sayi % 2) == 0) {
            System.out.println("Çift");
        } else {
            System.out.println("Tek");
        }
    }

    public static void basamakSayisi() {
        int basamakSayisi = 0;
        int temp = sayi;
        while (temp != 0) {
            temp = temp / 10;
            basamakSayisi++;
        }
        System.out.println("Basamak Sayısı: " + basamakSayisi);
    }

    public static void tersCevirme() {
        int cevrilmisSayi = 0;
        int temp = sayi;
        while (temp > 0) {
            int rakam = temp % 10;
            cevrilmisSayi = cevrilmisSayi * 10 + rakam;
            temp = temp / 10;
        }
        System.out.println("Ters çevrilmiş hali: " + cevrilmisSayi);
    }

    public static void basamakToplam() {
        int temp = sayi;
        int toplam = 0;
        while (temp != 0) {
            int basamak = temp % 10;
            toplam += basamak;
            temp = temp / 10;
        }
        System.out.println("Basamaklar toplamı: " + toplam);
    }

    public static void basamakCarpim() {
        int temp = sayi;
        int carpim = 1;
        while (temp != 0) {
            int basamak = temp % 10;
            carpim *= basamak;
            temp = temp / 10;
        }
        System.out.println("Basamaklar Çarpımı: " + carpim);
    }

    public static void buyukBasamak() {
        int temp = sayi;
        int enBuyuk = 0;
        int basamak = 0;
        while (temp != 0) {
            basamak = temp % 10;
            if (basamak > enBuyuk) {
                enBuyuk = basamak;
            }
            temp = temp / 10;
        }
        System.out.println("En büyük basamak: " + enBuyuk);
    }

    public static void kucukBasamak() {
        int temp = sayi;
        int enKucuk = 100000;
        int basamak = 0;
        while (temp != 0) {
            basamak = temp % 10;
            if (basamak < enKucuk) {
                enKucuk = basamak;
            }
            temp = temp / 10;
        }
        System.out.println("En küçük basamak: " + enKucuk);
        System.out.println();
    }

    public static void main(String[] args) {

        sayiAlma();
        isaretBulma();
        tekCift();
        basamakSayisi();
        tersCevirme();
        basamakToplam();
        basamakCarpim();
        buyukBasamak();
        kucukBasamak();
    }
}
