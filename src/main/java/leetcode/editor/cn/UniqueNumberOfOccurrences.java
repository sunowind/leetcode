/**
 * 给你一个整数数组 arr，如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：arr = [1,2]
 * 输出：false
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * 输出：true
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 * <p>
 * <p>
 * Related Topics 数组 哈希表 👍 246 👎 0
 */

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        Solution solution = new UniqueNumberOfOccurrences().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int num : arr){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            return map.size() == new HashSet<>(map.values()).size();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}