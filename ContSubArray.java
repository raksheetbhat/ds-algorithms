import java.util.Arrays;
class ContSubArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,7,6}; //{1,2,3,7,5};
        int s = 15;

        //System.out.println(Arrays.toString(subarray(arr, s)));
        System.out.println(Arrays.toString(slidingWindow(arr, s)));
    }
    public static int[] subarray(int[] arr, int sum) {
        int n = arr.length;
        int[] ans = {-1,-1};
        for(int i=0;i<n-1;i++){
            int s=0,k=i;
            while(s <= sum && k < n){
                s += arr[k];
                if(s == sum){
                    ans[0]=i+1;
                    ans[1]=k+1;
                    return ans;
                }
                k++;
            }
        }
        return ans;
    }
    public static int[] slidingWindow(int[] arr, int sum){
        int n = arr.length, s = 0, k=0;
        int[] ans = {-1,-1};
        for(int i=0;i<n;i++){
            s += arr[i];
            while(s > sum && k<n){
                s -= arr[k];
                k++;
            }
            if(s == sum){
                ans[0]=k;
                ans[1]=i;
                return ans;
            }
        }
        return ans;
    }
}