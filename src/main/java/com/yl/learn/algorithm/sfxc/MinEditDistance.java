package com.yl.learn.algorithm.sfxc;

//给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
//你可以对一个单词进行如下三种操作：
//插入一个字符
//删除一个字符
//替换一个字符
//示例 1：
//
//输入：word1 = "horse", word2 = "ros"
//输出：3
//解释：
//horse -> rorse (将 'h' 替换为 'r')
//rorse -> rose (删除 'r')
//rose -> ros (删除 'e')
//示例 2：
//
//输入：word1 = "intention", word2 = "execution"
//输出：5
//解释：
//intention -> inention (删除 't')
//inention -> enention (将 'i' 替换为 'e')
//enention -> exention (将 'n' 替换为 'x')
//exention -> exection (将 'n' 替换为 'c')
//exection -> execution (插入 'u')
public class MinEditDistance {

    // 分析：
    // 将操作串转化为目标串包含对操作串的增删改三个操作
    // 对操作串的 增加可以等同于对目标串的删除，一次类推，所以题目转化为对两个串的增删改操作
    public static int minEditDistance(String op, String aim) {
        assert op != null && aim != null;
        
        op = op.trim();
        aim = aim.trim();
        
        if(op.equals("") && aim.equals("")) {
            return 0;
        }
        else if(op.equals("")) {
            return aim.length();
        }
        else if(aim.equals("")) {
            return op.length();
        }
        // 定义dp，dp[i][j] 表示 op 串1-i的子串，转化为 aim 串 1-j 子串的最小操作次数
        int dp[][] = new int[op.length() + 1][ aim.length() + 1];
        
        // 初始化目标串转化为空串的最小操作次数
        for(int i = 0; i < aim.length(); i++) {
            dp[0][i + 1] = i + 1;
        }
    
        // 初始化操作串转化为空串的最小操作次数
        for(int j = 0; j < op.length(); j++) {
            dp[j + 1][0] = j + 1;
        }
        
        for(int i = 1; i < dp.length; i++) {
            
            for(int j = 1; j < dp[i].length; j++) {
                // 操作串 i 下标、目标串 j 下标
                // dp[i - 1][j] + 1 表示当前对操作串做新增操作
                // dp[i][j - 1] + 1 表示对目标串做新增操作
                // dp[i - 1][j - 1] + 1 表示对操作串或者目标串做修改操作
                // dp[i - 1][j - 1] 表示该处字符相等，无操作
                dp[i][j] = (dp[i - 1][j] + 1) > (dp[i][j - 1] + 1) ? (dp[i][j - 1] + 1) : (dp[i - 1][j] + 1);
                dp[i][j] = (dp[i - 1][j - 1] + 1) > dp[i][j] ? dp[i][j] : (dp[i - 1][j - 1] + 1);
                if(op.charAt(i - 1) == aim.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[op.length()][aim.length()];
    }

}
