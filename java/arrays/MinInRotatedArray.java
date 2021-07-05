public class MinInRotatedArray {
    /**
     * Suppose a sorted array A is rotated at some pivot unknown to you beforehand. Find the minimum element.
     * 
     * time complexity
     * o(logn)
     * 
     * space
     * o(1)
     * 
     */
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4}; //{4,5,6,7,0,1,2};

        System.out.println(min(arr));
    }
    public static int min(int[] arr){
        int i=0,j=arr.length-1,ans=arr[0];
        while(i<=j) {
            int mid = (i+j)/2;
            if(arr[mid] > arr[0]) {
                i=mid+1;
            }else{
                ans=arr[mid];
                j=mid-1;
            }
        }
        return ans;
    }
}