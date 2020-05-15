package com.yl.learn.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MinCoverSubstr {
    
    public static String minCover(String op, String aim) {
        
        assert op != null && aim != null;
        
        op = op.trim();
        aim = aim.trim();
        
        int left = 0;
        int right = 0;
        
        while (right < op.length() - 1) {
            
            while(right < op.length() && !isContains(op, aim, left, right)) {
                right++;
            }
            
            while (left < right && isContains(op, aim, left, right)) {
                left++;
            }
        
            System.out.println(left - 1 + "：" + right);
            
        }
        
        return "";
    }
    
    private static boolean isContains(String op, String aim, int start, int end) {
        Map<Character, Integer> rs = new HashMap<>(end - start + 1);
        
        int index = start;
        while (index <= end) {
            rs.put(op.charAt(index++), 1);
        }
        
        index = 0;
        
        while (index < aim.length()) {
            if(rs.get(aim.charAt(index++)) == null) {
                return false;
            }
        }
        return true;
    }
    
}
