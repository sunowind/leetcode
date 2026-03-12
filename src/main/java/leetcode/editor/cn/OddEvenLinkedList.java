/**
 * 给定单链表的头节点 head ，将所有索引为奇数的节点和索引为偶数的节点分别分组，保持它们原有的相对顺序，然后把偶数索引节点分组连接到奇数索引节点分组之后，返回
 * 重新排序的链表。
 * <p>
 * 第一个节点的索引被认为是 奇数 ， 第二个节点的索引为 偶数 ，以此类推。
 * <p>
 * 请注意，偶数组和奇数组内部的相对顺序应该与输入时保持一致。
 * <p>
 * 你必须在 O(1) 的额外空间复杂度和 O(n) 的时间复杂度下解决这个问题。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入: head = [1,2,3,4,5]
 * 输出: [1,3,5,2,4]
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入: head = [2,1,3,5,6,4,7]
 * 输出: [2,3,6,7,1,5,4]
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * n == 链表中的节点数
 * 0 <= n <= 10⁴
 * -10⁶ <= Node.val <= 10⁶
 * <p>
 * <p>
 * Related Topics 链表 👍 869 👎 0
 */

package leetcode.editor.cn;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        Solution solution = new OddEvenLinkedList().new Solution();

    }
    //leetcode submit region begin(Prohibit modification and deletion)

//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode() {
//        }
//
//        ListNode(int val) {
//            this.val = val;
//        }
//
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;

                even.next = odd.next;
                even = even.next;
            }

            odd.next = evenHead;
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}