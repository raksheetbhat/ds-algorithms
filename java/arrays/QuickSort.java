import java.util.Arrays;
public class QuickSort {
    /**
     * time complexity:
     * best case: O(NlogN)
     * worst case: O(N2)
     * 
     * space:
     * in-place for array
     * memory - stack
     * best case: O(logN)
     * worst case: O(N)
     * 
     */
    public static void main(String[] args){
        int[] arr = {10,6,12,13,8,9,15,Integer.MAX_VALUE};

        int l = 0, h = arr.length-1;
        quicksort(arr, l, h);
        
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr, int l, int h){
        if(l < h){
            int j = partition(arr, l, h);
            quicksort(arr, l, j);
            quicksort(arr, j+1, h);
        }
    }
    public static int partition(int[] arr, int l, int h){
        int i=l, j=h, pivot=arr[l];
        while(i<j){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i < j){
                int t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        
        int p = arr[l];
        arr[l]=arr[j];
        arr[j]=p;

        return j;
    }
}