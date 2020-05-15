package com.yl.learn.test.sfxc;

import com.yl.learn.algorithm.sfxc.HereChange;
import junit.framework.TestCase;

public class HereChangeTest extends TestCase {
    
    public void testHearChange() {
        int[] coins = new int[]{2, 5, 10};
        
        System.out.println(HereChange.coinChangeRecursion(coins, 11));
        System.out.println(HereChange.coinChange(coins, 11));
    }
    
}
