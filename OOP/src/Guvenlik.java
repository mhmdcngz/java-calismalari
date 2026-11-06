public class Guvenlik extends Memurlar{
    protected String belge;

    public Guvenlik(String adSoyad, String eposta, String telefon, String departman, String mesai, String belge) {
        super(adSoyad, eposta, telefon, departman, mesai);
        this.belge = belge;
    }

    protected void nobet() {
        System.out.println(this.adSoyad + " nöbet tutuyor");
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
}
