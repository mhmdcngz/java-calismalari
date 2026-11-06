public class Main {
    static void main() {
        Ogretmen o = new Ogretmen("Ogretmen", "ogretmen@gmail.com" , "05XXXXXXXXX", "ogretmen muh", "ders ver", "algo", "prof");

        Guvenlik g = new Guvenlik("guvenlik", "guvenlik@gmail.com", "05XXXXXXXXX", "a blok" , "gündüz", "usta");

        //Calisan c = new Calisan("Çalışsan" , "calisan@gmail.com", "05XXXXXXXXX");
        //Calisan[] girisListesi = {o, g ,c};
        //Calisan.girisYapanlar(girisListesi);

        System.out.println(o.giris());
        o.dersSaati(11);
    }
}