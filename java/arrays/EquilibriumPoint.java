public class EquilibriumPoint {
    /**
    * time complexity:
    * 
    * 
    * space:
    * 
    * 
    */
    public static void main(String[] args){
        int[] arr = {1,3,5,2,2};

        System.out.println(calc1(arr));
    }
    public static int calc1(int[] arr){
        int sum=0,leftSum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(sum == leftSum){
                return i+1;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static int calc(int[] arr){
        int i=0,j=arr.length-1, s1=arr[i], s2=arr[j];
        while(i<j){
            System.out.println(s1+", "+s2+", "+i+", "+j);
            if(s1==s2){
                if(j-i == 2){
                    return i+1;
                }else{
                    return -1;
                }
            }else if(s1>s2){
                j--;
                s2 += arr[j];
            }else{
                i++;
                s1 += arr[i];
            }
        }
        return -1;
    }
}