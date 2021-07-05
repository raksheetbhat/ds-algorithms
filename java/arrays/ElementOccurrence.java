public class ElementOccurrence {
    /**
     * Given a sorted array of integers, find the number of occurrences of a given target value.
     * 
     * time complexity
     * o(logn) - occ()
     * o(logn+n) ~ o(n) - occ2()
     * 
     * space
     * o(1)
     * 
     */
    public static void main(String[] args){
        int[] arr = {8,8,8,8,8};
        int v = 8;

        System.out.println(occ(arr, v));
    }
    public static int occ(int[] arr, int v){
        int i=0,j=arr.length-1,gt=arr.length,lt=-1;
        
        //find first ele greater than v
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] > v){
                gt = mid;
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        i=0;j=arr.length-1;

        //find first ele less than v
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] < v){
                lt = mid;
                i = mid + 1;
            }else{
                j = mid-1;
            }
        }

        return gt - lt - 1;
    }
    public static int occ2(int[] arr, int v) {
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == v){
                int c=1;
                int x = mid-1, y=mid+1;
                while(x>=i){
                    if(arr[x] == v){
                        c++;
                        x--;
                    }else{
                        break;
                    }
                }
                while(y<=j){
                    if(arr[y] == v){
                        c++;
                        y++;
                    }else{
                        break;
                    }
                }
                return c;
            }else if(arr[mid] < v){
                i = mid+1;
            }else{
                j = mid - 1;
            }
        }
        return 0;
    }
}