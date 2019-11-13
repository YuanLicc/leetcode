package com.yl.learn.test;

import com.yl.common.util.PrintUtil;
import com.yl.learn.algorithm.TwoNumberSum;
import junit.framework.TestCase;

public class TwoNumberSumTest extends TestCase {

    public void testTwoNumberSum() {
        TwoNumberSum ll = new TwoNumberSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] re = ll.twoSum(nums, target);

        for(int i : re) {
            PrintUtil.println(i);
        }
    }

}
