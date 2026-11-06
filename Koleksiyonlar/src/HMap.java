import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HMap {
    static void main() {

// - clear() Map içinde bulunan bütün degerleri siler ..
// - get (Object key) Anahtara karşılık gelen objeyi döndürür.
// - put (Object key, Object value): Anahtar - değer ikilisini kayıt eder.

        HashMap b = new HashMap();
        b.put("Türkiye", "Ankara");
        b.put("Fransa", "Paris");
        b.put("İngiltere", "Londra");

        Set s = b.entrySet();
        Iterator i = s.iterator();

        while (i.hasNext()) {
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + " => " + item.getValue());
        }

        System.out.println(b.get("Fransa"));

    }
}
