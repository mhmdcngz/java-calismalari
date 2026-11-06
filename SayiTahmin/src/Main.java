import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static int rastgelesayi() {
        Random rndm = new Random();
        int rastgeleSayi = rndm.nextInt(101);
        return rastgeleSayi;
    }

    public static void tahminEtme() {
        int sayi = rastgelesayi();
        int tahmin = 0;
        int denemeSayisi = 0;
        while (sayi != tahmin) {
            System.out.print("Tahmin Giriniz: ");
            tahmin = input.nextInt();
            System.out.println();

            if (tahmin < sayi) {
                System.out.println("Tahmininizi arttırın");
            } else if (tahmin > sayi) {
                System.out.println("Tahmininizi azaltın");
            }
            denemeSayisi++;
        }

        System.out.println("TEBRİKLER DOĞRU CEVAP");
        System.out.println("Deneme Sayısı: " + denemeSayisi);
    }

    public static void main(String[] args) {
        tahminEtme();
    }

}