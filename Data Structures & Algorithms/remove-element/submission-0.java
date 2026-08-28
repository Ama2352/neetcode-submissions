class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for(int n : nums) {
            if(n != val) list.add(n);
        }
        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}