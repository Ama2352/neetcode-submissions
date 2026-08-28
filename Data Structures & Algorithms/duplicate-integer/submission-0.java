class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> freq = new HashSet<>();
        for(int k : nums) {
            if(freq.contains(k)) return true;
            freq.add(k);
        }
        return false;
    }
}