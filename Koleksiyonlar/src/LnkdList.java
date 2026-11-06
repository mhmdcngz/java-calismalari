import java.util.*;

public class LnkdList {
    static void main() {

//        LinkedList list = new LinkedList();
//
//        list.add("Armut");
//        list.add("Çilek");
//        list.add("Kavun");
//
//        list.add(1, "Karpuz");
//
//        list.forEach(i -> System.out.println(i));

//------------------------------------------------------------------------

// - element() Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz.
// - offer(E o) Mümkünse, verilen öğeyi kuyruğa ekler.
// - peek() Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz. Kuyruk boşsa, null verir.
// - poll() Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar. Kuyruk bossa, null verir.
// - remove() Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar

        Queue q = new LinkedList();
        q.add("Deniz");
        q.add("Mehmet");

        q.offer("Ali");
        q.offer("Damla");

        q.forEach(i -> System.out.println(i));
        System.out.println();

        System.out.println("remove() : " + q.remove());
        System.out.println("element : " + q.element());
        System.out.println("peek : " + q.peek());
        System.out.println("pool : " + q.poll());

        System.out.println();
        q.forEach(i -> System.out.println(i));
    }
}
