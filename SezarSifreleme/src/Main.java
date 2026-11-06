import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static String metinAlma() {
        System.out.print("Metin giriniz: ");
        return keyboard.nextLine();
    }

    public static int anahtarAlma() {
        System.out.print("Anahtar sayısını giriniz: ");
        int giris = keyboard.nextInt();
        int anahtar = giris % 26;
        return anahtar;
    }

    public static void metinGezme(String metin, int anahtar) {
        char[] harfler = metin.toCharArray();
        for (int i = 0; i < harfler.length; i++) {
            if (Character.isLetter(harfler[i])){
                char baslangic = Character.isUpperCase(harfler[i]) ? 'A' : 'a';
                int yeniDeger = (harfler[i] - baslangic + anahtar) % 26 + baslangic;
                harfler[i] = (char) yeniDeger;
            }
        }
        System.out.println(harfler);
    }

    public static void main(String[] args) {
        String metin = metinAlma();
        int anahtar = anahtarAlma();
        metinGezme(metin, anahtar);
    }











}
