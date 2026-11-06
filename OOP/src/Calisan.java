public class Calisan {
    String adSoyad, eposta, telefon;

    public Calisan(String adSoyad, String eposta, String telefon) {
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    protected String giris() {
        return this.adSoyad + " giriş yaptı";
    }

    protected void cikis() {
        System.out.println("Çalışan Çıkış yaptı");
    }

    protected void yemek() {
        System.out.println("Çalışan yemek yedi");
    }

    public static void girisYapanlar(Calisan[] girisYapanlar) {
        for (Calisan c: girisYapanlar) {
            System.out.println(c.giris());
        }
    }

}
