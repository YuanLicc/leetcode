package com.yl.learn.algorithm;
// 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//
// 示例 1：
// 输入: "babad"
// 输出: "bab"
// 注意: "aba" 也是一个有效答案。
//
// 示例 2：
// 输入: "cbbd"
// 输出: "bb"
//
// Related Topics 字符串 动态规划
public class LongestPalindrome {

    /**
     * 动态规划：p(i, j) = p(i + 1, j - 1) && source.charAt(i) == source.charAt(j)
     * <ul>
     *     <li> p(i, j) 表示字符串下标 i, j 是否回文，1 是，0 否
     *     <li> 若字符串下标 i 字符 == 字符串下标 j 字符，且 p(i +1, j - 1) == 1，那么 p(i, j) 就是回文，赋值 p(i, j) = 1
     *     <li> 要想解出 p(i, j) 是否为回文，先解出 p(i + 1, j - 1)，所以，先从最小的子问题开始向上求解
     *     <li> 第一步：单个字符是回文，所以将 p(i, i) 赋值为 1，另外相邻字符 p(i, i + 1) 也可以优先进行计算
     *     <li> 第二步：第一步将 单个字符，连续两个字符都进行了求解，接下来求解连续 3 到 N（字符串长度）个字符是否回文
     *     <li> 上面是判断子串是否为回文的逻辑，要获得最长回文串，用变量记录下来即可
     * </ul>
     * @param source
     * @return
     */
    public String longestPalindrome(String source) {
        if(source == null) return "";

        int length = source.length();
        if(length <= 1) return source;
        // 最大回文长度
        int maxLength = 1;
        // 最大回文子串起始下标
        int startIndex = 0;

        int cell[][] = new int[length][length];
        // 初始化 cell，将单个字符及相邻字符进行回文判断
        for (int i = 0; i < length; i++) {
            cell[i][i] = 1;

            if(i < length - 1 && source.charAt(i) == source.charAt(i + 1)) {
                cell[i][i + 1] = 1;
                maxLength = 2;
                startIndex = i;
            }
        }
        // 从连续 3 开始求解 连续三个字符是否为回文，然后求解 3 + 1 个字符一直到 length 个字符
        for(int len = 3; len <= length; len++) {
            for(int index = 0; index <= length - len; index++) {
                // p(i, j) = p(i + 1, j - 1) && source.charAt(i) == source.charAt(j)
                if(source.charAt(index) == source.charAt(index + len - 1) && cell[index + 1][index + len - 2] == 1) {
                    cell[index][index + len - 1] = 1;

                    if(maxLength < len) {
                        maxLength = len;
                        startIndex = index;
                    }
                }
            }
        }

        return source.substring(startIndex, startIndex + maxLength);
    }

}
