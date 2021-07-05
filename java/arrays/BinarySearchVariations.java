public class BinarySearchVariations {
    /**
    * time complexity:
    * o(logn)
    * 
    * space:
    * o(1)
    */
    public static void main(String[] args){
        int[] arr = {2,6,9,15,21,40,45};
        int v = 17;

        System.out.println(firstLarger(arr, v));

        int[] arr1 = {1,1,1,1,0,0,0,0}; //1 = good, 2 = bad
        System.out.println(firstBadOccurrence(arr1));
    }
    public static int firstLarger(int[] arr, int v) {
        int i=0, j=arr.length-1, ans=-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]<v){
                i = mid+1;
            }else{
                ans = arr[mid];
                j = mid-1;
            }
        }
        return ans;
    }
    public static int firstBadOccurrence(int[] arr){
        int i=0,j=arr.length-1,ans=-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == 1) {
                i=mid+1;
            }else{
                ans = mid;
                j=mid-1;
            }
        }
        return ans;
    }
}