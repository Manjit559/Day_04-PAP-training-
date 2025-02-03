import java.util.*;

public class Main {
    private static int find(int[] gifts, int k) {
        Queue<Integer> q = new PriorityQueue<>((a, b) -> (b - a));
        
        for (int gift : gifts) {
            q.offer(gift);
        }
        
        while (k > 0) {
            int g = q.poll();
            int ins = (int) Math.sqrt(g);
            q.offer(ins);
            k--;
        }
        
        int ans = 0;
        while (!q.isEmpty()) {
            ans += q.poll();
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] gifts = {25, 64, 9, 4, 100}; 
        int k = 4;
        System.out.println(find(gifts, k));
    }
}
