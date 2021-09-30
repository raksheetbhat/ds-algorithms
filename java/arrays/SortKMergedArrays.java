import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;
public class SortKMergedArrays {
    /**
     * time complexity
     * O(Nklogk)
     * 
     * space
     * O(k)
     * 
     */
    public static void main(String[] args){
        int[][] grid = {
            {1, 10, 11, 15},
            {2, 4, 9, 14},
            {5, 6, 8, 16},
            {3, 7, 12, 13},
        };

        System.out.println(foo(grid));
    }

    public static List<Integer> foo(int[][] grid) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Map<Integer, Pair<Integer, Integer>> map = new HashMap<>();

        int n = grid.length, k = grid[0].length;

        for(int i=0;i<k;i++) {
            q.add(grid[i][0]);
            map.put(grid[i][0], new Pair<>(i, 0));
        }

        while(res.size() < n*k && !q.isEmpty()) {
            int val = q.poll();
            res.add(val);

            Pair<Integer, Integer> p = map.get(val);
            int xi = p.getKey();
            int yi = p.getValue();
            yi++;

            if(yi >= n) continue;

            q.add(grid[xi][yi]);

            map.remove(val);
            map.put(grid[xi][yi], new Pair<>(xi, yi));
        }

        return res;
    }
}

class Pair<K, V> {
    K k;
    V v;

    Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    K getKey() {
        return this.k;
    }

    V getValue() {
        return this.v;
    }

    public String toString() {
        return "["+getKey()+", "+getValue()+"]";
    }
}