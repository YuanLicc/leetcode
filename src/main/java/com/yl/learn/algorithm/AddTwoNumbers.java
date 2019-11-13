package com.yl.learn.algorithm;
// 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
// 示例：
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
// 输出：7 -> 0 -> 8
// 原因：342 + 465 = 807
//
// Related Topics 链表 数学

//leetcode submit region begin(Prohibit modification and deletion)
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return null;
        }


        int first = l1.val + l2.val;
        boolean isOverTen = first >= 10;
        ListNode re = new ListNode(first % 10);
        ListNode reTmp = re;

        ListNode tempL1 = l1.next;
        ListNode tempL2 = l2.next;

        while (tempL1 != null || tempL2 != null) {
            reTmp.next = new ListNode(((tempL2 != null ? tempL2.val : 0) + (tempL1 != null ? tempL1.val : 0) + (isOverTen ? 1 : 0)) % 10);
            isOverTen = (tempL2 != null ? tempL2.val : 0) + (tempL1 != null ? tempL1.val : 0) + (isOverTen ? 1 : 0) >= 10;
            tempL2 = tempL2 == null ? null : tempL2.next;
            tempL1 = tempL1 == null ? null : tempL1.next;
            reTmp = reTmp.next;
        }

        if(isOverTen) {
            reTmp.next = new ListNode(1);
        }

        return re;
    }

}

//leetcode submit region end(Prohibit modification and deletion)
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
