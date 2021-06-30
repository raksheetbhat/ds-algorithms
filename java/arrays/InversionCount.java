import java.util.Arrays;
public class InversionCount {
    /**
     * time complexity:
     * O(nlogn)
     * 
     * space:
     * O(n)
     * 
     */
    public static void main(String[] args){
        int[] arr = {1, 20, 6, 4, 5};

        System.out.println(inversion(arr, 0, arr.length-1));
    }
    public static int inversion(int[] arr, int l, int r) {
        int count = 0;
        if(l<r) {
            int m = (l+r)/2;
            count += inversion(arr, l, m);
            count += inversion(arr, m+1, r);

            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }
    public static int mergeAndCount(int[] arr, int l, int m, int r) {
        int n1 = m-l+1, n2 = r-m;
        int[] L = Arrays.copyOfRange(arr, l, m+1);
        int[] R = Arrays.copyOfRange(arr, m+1, r+1);

        int ic = 0, i=0,j=0,k=l;

        while(i<n1 && j<n2) {
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
                ic += (m+1) - (i+l);
            }
            k++;
        }

        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        return ic;
    }
}