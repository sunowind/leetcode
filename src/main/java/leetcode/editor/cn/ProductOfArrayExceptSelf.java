/**
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 * <p>
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在 32 位 整数范围内。
 * <p>
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: nums = [1,2,3,4]
 * 输出: [24,12,8,6]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: nums = [-1,1,0,-3,3]
 * 输出: [0,0,9,0,0]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 2 <= nums.length <= 10⁵
 * -30 <= nums[i] <= 30
 * 输入 保证 数组 answer[i] 在 32 位 整数范围内
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你可以在 O(1) 的额外空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组 不被视为 额外空间。）
 * <p>
 * Related Topics 数组 前缀和 👍 2126 👎 0
 */

package leetcode.editor.cn;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution solution = new ProductOfArrayExceptSelf().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] res = new int[nums.length];
            res[0] = 1;

            for (int i = 1; i < nums.length; i++) {
                res[i] = res[i - 1] * nums[i - 1];
            }

            int right = 1;
            for(int i = nums.length - 1; i >= 0; i--){
                res[i] = res[i] * right;
                right *= nums[i];
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}