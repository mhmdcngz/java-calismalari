public class Bilgiİslem extends  Memurlar{
    protected String gorev;

    public Bilgiİslem(String adSoyad, String eposta, String telefon, String departman, String mesai, String gorev) {
        super(adSoyad, eposta, telefon, departman, mesai);
        this.gorev = gorev;
    }

    protected void tarama() {
        System.out.println(this.adSoyad + " tarama yaptı");
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
