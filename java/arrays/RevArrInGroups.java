import java.util.Arrays;
public class RevArrInGroups {
    /**
    * time complexity:
    * 
    * 
    * space:
    * 
    */
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k=3;

        calc(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void calc(int[] arr, int k){
        int l=0,r=k-1,n=arr.length;
        for(int i=0;i<(int)Math.ceil(n*1.0/k);i++){
            
            rev(arr, l, r);
            l+=k;
            r = r+k<n ? r+k : n-1;
        }
    }
    public static void rev(int[] arr, int l, int r){
        System.out.println(l+", "+r);
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;

            l++;
            r--;
        }
    }
}