public class Asistan extends Akademisyenler{
    protected String yuksekLisans;

    public Asistan(String adSoyad, String eposta, String telefon, String bolum, String gorev, String dersler, String yuksekLisans) {
        super(adSoyad, eposta, telefon, bolum, gorev, dersler);
        this.yuksekLisans = yuksekLisans;
    }

    public  void dersSaati(int saat) {

    }

    protected void labGir() {
        System.out.println(this.adSoyad + "laba girdi");
    }

    protected void quizOku() {
        System.out.println(this.adSoyad + " quizleri okudu");
    }

    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }


}
