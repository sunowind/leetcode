/**
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * <p>
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * <p>
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * <p>
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 * <p>
 * 测试用例保证输出的长度不会超过 10⁵。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "3[a2[c]]"
 * 输出："accaccacc"
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：s = "2[abc]3[cd]ef"
 * 输出："abcabccdcdcdef"
 * <p>
 * <p>
 * 示例 4：
 * <p>
 * <p>
 * 输入：s = "abc3[cd]xyz"
 * 输出："abccdcdcdxyz"
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 30
 * <p>
 * s 由小写英文字母、数字和方括号
 * '[]' 组成
 * s 保证是一个 有效 的输入。
 * s 中所有整数的取值范围为
 * [1, 300]
 * <p>
 * <p>
 * Related Topics 栈 递归 字符串 👍 2085 👎 0
 */

package leetcode.editor.cn;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Solution solution = new DecodeString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String decodeString(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == ']') {
                    StringBuilder sb = new StringBuilder();
                    while (!stack.isEmpty() && stack.peek() != '[') {
                        sb.append(stack.pop());
                    }
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    StringBuilder num = new StringBuilder();
                    while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                        num.append(stack.pop());
                    }
                    int repeat = Integer.parseInt(num.reverse().toString());
                    String revserdStringBuilder = sb.reverse().toString();
                    for (int i = 0; i < repeat; i++) {
                        for (char ch : revserdStringBuilder.toCharArray()) {
                            stack.push(Character.valueOf(ch));
                        }
                    }
                } else {
                    stack.push(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}