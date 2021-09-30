import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= t; ++i) {
          System.out.println("Case #" + i + ": " + calc(scanner));
        }
    }
    public static int calc(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        int k=0;
        while(k < n) {
            arr[k++] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        return 0;


        // String s = scanner.next();
        
        // int[] larr = new int[n];
        // int[] rarr = new int[n];

        // int pos1i = -1, pos1j = -1;
        // for(int i=0, j=n-1; i<n; i++, j--) {
        //     if(conv(s, i) == 1) {
        //         pos1i = i;
        //     }
        //     if(conv(s, j) == 1) {
        //         pos1j = j;
        //     }
        //     larr[i] = pos1i;
        //     rarr[j] = pos1j;
        // }

        // int c = 0;
        // for(int i=0;i<n;i++) {
        //     if(conv(s, i) == 0) {
        //         int left = Math.abs(i - larr[i]), right = Math.abs(i - rarr[i]);
        //         if(larr[i] != -1 && rarr[i] != -1) {
        //             c += Math.min(left, right);
        //         }else if(larr[i] != -1) {
        //             c += left;
        //         }else if(rarr[i] != -1) {
        //             c += right;
        //         }
        //     }
        // }

        // return c;
    }
    private static int conv(String s, int i) {
        return Integer.parseInt(String.valueOf(s.charAt(i)));
    }
}