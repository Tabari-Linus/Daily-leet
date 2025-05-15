//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for (int x = 0; x < nums.length; x++) {
            for (int j = x + 1; j < nums.length; j++) {
                if ((nums[x] + nums[j]) == target) {
                    results[0] = x;
                    results[1] = j;
                }
            }
        }
        return results;
    }
}
