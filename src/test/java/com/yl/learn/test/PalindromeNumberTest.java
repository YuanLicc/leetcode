package com.yl.learn.test;

import com.yl.learn.algorithm.PalindromeNumber;
import junit.framework.TestCase;

public class PalindromeNumberTest extends TestCase {

    public void testPalindrome1() {
        System.out.println(new PalindromeNumber().isPalindrome(-1));
        System.out.println(new PalindromeNumber().isPalindrome(1));
        System.out.println(new PalindromeNumber().isPalindrome(10));
        System.out.println(new PalindromeNumber().isPalindrome(121));
        System.out.println(new PalindromeNumber().isPalindrome(122221));
        System.out.println(new PalindromeNumber().isPalindrome(1222222121));
    }

    public void testPalindrome2() {
        System.out.println(new PalindromeNumber().isPalindrome2(-1));
        System.out.println(new PalindromeNumber().isPalindrome2(1));
        System.out.println(new PalindromeNumber().isPalindrome2(10));
        System.out.println(new PalindromeNumber().isPalindrome2(121));
        System.out.println(new PalindromeNumber().isPalindrome2(122221));
        System.out.println(new PalindromeNumber().isPalindrome2(1222222121));
    }

}
