import java.util.*;

public class LnkdHMap {
    static void main() {
        LinkedHashMap ogr = new LinkedHashMap();
        ogr.put("Ali", 90);
        ogr.put("Veli", 80);
        ogr.put("Ahmet", 75);

        Set set = ogr.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + " => " + item.getValue());
        }

//------------------------------------------------------------------------

        TreeMap m = new TreeMap();
        m.put("Ayşe", 90);
        m.put("Fatma", 100);
        m.put("Defne", 80);

        Set s = m.entrySet();
        Iterator itr = s.iterator();

        while (itr.hasNext()) {
            Map.Entry item = (Map.Entry) itr.next();
            System.out.println(item.getKey() + " => " + item.getValue());
        }
    }
}
