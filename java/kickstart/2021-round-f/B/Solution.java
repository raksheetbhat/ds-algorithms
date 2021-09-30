import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = scanner.nextInt();
        //scanner.next();
        for (int i = 1; i <= t; ++i) {
          System.out.println("Case #" + i + ": " + calc(scanner));
        }
    }
    public static int calc(Scanner scanner) {
      int D = scanner.nextInt();
      int N = scanner.nextInt();
      int K = scanner.nextInt();
      scanner.nextLine();

      Map<Integer, Integer[]> map = new HashMap<>();
      int[] attr = new int[N];
      
      for(int i=0;i<N;i++) {
        String str = scanner.nextLine();
        int[] y = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        int h = y[0], s = y[1], e = y[2];

        map.put(h, new Integer[]{s, e});
        attr[i] = h;
      }

      Arrays.sort(attr);

      int maxsum=0;
      for(int i=1;i<=D;i++) {
        int j=attr.length-1, sum=0, k=K;
        while(k > 0 && j>=0) {
          int key = attr[j];
          Integer[] vals = map.get(key);
          if(i >= vals[0] && i<=vals[1]) {
            sum += key;
            k--;
          }
          j--;
        }
        if(sum > maxsum) {
          maxsum = sum;
        }
      }
      
      return maxsum;
    }
}