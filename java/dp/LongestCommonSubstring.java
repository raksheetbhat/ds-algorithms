public class LongestCommonSubstring {
    /**
     * time complexity
     * O(n^2)
     * 
     * space
     * O(n^2)
     * 
     */
    public static void main(String[] args){
        String s1 = "zxabcdezy", s2 = "yzabcdezx";

        System.out.println(lcs(s1, s2));
    }
    public static int lcs(String s1, String s2) {
        int maxc = 0;
        int n1 = s1.length(), n2 = s2.length();
        int[][] grid = new int[n1+1][n2+1];
        
        for(int i=1;i<=n1;i++) {
            for(int j=1;j<=n2;j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    grid[i][j] = grid[i-1][j-1] + 1;
                    maxc = Math.max(grid[i][j], maxc);
                }else{
                    grid[i][j] = 0;
                }
            }
        }

        return maxc;
    }
}