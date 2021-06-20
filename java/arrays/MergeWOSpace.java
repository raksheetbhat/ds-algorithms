import java.util.Arrays;
public class MergeWOSpace {
    public static void main(String[] args){
        int[] s = {0,3,5,7};
        int[] l = {1,2,6,8,9};

        System.out.println(Arrays.toString(merge(s, l)));
    }
    public static int[] merge(int[] s, int[] l) {
        int n = s.length, m=l.length;
        
        for(int i=0;i<n;i++){
            if(s[i] > l[0]){
                int t = s[i];
                s[i] = l[0];
                l[0] = t;

                Arrays.sort(l);
            }
        }

        int[] res = new int[n+m];
        System.arraycopy(s, 0, res, 0, n);
        System.arraycopy(l, 0, res, n, m);

        return res;
    }
}