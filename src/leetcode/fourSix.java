package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3] 输出: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/24 9:38
 */

public class fourSix {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    List<List<Integer>> permute = permute(nums);
    for (List<Integer> list : permute) {
      System.out.println(list.toString());
    }
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> l1 = new ArrayList<Integer>();
    l1.add(nums[0]);
    result.add(l1);
    for (int i = 1; i < nums.length; i++) {
      List<List<Integer>> resultx = new ArrayList<List<Integer>>();
      for (List<Integer> list : result) {
        for (int j = 0; j <= list.size(); j++) {
          List<Integer> list2 = new ArrayList<Integer>();
          list2.addAll(list);
          list2.add(j, nums[i]);
          resultx.add(list2);
        }
      }
      result = resultx;
    }
    return result;
  }
}
