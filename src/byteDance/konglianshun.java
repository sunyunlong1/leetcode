package byteDance;


// 解题思路：
//   原问题等价于，有序的正整数中取三个，最大最小差值小于等于D
//   假设三个张最大的为max，依次遍历max值取a[i](i>=2)的可能性与可能情况数目。

import java.util.Scanner;

public class konglianshun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //建筑物的个数
        int N=sc.nextInt();
        //距最远的两名特工间的距离不超过D
        int D=sc.nextInt();
        //定义一个数组来接收位置
        int[] dest=new int[N];
        for (int i=0; i < N; i++) {
            dest[i]=sc.nextInt();
        }
        long i=new Solution().totalNum(dest, D);
        System.out.println(i);
    }
}

class Solution {
    private final int mod=99997867;
    private long ans=0;

    public long totalNum(int[] dest, int D) {
        for (int i=0, j=0; i < dest.length; i++) {
            //因为有三个特工嘛，所以i>=2的时候取dist[2]是第三个特工
            //这时候j=0，dist[i]-dist[j]>D是比较最近和最远的距离

            while (i >= 2 && (dest[i] - dest[j]) > D)
                j++;
            //满足距离小于等于D的时候，个数加一
            ans+=computeCount(i - j);
        }
        //最后结果可能溢出，所以对mod取模
        return ans % mod;
    }

    public long computeCount(long n) {
        return n * (n - 1) / 2;
    }
}