/**
 * 给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。
 * <p>
 * 如果存在这样的三元组下标 (i, j, k) 且满足 i < j < k ，使得 nums[i] < nums[j] < nums[k] ，返回 true ；
 * 否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [1,2,3,4,5]
 * 输出：true
 * 解释：任何 i < j < k 的三元组都满足题意
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [5,4,3,2,1]
 * 输出：false
 * 解释：不存在满足题意的三元组
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：nums = [2,1,5,0,4,6]
 * 输出：true
 * 解释：其中一个满足题意的三元组是 (3, 4, 5)，因为 nums[3] == 0 < nums[4] == 4 < nums[5] == 6
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 5 * 10⁵
 * -2³¹ <= nums[i] <= 2³¹ - 1
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能实现时间复杂度为 O(n) ，空间复杂度为 O(1) 的解决方案吗？
 * <p>
 * Related Topics 贪心 数组 👍 901 👎 0
 */

package leetcode.editor.cn;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        Solution solution = new IncreasingTripletSubsequence().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean increasingTriplet(int[] nums) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;

            for (int num : nums) {
                if(num <= first){
                    first = num;
                }else if (num <= second){
                    second = num;
                }else{
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}