import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.util.Arrays;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    static Random rndm = new Random();

    static String[] sehirler = new String[81];
    static String secilenSehir;
    static char[] gorunenKelime;
    static char[] girilenHarfler = new char[20];
    static int girilenIndeks = 0;

    public static void sehirlerDosya() {
        try {
            Scanner input = new Scanner(new File("sehirler.txt"));

            int indeks = 0;
            while (input.hasNextLine() && indeks < sehirler.length) {
                sehirler[indeks] = input.nextLine();
                indeks++;
            }

            input.close();
        } catch (Exception e) {
            System.out.println("Dosya Okunamadı!");
        }
    }

    public static String sehirSecme() {
        int randomSayi = rndm.nextInt(sehirler.length);
        return sehirler[randomSayi];
    }

    public static void boslukYazma() {
        for (int i = 0; i < gorunenKelime.length; i++) {
            gorunenKelime[i] = '_';
        }

        for (int i = 0; i < gorunenKelime.length; i++) {
            System.out.print(gorunenKelime[i] + " ");
        }
        System.out.println();
    }

    public static String harfSorma() {
        System.out.print("Harf Giriniz: ");
        String girilenHarf = keyboard.next();
        return girilenHarf;
    }

    public static String harfAlma() {
        return String.valueOf(harfSorma().charAt(0)).toLowerCase();
    }

    public static void harfYerlestirme() {
        int sayac = 6;
        while (sayac > 0) {
            boolean varmi = false;
            char harf = harfAlma().charAt(0);

            boolean tekrarmi = false;
            for (int i = 0; i < girilenIndeks; i++) {
                if (girilenHarfler[i] == harf) {
                    tekrarmi = true;
                    break;
                }
            }

            if (tekrarmi) {
                System.out.println("Bu harf girildi farklı harf giriniz");
                continue;
            }

            girilenHarfler[girilenIndeks] = harf;
            girilenIndeks++;

            for (int i = 0; i < secilenSehir.length(); i++) {
                if (secilenSehir.charAt(i) == harf) {
                    gorunenKelime[i] = harf;
                    varmi = true;
                }
            }

            if (varmi) {
                System.out.println("Doğru Harf, Kalan Hak: " + sayac);
                System.out.println();

                for (int i = 0; i < gorunenKelime.length; i++) {
                    System.out.print(gorunenKelime[i] + " ");
                }
                System.out.println();
            } else {
                sayac--;
                System.out.println("Kelime yok, Kalan Hak: " + sayac);
            }

            boolean kazandi = true;
            for (int i = 0; i < gorunenKelime.length; i++) {
                if ((gorunenKelime[i] == '_')) {
                    kazandi = false;
                    break;
                }
            }

            if (kazandi) {
                System.out.println("Tebrikler Kazandınız");
                break;
            }

            if (sayac == 0) {
                System.out.println("Kaybettiniz, Kelime: " + secilenSehir);
            }

            System.out.println("Girilen Harfler: " + Arrays.toString(girilenHarfler));
        }
    }

    public static void oyunBaslat() {
        sehirlerDosya();
        secilenSehir = sehirSecme();
        gorunenKelime = new char[secilenSehir.length()];
        boslukYazma();
        harfYerlestirme();
    }

    public static void main(String[] args) {
        oyunBaslat();
    }
}