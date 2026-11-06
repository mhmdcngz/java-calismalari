import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    static Random rndm = new Random();
    static int[][] oturmaDuzeni;
    static int satir, sutun, alan;

    public static void siraOlusturma() {
        System.out.print("Yatay sıra sayısını giriniz: ");
        satir = keyboard.nextInt();
        System.out.print("Dikey sıra sayısını giriniz: ");
        sutun = keyboard.nextInt();

        oturmaDuzeni = new int[satir][sutun];
    }

    public static void siraDoldurma() {
        int rastgeleSatir, rastgeleSutun, sayac = 0;
        alan = satir * sutun;

        while (sayac != (alan * 4) / 5) {
            rastgeleSatir = rndm.nextInt(satir);
            rastgeleSutun = rndm.nextInt(sutun);

            if (oturmaDuzeni[rastgeleSatir][rastgeleSutun] == 0) {
                oturmaDuzeni[rastgeleSatir][rastgeleSutun] = 1;
                sayac++;
            }
        }
        System.out.println(sayac);
    }

    public static void diziYazma() {
        for (int i = 0; i < oturmaDuzeni.length; i++) {
            for (int j = 0; j < oturmaDuzeni[0].length; j++) {
                System.out.print(oturmaDuzeni[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void doluSayisi() {
        int enDoluSayisi = 0, enDoluIndeksi = 0;

        for (int i = 0; i < oturmaDuzeni.length; i++) {
            int siraDoluluk = 0;
            for (int j = 0; j < oturmaDuzeni[0].length; j++) {
                if (oturmaDuzeni[i][j] == 1) {
                    siraDoluluk++;
                }
            }
            System.out.printf("%d. Satır dolu sıra sayısı: %d\n", i+1, siraDoluluk);

            if (siraDoluluk > enDoluSayisi) {
                enDoluSayisi = siraDoluluk;
                enDoluIndeksi = i;
            }
        }
        System.out.println("\nEn dolu sıranın indeksi: " + enDoluIndeksi);
        System.out.println("En dolu sıra sayısı: " + enDoluSayisi);
    }





    public static void main(String[] args) {
        siraOlusturma();
        siraDoldurma();
        diziYazma();
        doluSayisi();
    }


}