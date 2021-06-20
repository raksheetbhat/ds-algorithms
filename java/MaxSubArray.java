class MaxSubArray{
    //also called Kadane's algo
    public static void main(String[] args){
        int[] arr = {1,2,-3,-2,5,7,-2};

        System.out.println(kadane(arr));
    }
    public static int kadane(int[] arr){
        int c = arr[0], g = arr[0];
        for(int i=1;i<arr.length;i++){
            c = Math.max(arr[i], arr[i] + c);
            if(c > g){
                g = c;
            }
        }
        return g;
    }

}