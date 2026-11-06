import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static char[] metinAlma() {
        System.out.print("Parantezlerden oluşan bir metin giriniz:");
        String metin = keyboard.nextLine();
        return metin.toCharArray();
    }

    public static boolean parantezKontrol(char[] metin) {
        int sayac = 0;
        for (char s : metin) {
            if (s == '(') {
                sayac++;
            } else if (s == ')') {
                sayac--;
            }

            if (sayac < 0) {
                return false;
            }
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        char[] metin = metinAlma();

        if (parantezKontrol(metin)) {
            System.out.println("Tebrikler!");
        } else {
            System.out.println("Yanlış düzen");
        }
    }
}
