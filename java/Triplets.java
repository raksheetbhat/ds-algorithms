import java.util.Map;
import java.util.HashMap;
class Triplets{
    public static void main(String[] args){
        int[] arr = {1,5,3,2};

        System.out.println(triplet(arr));
    }
    public static int triplet(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, n = arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i], 1);
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int s = arr[i] + arr[j];
                if(map.containsKey(s)){
                    count++;
                }
            }
        }
        return count;
    }
}