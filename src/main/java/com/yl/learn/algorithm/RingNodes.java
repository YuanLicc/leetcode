package com.yl.learn.algorithm;

import java.util.HashMap;
import java.util.Map;

public class RingNodes {

    /**
     * 判断是否有环
     * @return
     */
    public static boolean isRing(ListNode head) {
        // 参数判断
        if(head == null) {
            return false;
        }
        ListNode oneStep = head;
        ListNode twoStep = head;

        while(true) {
            // 每次访问下一个节点
            oneStep = head.next;
            if(oneStep == null) {
                return false;
            }
            // 每次访问下下个节点
            if(twoStep.next == null || twoStep.next.next == null) {
                return false;
            }
            twoStep = twoStep.next.next;
            // 判断对象相等
            if(oneStep == twoStep) {
                return true;
            }
        }
    }

    /**
     * 暴力解法
     * @param head
     * @return
     */
    public static boolean isRingViolence(ListNode head) {

        if(head == null) {
            return false;
        }
        ListNode cur = head;
        // 引入 hash 存储遍历节点
        Map<ListNode, Character> saw = new HashMap<>();

        while (cur != null) {
            if(saw.get(cur) != null) {
                return true;
            }

            saw.put(cur, 'Y');
            cur = cur.next;
        }

        return false;
    }

}
