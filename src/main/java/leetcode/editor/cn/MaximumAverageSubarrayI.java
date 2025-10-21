/**
 * 给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
 * <p>
 * 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
 * <p>
 * 任何误差小于 10⁻⁵ 的答案都将被视为正确答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [1,12,-5,-6,50,3], k = 4
 * 输出：12.75
 * 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [5], k = 1
 * 输出：5.00000
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * n == nums.length
 * 1 <= k <= n <= 10⁵
 * -10⁴ <= nums[i] <= 10⁴
 * <p>
 * <p>
 * Related Topics 数组 滑动窗口 👍 422 👎 0
 */

package leetcode.editor.cn;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Solution solution = new MaximumAverageSubarrayI().new Solution();
        System.out.println(solution.findMaxAverage(new int[]{0,4,0,3,2}, 1));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int current = 0;
            for(int i = 0; i < k; i++){
                current += nums[i];
            }

            int maxValue = current;
            for(int i = k; i < nums.length; i++){
                current += nums[i] - nums[i - k];
                maxValue = Math.max(maxValue, current);
            }
            return (double) maxValue / k;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}