package com.yl.learn.algorithm;

/**
 * 给定字符数组，将给定个数的字符移动到末尾，如：12345 移动两个字符 => 34512
 */
public class MoveCharacters {

    /**
     * 三步翻转法
     * @param chars 给定字符数组
     * @param n     给定长度
     */
    public static void move(char[] chars, int n) {

        if(chars == null || n <= 0 || chars.length <= n) {
            return;
        }

        // 1. 12345 => 54321
        reverse(chars, 0, chars.length - 1);

        // 2. 54321 => 34521
        reverse(chars, 0, chars.length - n);

        // 3. 34521 => 34512
        reverse(chars, chars.length - n + 1, chars.length - 1);
    }

    private static void reverse(char[] chars, int start, int end) {

        if(start >= end) return;

        int i = start; // 1
        int j = end; // 3
        int middle = (i + j) / 2; // 2

        for(; i <= middle; i++) {
            char tmp = chars[end - (i - start)];

            chars[end - (i - start)] = chars[i];

            chars[i] = tmp;
        }
    }

}
