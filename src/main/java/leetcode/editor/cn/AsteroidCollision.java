/**
 * 给定一个整数数组 asteroids，表示在同一行的小行星。数组中小行星的索引表示它们在空间中的相对位置。
 * <p>
 * 对于数组中的每一个元素，其绝对值表示小行星的大小，正负表示小行星的移动方向（正表示向右移动，负表示向左移动）。每一颗小行星以相同的速度移动。
 * <p>
 * 找出碰撞后剩下的所有小行星。碰撞规则：两个小行星相互碰撞，较小的小行星会爆炸。如果两颗小行星大小相同，则两颗小行星都会爆炸。两颗移动方向相同的小行星，永远不会
 * 发生碰撞。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：asteroids = [5,10,-5]
 * 输出：[5,10]
 * 解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：asteroids = [8,-8]
 * 输出：[]
 * 解释：8 和 -8 碰撞后，两者都发生爆炸。
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：asteroids = [10,2,-5]
 * 输出：[10]
 * 解释：2 和 -5 发生碰撞后剩下 -5 。10 和 -5 发生碰撞后剩下 10 。
 * <p>
 * 示例 4：
 * <p>
 * <p>
 * 输入：asteroids = [3,5,-6,2,-1,4]
 * 输出：[-6,2,4]
 * 解释：小行星 -6 使小行星 3 和 5 爆炸，然后继续向左移动。在另一边，小行星 2 使小行星 -1 爆炸，然后继续向右移动，没有碰撞小行星 4。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 2 <= asteroids.length <= 10⁴
 * -1000 <= asteroids[i] <= 1000
 * asteroids[i] != 0
 * <p>
 * <p>
 * Related Topics 栈 数组 模拟 👍 562 👎 0
 */

package leetcode.editor.cn;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        Solution solution = new AsteroidCollision().new Solution();
        System.out.println(solution.asteroidCollision(new int[]{10, 2, -5}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack = new Stack<>();

            for (int asteroid : asteroids) {
                boolean destroyed = false;

                while(!stack.isEmpty() && stack.peek() > 0 && asteroid < 0){
                    int top = stack.peek();
                    if(Math.abs(top) > Math.abs(asteroid)) {
                        destroyed = true;
                        break;
                    } else if(Math.abs(top) < Math.abs(asteroid)){
                        stack.pop();
                    } else {
                        stack.pop();
                        destroyed = true;
                        break;
                    }
                }

                if(!destroyed){
                    stack.push(asteroid);
                }
            }

            return stack.stream().mapToInt(Integer::intValue).toArray();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}