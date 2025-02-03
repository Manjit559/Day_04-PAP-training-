import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);

        System.out.println("Head of Queue : " + p.peek());
    }
}
