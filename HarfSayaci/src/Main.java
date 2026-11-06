import java.util.Scanner;

public class Main {
    static char[] sessizHarfler = {'b', 'c', 'ç', 'd', 'f', 'g', 'ğ', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 'ş', 't', 'v', 'y', 'z'};

    static Scanner keyboard = new Scanner(System.in);
    static int sayacSessiz = 0;

    public static String metinAlma() {
        System.out.print("Metin giriniz: ");
        String metin = keyboard.nextLine();
        return metin.toLowerCase();
    }

    public static boolean harfGezme(char harf) {
        for (char s : sessizHarfler) {
            if (s == harf) {
                return true;
            }
        }
        return false;
    }

    public static void metinGezme(String metin) {
        for (char karakter : metin.toCharArray()) {
            if (Character.isLetter(karakter)) {
                if (harfGezme(karakter)) {
                    sayacSessiz++;
                }
            }
        }
    }

    public static void main() {
        String metin = metinAlma();
        metinGezme(metin);
        System.out.println("Metindeki sessiz harf sayısı: " + sayacSessiz);
        System.out.println(metin);
    }
}