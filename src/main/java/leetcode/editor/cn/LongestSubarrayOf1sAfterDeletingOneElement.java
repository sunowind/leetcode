/**
 * 给你一个二进制数组 nums ，你需要从中删掉一个元素。
 * <p>
 * 请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。
 * <p>
 * 如果不存在这样的子数组，请返回 0 。
 * <p>
 * <p>
 * <p>
 * 提示 1：
 * <p>
 * <p>
 * 输入：nums = [1,1,0,1]
 * 输出：3
 * 解释：删掉位置 2 的数后，[1,1,1] 包含 3 个 1 。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [0,1,1,1,0,1,1,0,1]
 * 输出：5
 * 解释：删掉位置 4 的数字后，[0,1,1,1,1,1,0,1] 的最长全 1 子数组为 [1,1,1,1,1] 。
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：nums = [1,1,1]
 * 输出：2
 * 解释：你必须要删除一个元素。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 10⁵
 * nums[i] 要么是 0 要么是 1 。
 * <p>
 * <p>
 * Related Topics 数组 动态规划 滑动窗口 👍 214 👎 0
 */

package leetcode.editor.cn;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        Solution solution = new LongestSubarrayOf1sAfterDeletingOneElement().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestSubarray(int[] nums) {
            int maxLen = 0;
            int left = 0;
            int zeroCount = 0;

            for (int right = 0; right < nums.length; right++){
                if(nums[right] == 0){
                    zeroCount++;
                }

                while(zeroCount > 1){
                    if(nums[left] == 0){
                        zeroCount--;
                    }
                    left++;
                }
                maxLen = Math.max(maxLen, right - left);
            }

            return maxLen;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}