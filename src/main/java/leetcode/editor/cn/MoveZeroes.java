/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: nums = [0]
 * 输出: [0]
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * <p>
 * 1 <= nums.length <= 10⁴
 * -2³¹ <= nums[i] <= 2³¹ - 1
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能尽量减少完成的操作次数吗？
 * <p>
 * Related Topics 数组 双指针 👍 2745 👎 0
 */

package leetcode.editor.cn;

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        solution.moveZeroes(new int[]{0,1,0,3,12});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int left = 0;

            for ( int right = 0; right < nums.length; right++) {
                if (nums[right] != 0) {
                    if(left != right){
                        swap(nums, left, right);
                    }
                    left++;
                }
            }
        }

        private void swap(int[] nums, int i , int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}