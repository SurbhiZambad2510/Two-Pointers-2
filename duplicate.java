//Time Complexity : O(n)
//Space Complexity : O(1)
// tried on leetcode.

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length<=2)
            return nums.length;
        int count =1,slow=1,fast=1;
        for(int i = 1;i<nums.length;i++)
        {
        if(nums[i] == nums[i-1])
        {
            count++;
        }
        else
        {
            count = 1;
        }
            if(count<=2)
            {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
            else
            {
                fast++;
            }
            
        }
        return slow;
    }
}