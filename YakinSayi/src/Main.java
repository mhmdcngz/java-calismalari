import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    static int diziBoyutu;
    static int[] alinanDizi;

    public static void boyutAlma() {
        System.out.print("Yazacağınız dizinin boyutunu giriniz: ");
        diziBoyutu = keyboard.nextInt();
        alinanDizi = new int[diziBoyutu];
    }

    public static void diziYazma() {
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print("Sayı giriniz: ");
            alinanDizi[i] = keyboard.nextInt();
        }
    }

    public static void yakinBulma() {
        int kucukFark = Integer.MAX_VALUE;

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < diziBoyutu; i++) {
            for (int j = i + 1; j < diziBoyutu; j++) {
                int fark = Math.abs(alinanDizi[i] - alinanDizi[j]);

                if (fark < kucukFark) {
                    kucukFark = fark;
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.println("En yakın çift:");
        System.out.println("İndeksler: " + index1 + ", " + index2);
        System.out.println("Değerler: " + alinanDizi[index1] + ", " + alinanDizi[index2]);
        System.out.println("Fark: " + kucukFark);
    }




    public static void main(String[] args) {
        boyutAlma();
        diziYazma();
        yakinBulma();
    }
}
