/**
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 * <p>
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "IceCreAm"
 * <p>
 * <p>
 * 输出："AceCreIm"
 * <p>
 * 解释：
 * <p>
 * s 中的元音是 ['I', 'e', 'e', 'A']。反转这些元音，s 变为 "AceCreIm".
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "leetcode"
 * <p>
 * <p>
 * 输出："leotcede"
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 3 * 10⁵
 * s 由 可打印的 ASCII 字符组成
 * <p>
 * <p>
 * Related Topics 双指针 字符串 👍 381 👎 0
 */

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new ReverseVowelsOfAString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
            char[] chars = s.toCharArray();

            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                while(left < right && !vowels.contains(chars[left])){
                    left++;
                }
                while(left < right && !vowels.contains(chars[right])){
                    right--;
                }
                if(left < right){
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
            }
            return new String(chars);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}