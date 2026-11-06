public class Ogretmen extends Akademisyenler{
    protected String unvan;

    public Ogretmen(String adSoyad, String eposta, String telefon, String bolum, String gorev, String dersler, String unvan) {
        super(adSoyad, eposta, telefon, bolum, gorev, dersler);
        this.unvan = unvan;
    }

    public  void dersSaati(int saat) {
        System.out.println("ders saati: " + saat);
    }

    protected String giris() {
        return this.unvan + " " + super.giris();
    }

    protected void toplantiGir() {
        System.out.println(this.adSoyad + " toplantıya girdi");
    }

    protected void sinavOku() {
        System.out.println(this.adSoyad + " sınavları okudu");
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
