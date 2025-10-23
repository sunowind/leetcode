/**
 * 有一个自行车手打算进行一场公路骑行，这条路线总共由 n + 1 个不同海拔的点组成。自行车手从海拔为 0 的点 0 开始骑行。
 * <p>
 * 给你一个长度为 n 的整数数组 gain ，其中 gain[i] 是点 i 和点 i + 1 的 净海拔高度差（0 <= i < n）。请你返回 最高点的海拔
 * 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：gain = [-5,1,5,0,-7]
 * 输出：1
 * 解释：海拔高度依次为 [0,-5,-4,1,1,-6] 。最高海拔为 1 。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：gain = [-4,-3,-2,-1,4,3,2]
 * 输出：0
 * 解释：海拔高度依次为 [0,-4,-7,-9,-10,-6,-3,-1] 。最高海拔为 0 。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * n == gain.length
 * 1 <= n <= 100
 * -100 <= gain[i] <= 100
 * <p>
 * <p>
 * Related Topics 数组 前缀和 👍 117 👎 0
 */

package leetcode.editor.cn;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        Solution solution = new FindTheHighestAltitude().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestAltitude(int[] gain) {
            int currentHeight = 0;
            int maxLength = 0;
            for(int i = 0; i < gain.length; i++){
                currentHeight += gain[i];
                maxLength = Math.max(maxLength, currentHeight);
            }

            return maxLength;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}