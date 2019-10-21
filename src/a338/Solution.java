package a338;

/**
 * @ClassName Solution
 * @Decription TODO
 * @Auther mac
 * @Date 2019-10-18 16:06
 * @Version 1.0
 **/
public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for (int i = 1; i <= num; i++) {
            int x = i & (i-1);
            result[i] = result[i&(i-1)] + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().countBits(5);
        for(int i : ints){
            System.out.println(i);
        }
    }
}
