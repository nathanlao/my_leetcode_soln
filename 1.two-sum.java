/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // condition 1: elements add up to target (for loop)
        // condition 2: can not use the same element twice (nums[i] != nums[j])
        // condition 3: retrun the the index of those 2 elements 
        int[] resultArray = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                }
            }
        }
        return resultArray;
    }
}
// @lc code=end

