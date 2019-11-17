package com.yl.learn.test;

import com.yl.common.util.PrintUtil;
import com.yl.learn.algorithm.LongestPalindrome;
import junit.framework.TestCase;

public class LongestPalindromeTest extends TestCase {

    public void testLongest() {
        PrintUtil.printlnLine();
        PrintUtil.printlnLine("\"\" :", new LongestPalindrome().longestPalindrome(""));
        PrintUtil.printlnLine();
        PrintUtil.printlnLine("\" \" :", new LongestPalindrome().longestPalindrome(" "));
        PrintUtil.printlnLine();
        PrintUtil.printlnLine("\"a\" :", new LongestPalindrome().longestPalindrome("a"));
        PrintUtil.printlnLine();
        PrintUtil.printlnLine("\"aaaa\" :", new LongestPalindrome().longestPalindrome("aaaa"));
        PrintUtil.printlnLine();
        PrintUtil.printlnLine("\"addaaa\" :", new LongestPalindrome().longestPalindrome("addaaa"));
        PrintUtil.printlnLine();
        PrintUtil.printlnLine("\"aassaa\" :", new LongestPalindrome().longestPalindrome("aassaa"));
        PrintUtil.printlnLine();
        PrintUtil.printlnLine("\"aahhsaa\" :", new LongestPalindrome().longestPalindrome("aahhsaa"));
        PrintUtil.printlnLine();
        PrintUtil.printlnLine("\"asdasdaaaa\" :", new LongestPalindrome().longestPalindrome("asdasdaaaa"));
    }

}
