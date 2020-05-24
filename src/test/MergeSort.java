package test;

/**
 * @ClassName MergeSort
 * @Decription TODO
 * @Auther Sunyunlong
 * @Date 2019-12-01 22:42
 * @Version 1.0
 **/
public class MergeSort {

    /**
     * 两路归并算法，两个排好序的子序列合并为一个子序列
     *
     * @param arr   待排序数组
     * @param left  左边界
     * @param mid   中间值
     * @param right 右边界
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        //辅助数组
        int[] tmp = new int[arr.length];
        //p1、p2是检测指针，k是存放指针
        int p1 = left, p2 = mid + 1, k = left;
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] <= arr[p2]) {
                tmp[k++] = arr[p1++];
            } else {
                tmp[k++] = arr[p2++];
            }
        }
        while (p1 <= mid) {
            //如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
            tmp[k++] = arr[p1++];
        }
        while (p2 <= right) {
            //同上
            tmp[k++] = arr[p2++];
        }
        //复制回原素组
        for (int i = left; i <= right; i++) {
            arr[i] = tmp[i];
        }
    }

    /**
     * 递归调用
     *
     * @param arr
     * @param start
     * @param end
     */
    public static void mergeSort(int[] arr, int start, int end) {
        //当子序列中只有一个元素时结束递归
        if (start < end) {
            //划分子序列
            int mid = (start + end) / 2;
            //对左侧子序列进行递归排序
            mergeSort(arr, start, mid);
            //对右侧子序列进行递归排序
            mergeSort(arr, mid + 1, end);
            //合并
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 39, 14, 55, 62, 74, 23, 47, 81, 95};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("排好序的数组：");
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
