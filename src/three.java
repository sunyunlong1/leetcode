import java.util.HashMap;
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
    int i = lengthOfLongestSubstring("pwwkew");
    System.out.println(i);
  }

  public static int lengthOfLongestSubstring(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }
    int result = 0;
    int after = 0;
    int font = 0;
    char[] chars = s.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    while (after<chars.length&&font<chars.length) {
      if(map.containsKey(chars[after])){
        if(font<map.get(chars[after])+1){
          font = map.get(chars[after])+1;
        }
      }
      map.put(chars[after],after);
      after++;
      if(after-result>0){
        result = after-font;
      }
    }
    return result;
  }
}

//  public static int lengthOfLongestSubstring(String s) {
//    if (s == null || s.isEmpty()) {
//      return 0;
//    }
//    if (s.length() == 1) {
//      return 1;
//    }
//    char[] chars = s.toCharArray();
//    char[] newChar = new char[chars.length];
//    int sum = 1;
//    Map<Character,Integer> map = new HashMap<>();
//    for (int i = 0; i < chars.length; i++) {
//      newChar[i] = chars[i];
//      for (int j = 0; j < newChar.length; j++) {
//        if (i + 1 >= chars.length) {
//          return sum;
//        }
//        if (newChar[j] == chars[i + 1]) {
//          return sum;
//        }
//      }
//      sum++;
//    }
//    return sum;
//  }
