/**
 * 给你一个字符数组 chars ，请使用下述算法压缩：
 * <p>
 * 从一个空字符串 s 开始。对于 chars 中的每组 连续重复字符 ：
 * <p>
 * <p>
 * 如果这一组长度为 1 ，则将字符追加到 s 中。
 * 否则，需要向 s 追加字符，后跟这一组的长度。
 * <p>
 * <p>
 * 压缩后得到的字符串 s 不应该直接返回 ，需要转储到字符数组 chars 中。需要注意的是，如果组长度为 10 或 10 以上，则在 chars 数组中会被拆
 * 分为多个字符。
 * <p>
 * 请在 修改完输入数组后 ，返回该数组的新长度。
 * <p>
 * 你必须设计并实现一个只使用常量额外空间的算法来解决此问题。
 * <p>
 * 注意：数组中超出返回长度的字符无关紧要，应予忽略。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：chars = ["a","a","b","b","c","c","c"]
 * 输出：返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
 * 解释："aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：chars = ["a"]
 * 输出：返回 1 ，输入数组的前 1 个字符应该是：["a"]
 * 解释：唯一的组是“a”，它保持未压缩，因为它是一个字符。
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * 输出：返回 4 ，输入数组的前 4 个字符应该是：["a","b","1","2"]。
 * 解释：由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= chars.length <= 2000
 * chars[i] 可以是小写英文字母、大写英文字母、数字或符号
 * <p>
 * <p>
 * Related Topics 双指针 字符串 👍 441 👎 0
 */

package leetcode.editor.cn;

public class StringCompression {
    public static void main(String[] args) {
        Solution solution = new StringCompression().new Solution();
        System.out.println(solution.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int compress(char[] chars) {

            int left = 0;
            int right = 0;
            int n = chars.length;
            while (right < n) {
                char currentChar = chars[right];
                int count = 0;
                while (right < n && currentChar == chars[right]) {
                    right++;
                    count++;
                }
                chars[left++] = currentChar;

                if (count > 1) {
                    int anchor = left;
                    while(count > 0){
                        chars[left++] = (char) (count % 10 + '0');
                        count /= 10;
                    }
                    reverse(chars, anchor, left - 1);
                }
            }
            return left;
        }

        private void reverse(char[] chars, int left, int right){
            while (left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}