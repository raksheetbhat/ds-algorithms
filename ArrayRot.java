import java.util.Arrays;
class ArrayRot{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7}; //3,4,5,6,7,1,2
        int d = 2;

        System.out.println(Arrays.toString(rot(arr, d)));
    }
    public static int[] rot(int[] arr, int d){
        int n = arr.length;
        int g = gcd(n, d);
        for(int i=0, j=0, k=0, temp = 0;i<g;i++){
            temp = arr[i];
            j = i;
            while(true){
                k = j+d;
                if(k >= n){
                    k = k-n;
                }
                if(k == i){
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }
    public static int gcd(int n, int k){
        if(k==0) return n;
        return gcd(k,n%k);
    }
}