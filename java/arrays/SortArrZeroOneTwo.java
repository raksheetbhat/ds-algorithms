import java.util.Arrays;
public class SortArrZeroOneTwo {
    /**
     * time complexity:
     * O(n)
     * 
     * space:
     * O(1)
     * 
    */
    public static void main(String[] args){
        int[] arr = {0,1,1,0,2,1,2,0,2};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        int l=0, mid=0, h=arr.length-1;

        while(mid < h){
            if(arr[mid]==0){
                swap(arr, l, mid);
                l++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                swap(arr, mid, h);
                h--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j]=t;
    }
}