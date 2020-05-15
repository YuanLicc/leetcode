package com.yl.learn.algorithm.sfxc;

// 斐波拉契
public class Fib {
    
    // 递归算法
    public static long fibRecursion(int n) {
        assert n > 0;
        
        if(n == 1 || n == 2) {
            return 1;
        }
        
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
    
    // 递归备忘录
    public static long fibRecursionMemo(int n) {
        assert  n > 0;
        long[] memo = new long[n];
        memo[0] = 1;
        memo[1] = 1;
        
        return fibRecursionMemo(n, memo);
    }
    
    private static long fibRecursionMemo(int n, long[] memo) {
        
        if(memo[n - 1] != 0) return memo[n - 1];
        
        memo[n - 1] = fibRecursionMemo(n - 1, memo) + fibRecursionMemo(n - 2, memo);
        
        return memo[n - 1];
        
    }
    
    // 非递归
    public static long fib(int n) {
        assert n > 0;
        
        if(n == 1 || n == 2) return 1;
        
        long rs = 0;
        long n_1 = 1;
        long n_2 = 1;
        
        for (int i = 3; i <= n; i++) {
            rs = n_1 + n_2;
            n_2 = n_1;
            n_1 = rs;
        }
        
        return rs;
    }
}
