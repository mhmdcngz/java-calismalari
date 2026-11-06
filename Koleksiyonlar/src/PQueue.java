import java.util.*;

public class PQueue {
    static void main() {

// - element() Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz.
// - offer(E o) Mümkünse, verilen öğeyi kuyruğa ekler.
// - peek() Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz. Kuyruk boşsa, null verir.
// - poll() Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar. Kuyruk bossa, null verir.
// - remove() Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar

        Queue q = new PriorityQueue();
        q.add(80);
        q.add(20);
        q.add(10);
        q.add(50);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
