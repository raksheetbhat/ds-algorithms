import java.util.Arrays;
class RotMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{0,0,0}, {0,1,0}, {1,1,1}};
        int[][] arr2 = {{1,1,1}, {0,1,0}, {0,0,0}};
        System.out.println(findRotation(arr1, arr2));
    }
    public static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] rot = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rot[j][n-i-1] = mat[i][j];
            }
        }
        return rot;
    }
    public static boolean compare(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int[][] rot = mat;
        for(int i=0;i<4;i++){
            System.out.println(i);
            System.out.println(Arrays.deepToString(rot));
            System.out.println(Arrays.deepToString(target));
            boolean flag = compare(rot, target);
            System.out.println(flag);
            if(flag){
                return true;
            }
            rot = rotate(rot);
        }
        return false;
    }
}