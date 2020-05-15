package com.yl.learn.algorithm;

public class Xx {
    
    public static void main(String[] args){
        int m = 100;
        
        int min = Integer.MAX_VALUE;
        int minN = 0;
        
        for(int i = 10; i < 50; i++) {
            
            int n = 100 % i == 0 ? 100 / i : 100 / i + 1;
            
            int max = 100 % i == 0 ? n + i : (n - 1) + i;
            
            if(min > max) {
                min = max;
                minN = i;
            }
        }
        
        System.out.println(min + ":" + minN);
    }
}
