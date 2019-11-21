package com.yl.learn.test;

import com.yl.common.util.PrintUtil;
import com.yl.learn.algorithm.IntToRoman;
import com.yl.learn.algorithm.RomanToInt;
import junit.framework.TestCase;

public class RomanToIntTest extends TestCase {

    public void testRomanToInt() {
        RomanToInt romanToInt = new RomanToInt();
        IntToRoman intToRoman = new IntToRoman();

        PrintUtil.println(romanToInt.romanToInt(intToRoman.intToRoman(1000)));
        PrintUtil.println(romanToInt.romanToInt(intToRoman.intToRoman(1230)));
        PrintUtil.println(romanToInt.romanToInt(intToRoman.intToRoman(1220)));
        PrintUtil.println(romanToInt.romanToInt(intToRoman.intToRoman(3010)));
        PrintUtil.println(romanToInt.romanToInt(intToRoman.intToRoman(1330)));
        PrintUtil.println(romanToInt.romanToInt(intToRoman.intToRoman(3999)));
    }

}
