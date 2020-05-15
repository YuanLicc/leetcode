package com.yl.learn.algorithm.sfxc;

// 找零钱
// 给你 k 种面值的硬币，面值分别为 c1, c2 ... ck，每种硬币的数量无限，
// 再给一个总金额 amount。
// 最少需要几枚硬币凑出这个金额？如果不可能凑出，算法返回 -1
public class HereChange {
    
    // f(n) 表示 金额 n 的最小硬币数量
    // f(n) = min(f(n - coin)) + 1
    public static int coinChangeRecursion(int[] coins, int amount) {
        
        if(amount < 0) {
            return -1;
        }
        
        if(amount == 0) {
            return 0;
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < coins.length; i++) {
            int cnt = coinChangeRecursion(coins, amount - coins[i]);
            
            if(cnt >= 0) {
                min = ++cnt < min ? cnt : min;
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    
    
    public static int coinChange(int[] coins, int amount) {
        if(amount < 0) {
            return -1;
        }
        
        int[] cnts = new int[amount + 1];
        cnts[0] = 0;
        
        for(int i = 1; i <= amount; i++) {
            
            int min = Integer.MAX_VALUE;
            
            for(int j = 0; j < coins.length; j++) {
                int index = i - coins[j];
                
                if(index >= 0 && min > cnts[index] && cnts[index] != -1) {
                    min = cnts[index];
                }
            }
            
            cnts[i] = min == Integer.MAX_VALUE ? -1 : min + 1;
        }
        
        return cnts[amount];
    }
}
