class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int longest = 1;
        int i = 0;
        int j = 1;
        set.add(s.charAt(i));
        while(j < s.length()) {    
            char current = s.charAt(j);
            if(!set.contains(current)) {
                set.add(current);
                longest = Math.max(longest, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return longest;
    }
}
