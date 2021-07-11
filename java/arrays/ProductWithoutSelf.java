import java.util.Arrays;
public class ProductWithoutSelf {
    /**
     * time complexity
     * O(n)
     * 
     * space
     * iterative: O(N)
     * recursive: O(1)
     * 
     */
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        //iterative(arr);
        recursive(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void iterative(int[] arr){
        int n = arr.length;
        int[] left = new int[n], right = new int[n];

        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * arr[i-1];
        }

        right[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1] * arr[i+1];
        }

        for(int i=0;i<n;i++){
            arr[i] = left[i] * right[i];
        }
    }
    public static void recursive(int[] arr) {
        prod(arr, 1, 0);
    }
    public static int prod(int[] arr, int prodLeft, int i) {
        int n = arr.length;

        if(i == n){
            return 1;
        }

        int curr = arr[i];

        int prodRight = prod(arr, prodLeft * curr, i+1);

        arr[i] = prodLeft * prodRight;

        return prodRight * curr;
    }
}