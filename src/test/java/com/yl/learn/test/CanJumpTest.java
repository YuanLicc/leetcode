package com.yl.learn.test;

import com.yl.learn.algorithm.CanJump;
import junit.framework.TestCase;

public class CanJumpTest extends TestCase {

    public void testCanJump() {
        System.out.println(new CanJump().canJump(new int[]{1,2,3}));
        System.out.println(new CanJump().canJump(new int[]{2,3,1,1,4}));
        System.out.println(new CanJump().canJump(new int[]{3,2,1,0,4}));
        System.out.println(new CanJump().canJump(new int[]{3,2,2,0,4}));
        System.out.println(new CanJump().canJump(new int[]{3,3,0,0,4}));
    }

}
