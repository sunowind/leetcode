  /**
对于字符串 s 和 t，只有在 s = t + t + t + ... + t + t（t 自身连接 1 次或多次）时，我们才认定 “t 能除尽 s”。 

 给定两个字符串 str1 和 str2 。返回 最长字符串 x，要求满足 x 能除尽 str1 且 x 能除尽 str2 。 

 

 示例 1： 

 
输入：str1 = "ABCABC", str2 = "ABC"
输出："ABC"
 

 示例 2： 

 
输入：str1 = "ABABAB", str2 = "ABAB"
输出："AB"
 

 示例 3： 

 
输入：str1 = "LEET", str2 = "CODE"
输出：""
 

 

 提示： 

 
 1 <= str1.length, str2.length <= 1000 
 str1 和 str2 由大写英文字母组成 
 

 Related Topics 数学 字符串 👍 463 👎 0

*/
  
  package leetcode.editor.cn;
  public class GreatestCommonDivisorOfStrings{
      public static void main(String[] args) {
           Solution solution = new GreatestCommonDivisorOfStrings().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int minLen = Math.min(str1.length(), str2.length());
        for (int i = minLen; i >= 1; i--) {
            String subStr = str1.substring(0, i);
            if(isDivisible(str1, subStr) && isDivisible(str2, subStr)){
                return subStr;
            }
        }

        return "";
    }

    public boolean isDivisible(String str, String subStr) {
        int lenX = str.length() / subStr.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lenX; i++) {
            sb.append(subStr);
        }
        return sb.toString().equals(str);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }