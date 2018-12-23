package leetcode;

/**
 * 二分查找.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/19 22:41
 */

public class twoFind {

  public static void main(String[] args) {
    int a[] = {1,2,3,4};
    int i = find(a, 3);
    System.out.println(i);

  }

  public static int find(int[] a,int b){
    int left = 0;
    int right = a.length;
    int res = 0;
    while(left!=right+1){
      int mindle = (left+right)/2;
      if(a[mindle]>b){
        right = mindle;
      }
      if(a[mindle]<b){
        left = mindle;
      }
      if(a[mindle]==b){
        res = mindle;
        break;
      }
    }
    return res;
  }
}
