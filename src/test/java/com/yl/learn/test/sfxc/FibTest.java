package com.yl.learn.test.sfxc;

import com.yl.learn.algorithm.sfxc.Fib;
import junit.framework.TestCase;

public class FibTest extends TestCase {
    
    public void testFib() {
        System.out.println(Fib.fib(20));
        System.out.println(Fib.fibRecursion(20));
        System.out.println(Fib.fibRecursionMemo(20));
    }
}
