public abstract class Akademisyenler extends Calisan {
    protected String bolum, gorev, dersler;
    ;

    public Akademisyenler(String adSoyad, String eposta, String telefon, String bolum, String gorev, String dersler) {
        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.gorev = gorev;
        this.dersler = dersler;
    }

    public abstract void dersSaati(int saat);

    protected String giris() {
        return super.giris() + " A Kapısından";
    }

    protected void derseGir() {
        System.out.println(this.adSoyad + "Derse girdi");
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public String getDersler() {
        return dersler;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }
}
