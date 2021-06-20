import java.util.Arrays;
class WaterProb{
    public static void main(String[] args){
        int[] arr = {2,1,0,3,2,1,2};

        System.out.println(prob(arr));
    }
    public static int prob(int[] arr){
        int[] left = maxArr(arr, 0), right = maxArr(arr, 1);
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < left[i] && arr[i] < right[i]){
                sum += Math.min(left[i], right[i]) - arr[i];
            }
        }
        
        return sum;
    }
    public static int[] maxArr(int[] arr, int dir) {
        int[] maxAr = new int[arr.length];
        int n = arr.length;
        if(n == 1) return arr;
        if(dir == 0){ //from left
            int max = arr[0];
            for(int i=0;i<n;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
                maxAr[i] = max;
            }
        }else{ //from right
            int max = arr[n-1];
            for(int i=n-1;i>=0;i--){
                if(arr[i] > max){
                    max = arr[i];
                }
                maxAr[i] = max;
            }
        }
        return maxAr;
    }
}