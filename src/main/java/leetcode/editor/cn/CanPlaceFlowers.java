/**
 * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * <p>
 * 给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则的情
 * 况下种入 n 朵花？能则返回 true ，不能则返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：flowerbed = [1,0,0,0,1], n = 1
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：flowerbed = [1,0,0,0,1], n = 2
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= flowerbed.length <= 2 * 10⁴
 * flowerbed[i] 为 0 或 1
 * flowerbed 中不存在相邻的两朵花
 * 0 <= n <= flowerbed.length
 * <p>
 * <p>
 * Related Topics 贪心 数组 👍 779 👎 0
 */

package leetcode.editor.cn;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution solution = new CanPlaceFlowers().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;

            for (int i = 0; i < flowerbed.length; i++){
                if(flowerbed[i] ==0){
                    boolean prev = (i == 0 || flowerbed[i - 1] ==0);
                    boolean next = (i == flowerbed.length - 1 || flowerbed[i + 1] ==0);

                    if(prev && next){
                        flowerbed[i] = 1;
                        count++;
                        i++;
                    }
                }
            }

            return count >= n;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}