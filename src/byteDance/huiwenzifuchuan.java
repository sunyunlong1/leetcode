package byteDance;

public class huiwenzifuchuan {

    public static void main(String[] args) {
        String s = "babad";
        String s1=longestPalindrome(s);
        System.out.println(s1);
    }

    public static String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 0;
        String res = "";
        for(int j = 0;j<s.length();j++){
            for(int i=0;i<=j;i++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-1 < i+1 || dp[i+1][j-1]);
                if(dp[i][j]){
                    if(max < j-i+1){
                        max = j-i+1;
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}
