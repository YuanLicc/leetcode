package com.yl.learn.algorithm;

public class ListNodeBuilder {

    /**
     * @param nodes 顺序 node values
     * @return
     */
    public static ListNode build(int[] nodes) {

        if(nodes == null || nodes.length == 0) {
            return null;
        }

        ListNode nodeHead = new ListNode(nodes[0]);
        ListNode curNode = nodeHead;

        for(int i = 1; i < nodes.length; i++) {
            ListNode node = new ListNode(nodes[i]);

            curNode.next = node;
            curNode = node;
        }

        return nodeHead;
    }

}
