package com.yl.learn.test;

import com.yl.common.util.PrintUtil;
import com.yl.learn.algorithm.IntToRoman;
import junit.framework.TestCase;

public class IntToRomanTest extends TestCase {

    public void testIntToRoman() {
        IntToRoman intToRoman = new IntToRoman();

        PrintUtil.println(intToRoman.intToRoman(1000));
        PrintUtil.println(intToRoman.intToRoman(1230));
        PrintUtil.println(intToRoman.intToRoman(1220));
        PrintUtil.println(intToRoman.intToRoman(3010));
        PrintUtil.println(intToRoman.intToRoman(1330));
        PrintUtil.println(intToRoman.intToRoman(3999));
    }

}
