import java.util.Arrays;
public class MinPlatforms {
    /**
    * time complexity:
    * O(nlogn)
    * 
    * space:
    * o(1)
    * 
    */
    public static void main(String[] args){
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        System.out.println(calc(arr, dep));
    }
    public static int calc(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n1 = arr.length, n2=dep.length;
        int i=0,j=0, plat=0,max=0;

        while(i<n1 && j<n2) {
            if(arr[i]<dep[j]){
                plat++;
                i++;
            }else{
                plat--;
                j++;
            }
            if(plat>max){
                max=plat;
            }
        }

        return max;
    }
    
}