import java.util.*;

public class LHSet {
    static void main() {
        LinkedHashSet gunler = new LinkedHashSet();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        gunler.add(null);
        gunler.add(true);
        gunler.add(12);

        gunler.forEach(item -> System.out.print(item + ", "));
    }
}
