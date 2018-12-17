package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb" 输出: 3 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。 示例 2:
 *
 * 输入: "bbbbb" 输出: 1 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。 示例 3:
 *
 * 输入: "pwwkew" 输出: 3 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/13 19:48
 */

public class three {

  public static void main(String[] args) {
    int i = lengthOfLongestSubstring("tmmxzud");
    System.out.println(i);
  }

  public static int lengthOfLongestSubstring(String s) {
    if(s==null||s.length()==0){
      return 0;
    }
    int res = 0;
    HashSet set = new HashSet();
    int pre = 0 ;
    int last = 0;
    while(last<s.length()){
      if(set.contains(s.charAt(last))){
        set.remove(s.charAt(pre));
        pre++;
      }else{
        set.add(s.charAt(last++));
        res = Math.max(res,last-pre);
      }
    }
    return res;
  }
}
