package com.yl.learn.algorithm;

// 两个玻璃球一模一样，从楼上丢球操作中，已知两个球在 1-100 层楼之间会碎掉
// 请使用两个球找出最小会破碎的楼层
public class TwoBallJump {
    
    // 等间隔法，非最优解
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
