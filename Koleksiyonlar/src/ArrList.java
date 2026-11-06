import java.util.*;

public class ArrList {
    static void main() {

        ArrayList ulkeler = new ArrayList();
        ulkeler.add("Ankara");
        ulkeler.add("Siirt");
        ulkeler.add("Bolu");
        ulkeler.add("Ankara");

        ulkeler.add(0, "İstanbul");
        ulkeler.remove(1);

        ulkeler.forEach(item -> System.out.println(item));
    }
}
