/**
 * 给你一个下标从 0 开始、大小为 n x n 的整数矩阵 grid ，返回满足 Ri 行和 Cj 列相等的行列对 (Ri, Cj) 的数目。
 * <p>
 * 如果行和列以相同的顺序包含相同的元素（即相等的数组），则认为二者是相等的。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：grid = [[3,2,1],[1,7,6],[2,7,7]]
 * 输出：1
 * 解释：存在一对相等行列对：
 * - (第 2 行，第 1 列)：[2,7,7]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
 * 输出：3
 * 解释：存在三对相等行列对：
 * - (第 0 行，第 0 列)：[3,1,2,2]
 * - (第 2 行, 第 2 列)：[2,4,2,2]
 * - (第 3 行, 第 2 列)：[2,4,2,2]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * n == grid.length == grid[i].length
 * 1 <= n <= 200
 * 1 <= grid[i][j] <= 10⁵
 * <p>
 * <p>
 * Related Topics 数组 哈希表 矩阵 模拟 👍 103 👎 0
 */

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        Solution solution = new EqualRowAndColumnPairs().new Solution();
        System.out.println(solution.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int equalPairs(int[][] grid) {
            int res = 0;

            Map<String, Integer> map = new HashMap<>();

            for(int[] row:  grid){
                String rowStr = Arrays.toString(row);
                map.put(rowStr, map.getOrDefault(rowStr, 0) + 1);
            }

            for(int j = 0; j < grid[0].length; j++){
                int[] column = new int[grid.length];
                for(int i = 0; i < grid.length; i++){
                    column[i] = grid[i][j];
                }
                String columnStr = Arrays.toString(column);
                res += map.getOrDefault(columnStr, 0);
            }

            return res;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}