public class Ogrenci {
    public static Ogrenci ara(String id) throws OgrenciArama {
        if (id.equals("123")) {
            return new Ogrenci();
        } else {
            throw new OgrenciArama("Öğrenci bulunamadı");
        }
    }
}
