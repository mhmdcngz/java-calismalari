import java.util.*;

public class Hset {
    static void main() {
        HashSet h = new HashSet();
        h.add("12 str");
        h.add(12);
        h.add(12.0);
        h.add(true);
        h.add(null);

        h.remove(null);
        //System.out.println(h.size());
        System.out.println("----------------------------");

        Iterator itr = h.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("----------------------------");

        h.forEach(item -> System.out.println(item + " "));
    }
}
