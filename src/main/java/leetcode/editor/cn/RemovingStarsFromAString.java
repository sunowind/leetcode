/**
 * 给你一个包含若干星号 * 的字符串 s 。
 * <p>
 * 在一步操作中，你可以：
 * <p>
 * <p>
 * 选中 s 中的一个星号。
 * 移除星号 左侧 最近的那个 非星号 字符，并移除该星号自身。
 * <p>
 * <p>
 * 返回移除 所有 星号之后的字符串。
 * <p>
 * 注意：
 * <p>
 * <p>
 * 生成的输入保证总是可以执行题面中描述的操作。
 * 可以证明结果字符串是唯一的。
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "leet**cod*e"
 * 输出："lecoe"
 * 解释：从左到右执行移除操作：
 * - 距离第 1 个星号最近的字符是 "leet**cod*e" 中的 't' ，s 变为 "lee*cod*e" 。
 * - 距离第 2 个星号最近的字符是 "lee*cod*e" 中的 'e' ，s 变为 "lecod*e" 。
 * - 距离第 3 个星号最近的字符是 "lecod*e" 中的 'd' ，s 变为 "lecoe" 。
 * 不存在其他星号，返回 "lecoe" 。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "erase*****"
 * 输出：""
 * 解释：整个字符串都会被移除，所以返回空字符串。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 10⁵
 * s 由小写英文字母和星号 * 组成
 * s 可以执行上述操作
 * <p>
 * <p>
 * Related Topics 栈 字符串 模拟 👍 94 👎 0
 */

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        Solution solution = new RemovingStarsFromAString().new Solution();
        System.out.println(solution.removeStars("leet**cod*e"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeStars(String s) {
            char[] chars = s.toCharArray();
            int top = 0;

            for (char c : chars) {
                if (c == '*') {
                    top--;
                } else {
                    chars[top++] = c;
                }
            }
            return new String(chars, 0, top);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}