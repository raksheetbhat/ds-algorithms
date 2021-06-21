import java.util.Arrays;
public class RearrangeArrMaxMin {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(rearrange(arr)));
    }
    public static int[] rearrange(int[] arr){
        int n = arr.length, min_in = 0, max_in = n-1, me = arr[max_in] + 1;

        for(int i=0;i<n;i++){
            if(i%2 == 0){ //even
                arr[i] += arr[max_in] % me * me;
                max_in--;
            }else{
                arr[i] += arr[min_in] % me * me;
                min_in++;
            }
        }

        for(int i=0;i<n;i++){
            arr[i] = arr[i] / me;
        }

        return arr;
    }
}