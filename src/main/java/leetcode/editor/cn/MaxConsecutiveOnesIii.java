/**
 * 给定一个二进制数组 nums 和一个整数 k，假设最多可以翻转 k 个 0 ，则返回执行操作后 数组中连续 1 的最大个数 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * 输出：6
 * 解释：[1,1,1,0,0,1,1,1,1,1,1]
 * 粗体数字从 0 翻转到 1，最长的子数组长度为 6。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
 * 输出：10
 * 解释：[0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * 粗体数字从 0 翻转到 1，最长的子数组长度为 10。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 10⁵
 * nums[i] 不是 0 就是 1
 * 0 <= k <= nums.length
 * <p>
 * <p>
 * Related Topics 数组 二分查找 前缀和 滑动窗口 👍 805 👎 0
 */

package leetcode.editor.cn;

public class MaxConsecutiveOnesIii {
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnesIii().new Solution();
        System.out.println(solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int left = 0;

            int maxLength = 0;
            int zeroCount = 0;

            for(int right = 0; right < nums.length; right++){
                if(nums[right] == 0){
                    zeroCount++;
                }
                while(zeroCount > k){
                    if(nums[left] == 0){
                        zeroCount--;
                    }
                    left++;
                }
                maxLength = Math.max(maxLength, right - left + 1);
            }
            return maxLength;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}