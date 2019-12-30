package com.yl.learn.algorithm;

/**
 * 给定一长一短两个字符串 A、B，判断 B 中字符在 A 中都存在，例子：ABCD，AD 返回 true；ABCD，AE 返回 false
 * 限制：给定字符串内字符均为 A-F 的大写字母
 */
public class ContainsChars {

    /**
     * 1）有限字符，可枚举
     * 2）素数特性：2 * 3 * 5 != 除 2、3、5 以外的素数整除
     * @param longStr
     * @param str
     * @return
     */
    public static boolean contains(String longStr, String str) {
        if(longStr == null || str == null || longStr.length() < str.length()) {
            return false;
        }
        //                       A, B, C, D, E,  F
        int[] primes = new int[]{2, 3, 5, 7, 11, 13};

        int kk = 1;

        for(int i = 0; i < longStr.length(); i++) {
            kk *= primes[longStr.charAt(i) - 'A'];
        }

        for(int i = 0; i < str.length(); i++) {
            if(kk % primes[str.charAt(i) - 'A'] != 0) {
                return false;
            }
        }

        return true;
    }
}
