import java.util.Arrays;
public class WoodcutterProblem {
    /**
     * Given an integer K and an array, height[] where height[i] denotes the height of the ith tree in a forest. 
     * The task is to make a cut of height X from the ground such that exactly K unit wood is collected
     * 
     * time complexity
     * O(nlogn)
     * 
     * space
     * o(1)
     * 
     */
    public static void main(String[] args){
        int[] arr = {4,42,40,26,46};
        int v = 8;

        System.out.println(woodcutSearch(arr, v));

        // int[] res = woodcutSearch(arr, v);
        // System.out.println(Arrays.toString(res));
        // if(res[0] != 0){
        //     System.out.println(res[0]);
        // }else{
        //     int l = res[1], r = res[2];

        //     int[] arr1 = new int[r-l];
        //     for(int i=l+1, k=0;i<r;i++,k++){
        //         arr1[k] = i;
        //     }

        //     System.out.println(Arrays.toString(arr1));

        //     System.out.println(Arrays.toString(woodcutSearch(arr1, v)));
        // }
    }
    public static int woodcutSearch(int[] arr, int v){
        Arrays.sort(arr);

        int i=0, j=arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            int wood = collectWood(arr, mid);

            if(wood == v){
                return arr[mid];
            }else if(wood > v) {
                i = mid+1;
            }else{
                j = mid-1;
            }
        }

        return -1;
    }
    public static int collectWood(int[] arr, int m) {
        int sum = 0;
        for(int i=m+1;i<arr.length;i++){
            sum += arr[i] - arr[m];
        }
        return sum;
    }
}