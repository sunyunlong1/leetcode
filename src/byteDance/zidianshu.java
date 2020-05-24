package byteDance;

public class zidianshu {
    public static int findKthNumber(int n, int k) {
        int curr = 1;
        k = k - 1;
        while (k > 0) {
            //计算前缀之间的step数
            int steps = getSteps(n, curr, curr + 1);
            //前缀间距太大，需要深入一层
            if (steps > k) {
                curr *= 10;
                //多了一个确定节点，继续-1
                k -= 1;
            }
            //间距太小，需要扩大前缀范围
            else {
                curr += 1;
                k -= steps;
            }
        }
        return curr;
    }

    private static int getSteps(int n, long curr, long next) {
        int steps = 0;
        while (curr <= n) {
            steps += Math.min(n + 1, next) - curr;
            curr *= 10;
            next *= 10;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(findKthNumber(13,3));
    }
}
