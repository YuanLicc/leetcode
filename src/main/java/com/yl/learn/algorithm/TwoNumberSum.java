package com.yl.learn.algorithm;

// 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
// 因为 nums[0] + nums[1] = 2 + 7 = 9
// 所以返回 [0, 1]
//
// Related Topics 数组 哈希表


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
public class TwoNumberSum {
    // 普通方法：遍历数组，首次遍历到 2，将 2 与后续的 7，11，15 求和，若求和等于目标数则输出。最坏复杂度：(n - 1) + (n - 2) + ... + 1 = (n^2 - n) / 2
    // 空间换时间：利用哈希表类数组的查询速度，将已经查询的值/或者与目标值的差值作为key，数组内下标作为 value，
    // 在遍历过程只需将当前值与目标值的差值/或者当前值作为 key 查询哈希表，若存在有效值则标识当前值与哈希表value下标的值求和等于目标值
    public int[] twoSum(int[] nums, int target) {

        if(nums == null || nums.length < 2) {
            return  null;
        }
        // Map<target - nums[i], i>
        Map<Integer, Integer> minusMap = new HashMap<>(nums.length);

        minusMap.put(target - nums[0], 0);

        for(int i = 1; i < nums.length; i++) {
            if(minusMap.get(nums[i]) != null) {
                return new int[]{minusMap.get(nums[i]), i};
            }
            minusMap.put(target - nums[i], i);
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
