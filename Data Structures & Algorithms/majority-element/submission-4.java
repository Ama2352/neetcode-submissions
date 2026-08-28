class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq = 1;
        int target = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(target != nums[i]) {
                if(freq > nums.length / 2) {
                    return target;
                }
                target = nums[i];
                freq = 1;
            } else {
                freq++;
            }
        }
        
        return target;
    }
}