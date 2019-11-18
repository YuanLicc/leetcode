package com.yl.learn.algorithm;
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1:
// 输入: 121
// 输出: true
//
// 示例 2:
// 输入: -121
// 输出: false
// 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//
// 示例 3:
// 输入: 10
// 输出: false
// 解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
// 进阶:
// 你能不将整数转为字符串来解决这个问题吗？
// Related Topics 数学
// leetcode submit region begin(Prohibit modification and deletion)
public class PalindromeNumber {

    /**
     * 转换为字符串前后进行比较
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        else if(x < 10) {
            return true;
        }
        String xs = String.valueOf(x);
        int length = xs.length();
        int middle = length / 2;

        for(int i = 0; i < middle; i++) {
            if(xs.charAt(i) != xs.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if(x < 0) {
            return false;
        }
        else if(x < 10) {
            return true;
        }
        else if(x == 10) return false;
        int len = 0;
        int tmp = x;
        for(; tmp > 0;) {
            tmp = tmp / 10;
            len++;
        }
        int middle = len / 2;
        for(int i = 0; i < middle; i++) {
            int leftLittle = x / (int)Math.pow(10, len - i - 1);
            int leftMax = leftLittle / 10;
            int left = leftLittle - (leftMax * 10);

            int rightLittle = x / (int)Math.pow(10, i);
            int rightMax = rightLittle / 10;
            int mole = rightMax * 10;
            int right = rightLittle % mole;

            if(left != right) {
                return false;
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion) 121121
